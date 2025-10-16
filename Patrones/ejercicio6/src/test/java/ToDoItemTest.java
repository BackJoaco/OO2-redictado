import com.patterns.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToDoItemTest {
    private ToDoItem t;

    @Before
    public void setUp() throws Exception {
        t = new ToDoItem("Test");
    }

    @Test
    public void testInitialStateIsPendingAndOperationsFail() {
        assertEquals("Test", t.getNombre());
        // initial duracion should be 1 (constructor behavior)
        assertEquals(1, t.getDuracion());

        // workedTime on Pending should throw
        try {
            t.workedTime();
            fail("workedTime() on Pending should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem aun no ha iniciado", e.getMessage());
        }

        // togglePause on Pending should throw
        try {
            t.togglePause();
            fail("togglePause() on Pending should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem no se encuentra en pause o in-progress", e.getMessage());
        }

        // finish on Pending should throw
        try {
            t.finish();
            fail("finish() on Pending should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem no se encuentra en pause o in-progress", e.getMessage());
        }
    }

    @Test
    public void testAddCommentInPendingSetsComment() {
        assertNull(t.comentario);
        t.addComment("first comment");
        assertEquals("first comment", t.comentario);
    }

    @Test
    public void testStartTransitionsToInProgressAndWorkedTime() {
        int before = t.getDuracion();
        t.start();
        // start should have increased duracion by 1 via setEstado
        assertEquals(before + 1, t.getDuracion());
        // workedTime in InProgress should return current duracion
        assertEquals(t.getDuracion(), t.workedTime());

        // adding a comment in progress should set comentario
        t.addComment("in-progress comment");
        assertEquals("in-progress comment", t.comentario);
    }

    @Test
    public void testPauseResumeAndDurationCounting() {
        // sequence: start -> togglePause -> togglePause -> finish
        assertEquals(1, t.getDuracion());
        t.start(); // duracion -> 2
        assertEquals(2, t.getDuracion());

        t.togglePause(); // duracion -> 3 (Paused)
        assertEquals(3, t.getDuracion());

        t.togglePause(); // duracion -> 4 (InProgress)
        assertEquals(4, t.getDuracion());

        t.finish(); // duracion -> 5 (Finished)
        assertEquals(5, t.getDuracion());
    }

    @Test
    public void testFinishedForbidsOperations() {
        t.start();
        t.finish();

        // Once finished, many operations should throw
        try {
            t.start();
            fail("start() on Finished should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem se encuentra finalizado", e.getMessage());
        }

        try {
            t.togglePause();
            fail("togglePause() on Finished should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem se encuentra finalizado", e.getMessage());
        }

        try {
            t.finish();
            fail("finish() on Finished should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem ya se encuentra finalizado", e.getMessage());
        }

        try {
            t.addComment("should fail");
            fail("addComment() on Finished should throw");
        } catch (RuntimeException e) {
            assertEquals("El ToDoItem ya se encuentra finalizado", e.getMessage());
        }
    }

    @Test
    public void testDirectSetCommentAndNameAccessors() {
        t.setComment("direct comment");
        assertEquals("direct comment", t.comentario);
        assertEquals("Test", t.getNombre());
    }
}
