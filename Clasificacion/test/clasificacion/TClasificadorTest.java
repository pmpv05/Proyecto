/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacion;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TClasificadorTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
    }

    /**
     * Test of ordenarPorInsercion method, of class TClasificador.
     */
    @Test
    public void testOrdenarPorInsercion() {
        System.out.println("Ordenación por Inserción");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};

        TClasificador instance = new TClasificador();
        int[] expResult = {1, 1, 2, 3, 5, 6, 7, 8};
        int[] result = instance.ordenarPorInsercion(datosParaClasificar);
        System.out.println("");

        assertArrayEquals(expResult, result);
    }

    @Test
    public void testOrdenarPorShell() {
        System.out.println("ShellSort");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};
        TClasificador instance = new TClasificador();
        int[] expResult = {1, 1, 2, 3, 5, 6, 7, 8};
        int[] result = instance.ordenarPorShell(datosParaClasificar);
        System.out.println("");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testOrdenarPorBurbuja() {
        System.out.println("Ordenación por Burbuja");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};

        TClasificador instance = new TClasificador();
        int[] expResult = {1, 1, 2, 3, 5, 6, 7, 8};
        int[] result = instance.ordenarPorBurbuja(datosParaClasificar);
        System.out.println("");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testOrdenarPorQuickSort() {
        System.out.println("QuickSort");
        int[] datosParaClasificar = {2,4,3,9,10,7,6,5};

        TClasificador instance = new TClasificador();
        int[] expResult = {2,3,4,5,6,7,9,10};
        int[] result = instance.ordenarPorQuickSort(datosParaClasificar);
        System.out.println("");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testOrdenarPorSeleccion() {
        System.out.println("Ordenación por selección");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};

        TClasificador instance = new TClasificador();
        int[] expResult = {1, 1, 2, 3, 5, 6, 7, 8};
        int[] result = instance.ordenarPorSeleccion(datosParaClasificar);
        System.out.println("");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testOrdenarPorHeapSort() {
        System.out.println("HeapSort");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};

        TClasificador instance = new TClasificador();
        int[] expResult = {8, 7, 6, 5, 3, 2, 1, 1};
        int[] result = instance.ordenarPorHeapSort(datosParaClasificar);
        System.out.println("");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testOrdenarArrayList() {
        System.out.println("Ordenar ArrayList");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};

        int[] datosOrdenados = {1, 1, 2, 3, 5, 6, 7, 8};
        TClasificador instance = new TClasificador();
        ArrayList expResult = new ArrayList();
        for (int i : datosOrdenados) {
            expResult.add(i);
        }
        ArrayList result = instance.tiempoArrayList(datosParaClasificar);
        System.out.println("");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testOrdenarLinkedList() {
        System.out.println("Ordenar LinkedList");
        int[] datosParaClasificar = {2, 5, 1, 1, 8, 3, 7, 6};

        int[] datosOrdenados = {1, 1, 2, 3, 5, 6, 7, 8};
        TClasificador instance = new TClasificador();
        LinkedList expResult = new LinkedList();
        for (int i : datosOrdenados) {
            expResult.add(i);
        }
        LinkedList result = instance.tiempoLinkedList(datosParaClasificar);
        System.out.println("");
        assertEquals(expResult, result);
    }

    /**
     * Test of estaOrdenadoAcendentemente method, of class TClasificador.
     */
    @Test
    public void testEstaOrdenadoAcendentemente() {
        System.out.println("estaOrdenadoAcendentemente");
        int[] vector = {2, 5, 1, 1, 8, 3, 7, 6};
        TClasificador instance = new TClasificador();
        Boolean expResult = false;
        Boolean result = instance.estaOrdenadoAcendentemente(vector);
        assertEquals(expResult, result);
    }

    /**
     * Test of estaOrdenadoDescendentemente method, of class TClasificador.
     */
    @Test
    public void testEstaOrdenadoDescendentemente() {
        System.out.println("estaOrdenadoDescendentemente");
        int[] vector = {2, 5, 1, 1, 8, 3, 7, 6};
        TClasificador instance = new TClasificador();
        Boolean expResult = false;
        Boolean result = instance.estaOrdenadoDescendentemente(vector);
        assertEquals(expResult, result);
    }
}
