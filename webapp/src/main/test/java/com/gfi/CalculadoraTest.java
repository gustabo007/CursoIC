package com.gfi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Calculadora 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Calculadoramvn( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculadoraTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void sumarPositivosTest()
    {
        int resultadoEsperado = 14;
        int resultado = Calculadora.suma(9,5);
        assertEquals(resultado, resultadoEsperado);
    }
}
