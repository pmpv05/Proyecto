package clasificacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class TClasificador {

    public static final int METODO_CLASIFICACION_INSERCION = 1;
    public static final int METODO_CLASIFICACION_SHELL = 2;
    public static final int METODO_CLASIFICACION_BURBUJA = 3;
    public static final int METODO_CLASIFICACION_QUICKSORT = 4;
    public static final int METODO_CLASIFICACION_SELECCION = 5;
    public static final int METODO_CLASIFICACION_HEAPSORT = 6;
    public static final int METODO_CLASIFICACION_ARRAYLIST = 7;
    public static final int METODO_CLASIFICACION_LINKEDLIST = 8;
    public static final int METODO_CLASIFICACION_SORTARRAY = 9;
    public static final int METODO_CLASIFICACION_PARALLELSORT = 10;

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
    }

    public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion) {
        switch (metodoClasificacion) {
            case METODO_CLASIFICACION_INSERCION:
                return ordenarPorInsercion(datosParaClasificar);
            case METODO_CLASIFICACION_SHELL:
                return ordenarPorShell(datosParaClasificar);
            case METODO_CLASIFICACION_BURBUJA:
                return ordenarPorBurbuja(datosParaClasificar);
            case METODO_CLASIFICACION_QUICKSORT:
                return ordenarPorQuickSort(datosParaClasificar);
            case METODO_CLASIFICACION_SELECCION:
                return ordenarPorSeleccion(datosParaClasificar);
            case METODO_CLASIFICACION_HEAPSORT:
                return ordenarPorHeapSort(datosParaClasificar);
            default:
                System.err.println("Método inválido");
                break;
        }
        return datosParaClasificar;
    }

    public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion, boolean cascara) {
        switch (metodoClasificacion) {
            case METODO_CLASIFICACION_INSERCION:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPorInsercion(datosParaClasificar);
                }
            case METODO_CLASIFICACION_SHELL:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPorShell(datosParaClasificar);
                }
            case METODO_CLASIFICACION_BURBUJA:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPorBurbuja(datosParaClasificar);
                }
            case METODO_CLASIFICACION_QUICKSORT:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPorQuickSort(datosParaClasificar);
                }
            case METODO_CLASIFICACION_SELECCION:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPorSeleccion(datosParaClasificar);
                }
            case METODO_CLASIFICACION_HEAPSORT:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPorHeapSort(datosParaClasificar);
                }
            case METODO_CLASIFICACION_ARRAYLIST:
                if (cascara) {
                    tiempoArrayListCascara(datosParaClasificar);
                    break;
                } else {
                    tiempoArrayList(datosParaClasificar);
                    break;
                }
            case METODO_CLASIFICACION_LINKEDLIST:
                if (cascara) {
                    tiempoLinkedListCascara(datosParaClasificar);
                    break;
                } else {
                    tiempoLinkedList(datosParaClasificar);
                    break;
                }
            case METODO_CLASIFICACION_SORTARRAY:
                if (cascara) {
                    Arrays.sort(new int[0]);
                    break;
                } else {
                    Arrays.sort(datosParaClasificar);
                    break;
                }
            case METODO_CLASIFICACION_PARALLELSORT:
                if (cascara) {
                    Arrays.parallelSort(new int[0]);
                    break;
                } else {
                    Arrays.parallelSort(datosParaClasificar);
                    break;
                }
            default:
                System.err.println("Método inválido");
                break;
        }
        return datosParaClasificar;
    }

    private int[] ordenarCascara(int[] datos) {
        if (datos != null) {
            return datos;
        } else {
            return null;
        }
    }

    private void intercambiar(int[] vector, int pos1, int pos2) {
        int temp = vector[pos2];
        vector[pos2] = vector[pos1];
        vector[pos1] = temp;
    }

    public int[] ordenarPorInsercion(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            for (int i = 1; i < datosParaClasificar.length; i++) {
                int auxiliar = datosParaClasificar[i];
                int j = i - 1;
                while ((j >= 0) && (auxiliar < datosParaClasificar[j])) {
                    intercambiar(datosParaClasificar, j + 1, j);
                    j--;
                }
            }
            return datosParaClasificar;
        }
        return null;
    }

    public int[] ordenarPorShell(int[] datosParaClasificar) {
        int j, inc;
        int[] incrementos = new int[]{3223, 358, 51, 10, 3, 1}; //358 por 350
        for (int posIncrementoActual = 0; posIncrementoActual < incrementos.length; posIncrementoActual++) {//posIncrementoActual = 1 pero deberia ser 0.
            inc = incrementos[posIncrementoActual];
            if (inc < (datosParaClasificar.length / 2)) {
                for (int i = inc; i < datosParaClasificar.length; i++) {
                    j = i - inc;
                    while (j >= 0) {
                        if (datosParaClasificar[j] > datosParaClasificar[j + inc]) {
                            intercambiar(datosParaClasificar, j, j + inc);
                            j--;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return datosParaClasificar;
    }

    public int[] ordenarPorBurbuja(int[] datosParaClasificar) {
        //		int auxiliar;
        int n = datosParaClasificar.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= (i + 1); j--) {
                if (datosParaClasificar[j] < datosParaClasificar[j - 1]) {
                    intercambiar(datosParaClasificar, j, j - 1);
                }
            }
        }
        return datosParaClasificar;
    }

    public int[] ordenarPorQuickSort(int[] datosParaClasificar) {
        quicksort(datosParaClasificar, 0, datosParaClasificar.length - 1);
        return datosParaClasificar;
    }

    public int encuentraPivote(int i, int d, int[] vector) {
        return (i + d) / 2;
    }

    private void quicksort(int[] vector, int i, int j) {
        int izquierda = i;
        int derecha = j;

        int posicionPivote = encuentraPivote(izquierda, derecha, vector);

        if (posicionPivote >= 0) {
            int pivote = vector[posicionPivote];

            while (izquierda <= derecha) {
                while ((vector[izquierda] < pivote) && (izquierda < j)) {

                    izquierda++;
                }

                while ((pivote < vector[derecha]) && (derecha > i)) {
                    derecha--;
                }

                if (izquierda <= derecha) {
                    intercambiar(vector, derecha, izquierda);
                    izquierda++;
                    derecha--;
                }
            }

            if (i < derecha) {
                quicksort(vector, i, derecha);
            }
            if (izquierda < j) {
                quicksort(vector, izquierda, j);
            }
        }

    }

    public int[] ordenarPorSeleccion(int[] datosParaClasificar) {
        int n = datosParaClasificar.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            int claveMenor = datosParaClasificar[i];
            for (int j = i + 1; j < n; j++) {
                if (datosParaClasificar[j] < claveMenor) {
                    indiceMenor = j;
                    claveMenor = datosParaClasificar[j];
                }
            }
            intercambiar(datosParaClasificar, i, indiceMenor);
        }
        return datosParaClasificar;
    }

    public int[] ordenarPorHeapSort(int[] datosParaClasificar) {
        for (int i = (datosParaClasificar.length - 1) / 2; i >= 0; i--) { //Armo el heap inicial de n-1 div 2 hasta 0
            armaHeap(datosParaClasificar, i, datosParaClasificar.length - 1);
        }
        for (int i = datosParaClasificar.length - 1; i >= 1; i--) {
            intercambiar(datosParaClasificar, 0, i);
            armaHeap(datosParaClasificar, 0, i - 1);
        }
        return datosParaClasificar;
    }

    public int[] vectorDuplicado(int[] vectorAduplicar) {
        int[] vectorDuplicado = new int[vectorAduplicar.length];
        for (int i = 0; i < vectorAduplicar.length; i++) {
            vectorDuplicado[i] = vectorAduplicar[i];

        }
        return vectorDuplicado;
    }

    private void armaHeap(int[] datosParaClasificar, int primero, int ultimo) {
        if (primero < ultimo) {
            int r = primero;
            while (r <= ultimo / 2) {
                if (ultimo == 2 * r) { //r tiene un hijo solo
                    if (datosParaClasificar[r] > datosParaClasificar[r * 2]) {
                        intercambiar(datosParaClasificar, r, 2 * r);
                    }
                    r = ultimo;
                } else { //r tiene 2 hijos
                    int posicionIntercambio = 0;
                    if (datosParaClasificar[2 * r] > datosParaClasificar[2 * r + 1]) {
                        posicionIntercambio = 2 * r + 1;
                    } else {
                        posicionIntercambio = 2 * r;
                    }
                    if (datosParaClasificar[r] > datosParaClasificar[posicionIntercambio]) {
                        intercambiar(datosParaClasificar, r, posicionIntercambio);
                        r = posicionIntercambio;
                    } else {
                        r = ultimo;
                    }
                }
            }
        }
    }

    public ArrayList tiempoArrayList(int[] datos) {
        ArrayList vec = new ArrayList();

        for (int i : datos) {
            vec.add(i);
        }
        Collections.sort(vec);

        return vec;
    }

    public ArrayList tiempoArrayListCascara(int[] datos) {
        ArrayList vec = new ArrayList();

        for (int i : datos) {
            vec.add(i);
        }
        vec = new ArrayList();
        Collections.sort(vec);

        return vec;
    }

    public LinkedList tiempoLinkedList(int[] datos) {

        LinkedList l = new LinkedList();
        for (int i : datos) {
            l.add(i);
        }

        Collections.sort(l);

        return l;
    }

    public LinkedList tiempoLinkedListCascara(int[] datos) {
        LinkedList l = new LinkedList();
        for (int i : datos) {
            l.add(i);
        }
        l = new LinkedList();
        Collections.sort(l);

        return l;
    }

    public Boolean estaOrdenadoAcendentemente(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public Boolean estaOrdenadoDescendentemente(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] < vector[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int encuentraPivote2(int i, int d, int[] entrada) {
        return (i + d) / 2;
    }

    public double tiempoMedioAlgoritmoBaseYCascara(int[] datosParaClasificar, int metodo) {
        long tiempoNanoAntes = System.nanoTime();
        long total = 0;
        long cantidadDeLlamadas = 0;
        long tiempoNanoDespues = 0;
        while (total < 1e9) {
            cantidadDeLlamadas++;
            int[] vectorCopia = vectorDuplicado(datosParaClasificar);
            clasificar(vectorCopia, metodo, false); //Pongo false porque llamo al método, no a la cáscara
            tiempoNanoDespues = System.nanoTime();
            total = tiempoNanoDespues - tiempoNanoAntes;
        }
        long promedioClasificando = total / cantidadDeLlamadas;

        tiempoNanoAntes = System.nanoTime();
        total = 0;
        cantidadDeLlamadas = 0;
        tiempoNanoDespues = 0;
        while (total < 1e9) {
            cantidadDeLlamadas++;
            int[] vectorCopia = vectorDuplicado(datosParaClasificar);
            clasificar(vectorCopia, metodo, true);//Pongo true porque llamo a la cáscara
            tiempoNanoDespues = System.nanoTime();
            total = tiempoNanoDespues - tiempoNanoAntes;
        }
        long promedioCascara = total / cantidadDeLlamadas;

        return ((promedioClasificando - promedioCascara) / 1e6);
    }

}
