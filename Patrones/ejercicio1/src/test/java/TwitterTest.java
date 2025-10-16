import com.patterns.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwitterTest {
    private Twitter twitter;

    @Before
    public void setUp() {
        twitter = new Twitter();
    }

    @Test
    public void testCrearYEliminarUsuario() {
        // crear usuario nuevo
        assertTrue(twitter.crearUsuario("alice"));
        // crear usuario duplicado debe fallar
        assertFalse(twitter.crearUsuario("alice"));
        // eliminar usuario inexistente devuelve false
        assertFalse(twitter.eliminarUsuario("bob"));
        // eliminar usuario existente devuelve true
        assertTrue(twitter.eliminarUsuario("alice"));
        // tras eliminar se puede crear de nuevo
        assertTrue(twitter.crearUsuario("alice"));
    }

    @Test
    public void testUsuarioTweetearValidaciones() {
        Usuario u = new Usuario("user1");

        // texto vacío no debe permitirse
        assertFalse(u.tweetear(""));

        // texto demasiado largo (281 chars) no permitido
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 281; i++) sb.append('x');
        assertFalse(u.tweetear(sb.toString()));

        // texto válido
        assertTrue(u.tweetear("Hola mundo"));
    }

    @Test
    public void testTweetYReTweetUsuario() {
        Usuario autor = new Usuario("autor");
        Usuario retweeter = new Usuario("rtuser");

        // crear un Tweet directamente y comprobar su usuario
        Tweet t = new Tweet(autor, "original");
        assertEquals(autor, t.getUsuario());

        // crear ReTweet y comprobar origen y usuario
        ReTweet rt = new ReTweet(retweeter, t);
        assertEquals(retweeter, rt.getUsuario());
        assertEquals(t, rt.getOrigen());
    }
}
