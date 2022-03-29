/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Ibanez_David_PROG06_Practica;


import static Ibanez_David_PROG06_Practica.Ibanez_Sanchez_David_Prog06.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class Ibanez_Sanchez_David_Prog06Test {
    
    public Ibanez_Sanchez_David_Prog06Test() {
    }


    /**
     * Test of inicializarPartida method, of class Ibanez_Sanchez_David_Prog06.
     */
    @Test
    public void testInicializarPartida() {
        System.out.println("inicializarPartida");
        int[][] expResult = null;
        int[][] result = Ibanez_Sanchez_David_Prog06.inicializarPartida();
        assertArrayEquals(expResult, result);
// No se puede hacer porque el Math.Random  no se puede probar el el Junit.
    }

    /**
     * Test of simbolo method, of class Ibanez_Sanchez_David_Prog06.
     */
    @Test
    public void testSimbolo() {
        System.out.println("simbolo");
        char expResult = ' ';
        char result = Ibanez_Sanchez_David_Prog06.simbolo();
        assertEquals(expResult, result);
        // No se puede hacer porque el Math.Random  no se puede probar el el Junit.
    }



    /**
     * Test of evaluarExpresionArray method, of class Ibanez_Sanchez_David_Prog06.
     */
    @Test
    public void testEvaluarExpresionArray() {
        System.out.println("evaluarExpresionArray");
        String[] exp =  {"8","*","4","+","9","-","5","+","7"} ;
        int expResult = 43;
        int result = Ibanez_Sanchez_David_Prog06.evaluarExpresionArray(exp);
        assertEquals(expResult, result);

    }

    /**
     * Test of comprobarRespuesta method, of class Ibanez_Sanchez_David_Prog06.
     */
    @Test
    public void testComprobarRespuesta() {
        System.out.println("comprobarRespuesta");
        int respuesta = 0;
        String pregunta = "";
        boolean expResult = false;
        boolean result = Ibanez_Sanchez_David_Prog06.comprobarRespuesta(respuesta, pregunta);
        assertEquals(expResult, result);

    }
}
