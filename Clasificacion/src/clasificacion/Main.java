package clasificacion;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        GeneradorDatosGenericos generador = new GeneradorDatosGenericos();
        int[] tamanos = {300, 1000, 3000, 7000, 10000, 15000, 20000, 30000};
        int[] alea, asc, des;
        boolean a = false;
        TClasificador clasificar = new TClasificador();
        //ALEATORIO
        for (int i : tamanos) {
            alea = new int[i];
            alea = generador.generarDatosAleatorios(i);
            if (a == false) {
                System.out.println("------------- ALEATORIO --------------");
                a = true;
            }
            System.out.println("TAMAÑO: " + alea.length + ".");
            System.out.print("  Inserción: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 1));
            System.out.print("  Burbuja: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 3));
            System.out.print("  Selección: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 5));
            System.out.print("  ShellSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 2));
            System.out.print("  QuickSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 4));
            System.out.print("  HeapSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 6));
            System.out.print("  Arrays.Sort():" + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 9));
            System.out.print("  Arrays.ParallelSort():" + clasificar.tiempoMedioAlgoritmoBaseYCascara(alea, 10));
            System.out.println("");
        }
        a = false;
        //ASC
        for (int i : tamanos) {
            asc = new int[i];
            asc = generador.generarDatosAscendentes(i);
            if (a == false) {
                System.out.println("------------- ASCENDENTES --------------");
                a = true;
            }
            System.out.println("TAMAÑO: " + asc.length + ".");
            System.out.print("  Inserción: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 1));
            System.out.print("  Burbuja: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 3));
            System.out.print("  Selección: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 5));
            System.out.print("  ShellSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 2));
            System.out.print("  QuickSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 4));
            System.out.print("  HeapSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 6));
            System.out.print("  Arrays.Sort():" + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 9));
            System.out.print("  Arrays.ParallelSort():" + clasificar.tiempoMedioAlgoritmoBaseYCascara(asc, 10));
            System.out.println("");
        }
        a = false;
        //DESC
        for (int i : tamanos) {
            des = new int[i];
            des = generador.generarDatosDescendentes(i);
            if (a == false) {
                System.out.println("------------- DESCENDENTES --------------");
                a = true;
            }
            System.out.println("TAMAÑO: " + des.length + ".");
            System.out.print("  Inserción: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 1));
            System.out.print("  Burbuja: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 3));
            System.out.print("  Selección: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 5));
            System.out.print("  ShellSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 2));
            System.out.print("  QuickSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 4));
            System.out.print("  HeapSort: " + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 6));
            System.out.print("  Arrays.Sort():" + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 9));
            System.out.print("  Arrays.ParallelSort():" + clasificar.tiempoMedioAlgoritmoBaseYCascara(des, 10));
            System.out.println("");
        }
    }
}
