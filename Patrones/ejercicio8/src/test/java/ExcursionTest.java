import com.patterns.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class ExcursionTest {
    private Excursion excursion;
    private Usuario joaco;
    private Usuario cristal;
    private Usuario mati;

    @Before
    public void setUp() throws Exception {
        excursion = new Excursion(
            "Dos dias en kayak bajando el Paraná",
            LocalDate.of(2025, 10, 18),
            LocalDate.of(2025, 10, 20),
            "Casa de Joaco",
            100,
            1,
            3);
        joaco = new Usuario("garicano@gmail.com", "Joaquin", "Garicano");
        cristal = new Usuario ("andrade@gmail.com", "Cristal", "Andrade");
        mati = new Usuario("frassone@gmail.com", "mati", "Frassone");
    }

    @Test
    public void estadoProvisorioTest(){
        assertEquals(excursion.obtenerInformacion(), "Nombre: Dos dias en kayak bajando el Paraná; Costo: 100.0; Fechas: 2025-10-18 - 2025-10-20; Punto de encuentro: Casa de Joaco\r\n" + //
                        "Cantidad de usuarios faltantes para llegar al cupo minimo: 1");
    }

    @Test
    public void estadoDefinitoTest(){
        excursion.inscribir(joaco);
        excursion.inscribir(cristal);
        assertEquals(excursion.obtenerInformacion(), "Nombre: Dos dias en kayak bajando el Paraná; Costo: 100.0; Fechas: 2025-10-18 - 2025-10-20; Punto de encuentro: Casa de Joaco\r\n" + //
                        "garicano@gmail.com\r\n" + //
                        "andrade@gmail.com");
    }

    @Test
    public void estadoNegocionTest(){
        excursion.inscribir(joaco);
        excursion.inscribir(cristal);
        excursion.inscribir(mati);
        assertEquals(excursion.obtenerInformacion(), "Nombre: Dos dias en kayak bajando el Paraná; Costo: 100.0; Fechas: 2025-10-18 - 2025-10-20; Punto de encuentro: Casa de Joaco");
    }
}
