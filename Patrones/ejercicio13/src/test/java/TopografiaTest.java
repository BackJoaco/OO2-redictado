import com.patterns.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TopografiaTest {
    private InterTopo topografia1;
    private InterTopo topografia2;
    private InterTopo topografia3;
    private InterTopo topografia4;

    @Before
    public void setUp() throws Exception{
        topografia1 = new Topografia(1);
        topografia2 = new Topografia(0);
        topografia3 = new TopografiaMixta(topografia1, topografia2, topografia2, topografia1);
        topografia4 = new TopografiaMixta(topografia1, topografia2, topografia1, topografia3);
    }

    @Test
    public void calcularProporcionesTest(){
        assertTrue(topografia1.calcularProporcion() ==  1);
        assertTrue(topografia2.calcularProporcion() ==  0);
        assertTrue(topografia3.calcularProporcion() ==  0.5);
        assertTrue(topografia4.calcularProporcion() == 0.625);
    }
}
