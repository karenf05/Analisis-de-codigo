

/**
 * The test class testEcuacionCuadratica.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testEcuacionCuadratica extends junit.framework.TestCase
{
    /**
     * Default constructor for test class testEcuacionCuadratica
     */
    public testEcuacionCuadratica()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    public void testEcuacion()
    {
        EcuacionCuadratica cuadr= new EcuacionCuadratica(0,3,4);
        assertEquals("ERROR no es una ecuacion cuadratica",cuadr.resolverEcuacion());
    }
    public void testEcuacionDistinta()
    {
        EcuacionCuadratica cuadr= new EcuacionCuadratica(4,9,4);
        assertEquals("raices reales distintas: x1= " + -0.6096117967977924 + " x2= " + -1.6403882032022077,cuadr.resolverEcuacion());
    }
     public void testEcuacionIguales()
    {
        EcuacionCuadratica cuadr= new EcuacionCuadratica(3,6,3);
        assertEquals("raices reales iguales: x1= " + -1.0 + " x2= " + -1.0,cuadr.resolverEcuacion());
    }
     public void testEcuacionConjugadas()
    {
        EcuacionCuadratica cuadr= new EcuacionCuadratica(4,2,6);
        assertEquals("raices complejas con  jugadas: xr= " + -0.25 + " xi= " + 1.1989578808281798 + " y xr= " + -0.25 + " -xi= " + (-1.1989578808281798),cuadr.resolverEcuacion());
    }
    
}
