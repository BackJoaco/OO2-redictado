
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.patterns.*;
import com.patterns.Decorator.Extension;
import com.patterns.Decorator.FechaCreacion;
import com.patterns.Decorator.Nombre;
import com.patterns.Decorator.Permisos;
import com.patterns.Decorator.Tamano;

public class ArchivoTest {
    private FileOO2 archivo;

    @Before
    public void setUp() throws Exception{
        archivo = new Archivo("Gabi", "pdf", 5);
    }

    @Test
    public void nombreExtensionTest(){
        archivo = new Nombre(archivo);
        archivo = new Extension(archivo);
        assertTrue(archivo.prettyPrint() == "Gabi - pdf");
    }

    @Test
    public void nombreExtensionFechaCreacionTest(){
        archivo = new Nombre(archivo);
        archivo = new Extension(archivo);
        archivo = new FechaCreacion(archivo);
        assertTrue(archivo.prettyPrint() == "Gabi - pdf - " + LocalDate.now());
    }

    @Test
    public void permisosNombreExtensionTamaño(){
        archivo.agregarPermisos("edicion");
        archivo = new Permisos(archivo);
        archivo = new Nombre(archivo);
        archivo = new Extension(archivo);
        archivo = new Tamano(archivo);
        assertTrue(archivo.prettyPrint() == "edicion - Gabi - pdf - 5");
    }
}
