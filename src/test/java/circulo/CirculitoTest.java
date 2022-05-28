package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CirculitoTest {
    
    public CirculitoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test del metodo setCoordenadaX de la clase Circulito.
     */
    @Test
    public void testSetCoordenadaX() {
        System.out.println("setCoordenadaX");
        int valorX = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaX(valorX);

    }

    /**
     * Test del metodo getCoordenadaX de la clase Circulito.
     */
    @Test
    public void testGetCoordenadaX() {
        System.out.println("getCoordenadaX");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);

    }

    /**
     * Test del metodo setCoordenadaY de la clase Circulito.
     */
    @Test
    public void testSetCoordenadaY() {
        System.out.println("setCoordenadaY");
        int valorY = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaY(valorY);

    }

    /**
     * Test del metodo getCoordenadaY de la clase Circulito.
     */
    @Test
    public void testGetCoordenadaY() {
        System.out.println("getCoordenadaY");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);

    }

    /**
     * Test del metodo setRadio de la clase Circulito.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        Circulito instance = new Circulito();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
    }

    /**
     * Test del metodo getRadio de la clase Circulito.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0;
        double result = instance.getRadio();
        assertEquals(0.1, result, 1e-6);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,1e-6);
    }

    /**
     * Test del metodo obtenerDiametro de la clase Circulito.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0;
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,1e-6);

    }

    /**
     * Test del metodo obtenerCircunferencia de la clase Circulito.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.6283185;;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result, 1e-6);

    }

    /**
     * Test del metodo obtenerAreaCirculo de la clase Circulito.
     */
    @Test
    public void testObtenerAreaCirculo() {
        System.out.println("obtenerArea");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult =  0.0314159;
        double result = instance.obtenerAreaCirculo();
        assertEquals(expResult, result, 1e-6);

    }


    /**
     * Test del metodo trasladarCentro de la clase Circulito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
  Circulito instance = new Circulito();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 5);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+5, resultny);

    }
    
}
