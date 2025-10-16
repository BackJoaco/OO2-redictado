import com.patterns.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JugadaTest {
    private Jugada j1;
    private Jugada j2;
    private Jugada j3;

    @Before
    public void setUp() throws Exception{
        j1 = new Piedra();
        j2 = new Papel();
        j3 = new Tijera();
    }

    @Test
    public void jugarConPiedraTest(){
        assertEquals(j1.jugarContra(j2), "Perdiste");
        assertEquals(j1.jugarContra(j3), "Ganaste");
        assertEquals(j1.jugarContra(j1), "Empate");
    }

    @Test
    public void jugarConPapelTest(){
        assertEquals(j2.jugarContra(j3), "Perdiste");
        assertEquals(j2.jugarContra(j1), "Ganaste");
        assertEquals(j2.jugarContra(j2), "Empate");
    }
    @Test
    public void jugarConTijeraTest(){
        assertEquals(j3.jugarContra(j1), "Perdiste");
        assertEquals(j3.jugarContra(j2), "Ganaste");
        assertEquals(j3.jugarContra(j3), "Empate");
    }
}
