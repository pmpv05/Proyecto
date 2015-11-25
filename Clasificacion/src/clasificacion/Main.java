package clasificacion;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        GeneradorDatosGenericos generador = new GeneradorDatosGenericos();
        int[] alea = generador.generarDatosAleatorios(300);
        int[] des = generador.generarDatosDescendentes(300);
        int[] asc = generador.generarDatosAscendentes(300);

        int[] alea2 = generador.generarDatosAleatorios(3000);
        int[] des2 = generador.generarDatosDescendentes(3000);
        int[] asc2 = generador.generarDatosAscendentes(3000);

        int[] alea3 = generador.generarDatosAleatorios(30000);
        int[] des3 = generador.generarDatosDescendentes(30000);
        int[] asc3 = generador.generarDatosAscendentes(30000);

        TClasificador clasificar = new TClasificador();

        System.out.println("Los tiempos están en milisegundos.\n");
        
        System.out.println("----------- INSERCIÓN (Datos aleatorios) -----------");
        System.out.println("Tiempo Inserción Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 1));
        System.out.println("Tiempo Inserción Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 1));
        System.out.println("Tiempo Inserción Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 1));
        System.out.println("----------- INSERCIÓN (Datos ascendentes) -----------");
        System.out.println("Tiempo Inserción Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 1));
        System.out.println("Tiempo Inserción Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 1));
        System.out.println("Tiempo Inserción Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 1));
        System.out.println("----------- INSERCIÓN (Datos descendentes) -----------");
        System.out.println("Tiempo Inserción Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 1));
        System.out.println("Tiempo Inserción Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 1));
        System.out.println("Tiempo Inserción Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 1));
        
        System.out.println("----------- SHELLSORT (Datos aleatorios) -----------");
        System.out.println("Tiempo ShellSort Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 2));
        System.out.println("Tiempo ShellSort Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 2));
        System.out.println("Tiempo ShellSort Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 2));
        System.out.println("----------- SHELLSORT (Datos ascendentes) -----------");
        System.out.println("Tiempo ShellSort Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 2));
        System.out.println("Tiempo ShellSort Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 2));
        System.out.println("Tiempo ShellSort Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 2));
        System.out.println("----------- SHELLSORT (Datos descendentes) -----------");
        System.out.println("Tiempo ShellSort Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 2));
        System.out.println("Tiempo ShellSort Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 2));
        System.out.println("Tiempo ShellSort Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 2));

        System.out.println("----------- BURBUJA (Datos aleatorios) -----------");
        System.out.println("Tiempo Burbuja Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 3));
        System.out.println("Tiempo Burbuja Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 3));
        System.out.println("Tiempo Burbuja Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 3));
        System.out.println("----------- BURBUJA (Datos ascendentes) -----------");
        System.out.println("Tiempo Burbuja Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 3));
        System.out.println("Tiempo Burbuja Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 3));
        System.out.println("Tiempo Burbuja Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 3));
        System.out.println("----------- BURBUJA (Datos descendentes) -----------");
        System.out.println("Tiempo Burbuja Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 3));
        System.out.println("Tiempo Burbuja Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 3));
        System.out.println("Tiempo Burbuja Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 3));

        System.out.println("----------- QUICKSORT (Datos aleatorios) -----------");
        System.out.println("Tiempo QuickSort Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 4));
        System.out.println("Tiempo QuickSort Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 4));
        System.out.println("Tiempo QuickSort Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 4));
        System.out.println("----------- QUICKSORT (Datos ascendentes) -----------");
        System.out.println("Tiempo QuickSort Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 4));
        System.out.println("Tiempo QuickSort Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 4));
        System.out.println("Tiempo QuickSort Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 4));
        System.out.println("----------- QUICKSORT (Datos descendentes) -----------");
        System.out.println("Tiempo QuickSort Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 4));
        System.out.println("Tiempo QuickSort Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 4));
        System.out.println("Tiempo QuickSort Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 4));
        
        System.out.println("----------- SELECCIÓN (Datos aleatorios) -----------");
        System.out.println("Tiempo Selección Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 5));
        System.out.println("Tiempo Selección Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 5));
        System.out.println("Tiempo Selección Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 5));
        System.out.println("----------- SELECCIÓN (Datos ascendentes) -----------");
        System.out.println("Tiempo Selección Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 5));
        System.out.println("Tiempo Selección Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 5));
        System.out.println("Tiempo Selección Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 5));
        System.out.println("----------- SELECCIÓN (Datos descendentes) -----------");
        System.out.println("Tiempo Selección Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 5));
        System.out.println("Tiempo Selección Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 5));
        System.out.println("Tiempo Selección Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 5));
        
        System.out.println("----------- HEAPSORT (Datos aleatorios) -----------");
        System.out.println("Tiempo HeapSort Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 6));
        System.out.println("Tiempo HeapSort Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 6));
        System.out.println("Tiempo HeapSort Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 6));
        System.out.println("----------- HEAPSORT (Datos ascendentes) -----------");
        System.out.println("Tiempo HeapSort Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 6));
        System.out.println("Tiempo HeapSort Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 6));
        System.out.println("Tiempo HeapSort Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 6));
        System.out.println("----------- HEAPSORT (Datos descendentes) -----------");
        System.out.println("Tiempo HeapSort Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 6));
        System.out.println("Tiempo HeapSort Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 6));
        System.out.println("Tiempo HeapSort Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 6));
        
        System.out.println("----------- ORDENAR ARRAYLIST (Datos aleatorios) -----------");
        System.out.println("Tiempo Ordenar ArrayList Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 7));
        System.out.println("Tiempo Ordenar ArrayList Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 7));
        System.out.println("Tiempo Ordenar ArrayList Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 7));
        System.out.println("----------- ORDENAR ARRAYLIST (Datos ascendentes) -----------");
        System.out.println("Tiempo Ordenar ArrayList Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 7));
        System.out.println("Tiempo Ordenar ArrayList Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 7));
        System.out.println("Tiempo Ordenar ArrayList Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 7));
        System.out.println("----------- ORDENAR ARRAYLIST (Datos descendentes) -----------");
        System.out.println("Tiempo Ordenar ArrayList Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 7));
        System.out.println("Tiempo Ordenar ArrayList Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 7));
        System.out.println("Tiempo Ordenar ArrayList Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 7));
        
        System.out.println("----------- ORDENAR LINKEDLIST (Datos aleatorios) -----------");
        System.out.println("Tiempo Ordenar LinkedList Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 8));
        System.out.println("Tiempo Ordenar LinkedList Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 8));
        System.out.println("Tiempo Ordenar LinkedList Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 8));
        System.out.println("----------- ORDENAR LINKEDLIST (Datos ascendentes) -----------");
        System.out.println("Tiempo Ordenar LinkedList Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 8));
        System.out.println("Tiempo Ordenar LinkedList Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 8));
        System.out.println("Tiempo Ordenar LinkedList Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 8));
        System.out.println("----------- ORDENAR LINKEDLIST (Datos descendentes) -----------");
        System.out.println("Tiempo Ordenar LinkedList Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 8));
        System.out.println("Tiempo Ordenar LinkedList Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 8));
        System.out.println("Tiempo Ordenar LinkedList Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 8));
        
        System.out.println("----------- SORT ARRAY (Datos aleatorios) -----------");
        System.out.println("Tiempo Ordenar SortArray Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 9));
        System.out.println("Tiempo Ordenar SortArray Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 9));
        System.out.println("Tiempo Ordenar SortArray Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 9));
        System.out.println("----------- SORT ARRAY (Datos ascendentes) -----------");
        System.out.println("Tiempo Ordenar SortArray Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 9));
        System.out.println("Tiempo Ordenar SortArray Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 9));
        System.out.println("Tiempo Ordenar SortArray Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 9));
        System.out.println("----------- SORT ARRAY (Datos descendentes) -----------");
        System.out.println("Tiempo Ordenar SortArray Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 9));
        System.out.println("Tiempo Ordenar SortArray Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 9));
        System.out.println("Tiempo Ordenar SortArray Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 9));
        
        System.out.println("----------- PARALLEL SORT (Datos aleatorios) -----------");
        System.out.println("Tiempo Ordenar ParallelSort Aleatorio 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 10));
        System.out.println("Tiempo Ordenar ParallelSort Aleatorio 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea2, 10));
        System.out.println("Tiempo Ordenar ParallelSort Aleatorio 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea3, 10));
        System.out.println("----------- PARALLEL SORT (Datos ascendentes) -----------");
        System.out.println("Tiempo Ordenar ParallelSort Ascendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 10));
        System.out.println("Tiempo Ordenar ParallelSort Ascendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc2, 10));
        System.out.println("Tiempo Ordenar ParallelSort Ascendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc3, 10));
        System.out.println("----------- PARALLEL SORT (Datos descendentes) -----------");
        System.out.println("Tiempo Ordenar ParallelSort Descendentes 300: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 10));
        System.out.println("Tiempo Ordenar ParallelSort Descendentes 3.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des2, 10));
        System.out.println("Tiempo Ordenar ParallelSort Descendentes 30.000: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des3, 10));
        
    }

}
