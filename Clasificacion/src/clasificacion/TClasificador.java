package clasificacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import com.google.common.collect.HashMultimap;

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
    public static final int METODO_CLASIFICACION_PIÑEIRO = 11;

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

    public Imagen[] clasificar(Imagen[] datosParaClasificar, int metodoClasificacion, boolean cascara) {
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
            case METODO_CLASIFICACION_PIÑEIRO:
                if (cascara) {
                    return ordenarCascara(datosParaClasificar);
                } else {
                    return ordenarPiñeiro(datosParaClasificar);
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

    private Imagen[] ordenarCascara(Imagen[] datos) {
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

    private void intercambiar(Imagen[] vector, int pos1, int pos2) {
        Imagen temp = vector[pos2];
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

    public Imagen[] ordenarPorInsercion(Imagen[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            for (int i = 1; i < datosParaClasificar.length; i++) {
                long auxiliar = datosParaClasificar[i].getId();
                int j = i - 1;
                while ((j >= 0) && (auxiliar < datosParaClasificar[j].getId())) {
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

    public Imagen[] ordenarPorShell(Imagen[] datosParaClasificar) {
        int j, inc;
        int[] incrementos = new int[]{3223, 358, 51, 10, 3, 1}; //358 por 350
        for (int posIncrementoActual = 0; posIncrementoActual < incrementos.length; posIncrementoActual++) {//posIncrementoActual = 1 pero deberia ser 0.
            inc = incrementos[posIncrementoActual];
            if (inc < (datosParaClasificar.length / 2)) {
                for (int i = inc; i < datosParaClasificar.length; i++) {
                    j = i - inc;
                    while (j >= 0) {
                        if (datosParaClasificar[j].getId() > datosParaClasificar[j + inc].getId()) {
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

    public Imagen[] ordenarPorBurbuja(Imagen[] datosParaClasificar) {
        //		int auxiliar;
        int n = datosParaClasificar.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= (i + 1); j--) {
                if (datosParaClasificar[j].getId() < datosParaClasificar[j - 1].getId()) {
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

    public Imagen[] ordenarPorQuickSort(Imagen[] datosParaClasificar) {
        quicksort(datosParaClasificar, 0, datosParaClasificar.length - 1);
        return datosParaClasificar;
    }

    public int encuentraPivote(int i, int d, Imagen[] vector) {
        return (i + d) / 2;
    }

    private void quicksort(Imagen[] vector, int i, int j) {
        int izquierda = i;
        int derecha = j;

        int posicionPivote = encuentraPivote(izquierda, derecha, vector);

        if (posicionPivote >= 0) {
            long pivote = vector[posicionPivote].getId();

            while (izquierda <= derecha) {
                while ((vector[izquierda].getId() < pivote) && (izquierda < j)) {

                    izquierda++;
                }

                while ((pivote < vector[derecha].getId()) && (derecha > i)) {
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

    //Campos - 1:Año, 2:Apellido, 3:Nombre
    public Imagen[] ordenarPorQuickSortCampo(Imagen[] datosParaClasificar, int campo) {
        quicksortCampo(datosParaClasificar, 0, datosParaClasificar.length - 1, campo);
        return datosParaClasificar;
    }

    public void quicksortCampo(Imagen[] vector, int i, int j, int campo) {
        int izquierda = i;
        int derecha = j;

        int posicionPivote = encuentraPivote(izquierda, derecha, vector);

        if (posicionPivote >= 0 && campo == 1) {
            int pivote = vector[posicionPivote].getAnio();

            while (izquierda <= derecha) {
                while ((vector[izquierda].getAnio() < pivote) && (izquierda < j)) {

                    izquierda++;
                }

                while ((pivote < vector[derecha].getAnio()) && (derecha > i)) {
                    derecha--;
                }

                if (izquierda <= derecha) {
                    intercambiar(vector, derecha, izquierda);
                    izquierda++;
                    derecha--;
                }
            }

            if (i < derecha) {
                quicksortCampo(vector, i, derecha, 1);
            }
            if (izquierda < j) {
                quicksortCampo(vector, izquierda, j, 1);
            }
        } else if (posicionPivote >= 0 && campo == 2) {
            String pivote = vector[posicionPivote].getApellido();

            while (izquierda <= derecha) {
                while ((vector[izquierda].getApellido().compareTo(pivote) < 0) && (izquierda < j)) {

                    izquierda++;
                }

                while ((vector[derecha].getApellido().compareTo(pivote) > 0) && (derecha > i)) {
                    derecha--;
                }

                if (izquierda <= derecha) {
                    intercambiar(vector, derecha, izquierda);
                    izquierda++;
                    derecha--;
                }
            }

            if (i < derecha) {
                quicksortCampo(vector, i, derecha, 2);
            }
            if (izquierda < j) {
                quicksortCampo(vector, izquierda, j, 2);
            }
        } else if (posicionPivote >= 0 && campo == 3) {
            String pivote = vector[posicionPivote].getNombre();

            while (izquierda <= derecha) {
                while ((vector[izquierda].getNombre().compareTo(pivote) < 0) && (izquierda < j)) {

                    izquierda++;
                }

                while ((vector[derecha].getNombre().compareTo(pivote) > 0) && (derecha > i)) {
                    derecha--;
                }

                if (izquierda <= derecha) {
                    intercambiar(vector, derecha, izquierda);
                    izquierda++;
                    derecha--;
                }
            }

            if (i < derecha) {
                quicksortCampo(vector, i, derecha, 3);
            }
            if (izquierda < j) {
                quicksortCampo(vector, izquierda, j, 3);
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

    public Imagen[] ordenarPorSeleccion(Imagen[] datosParaClasificar) {
        int n = datosParaClasificar.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            String claveMenor = datosParaClasificar[i].getApellido();
            for (int j = i + 1; j < n; j++) {
                if (datosParaClasificar[j].getApellido().compareTo(claveMenor)<0) {
                    indiceMenor = j;
                    claveMenor = datosParaClasificar[j].getApellido();
                }
            }
            intercambiar(datosParaClasificar, i, indiceMenor);
        }
        return datosParaClasificar;
    }

    public Imagen[] ordenarPorSeleccionAnio(Imagen[] datosParaClasificar) {
        int n = datosParaClasificar.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            int claveMenor = datosParaClasificar[i].getAnio();
            for (int j = i + 1; j < n; j++) {
                if (datosParaClasificar[j].getAnio() < claveMenor) {
                    indiceMenor = j;
                    claveMenor = datosParaClasificar[j].getAnio();
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

    public Imagen[] ordenarPorHeapSort(Imagen[] datosParaClasificar) {
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

    public Imagen[] vectorDuplicado(Imagen[] vectorAduplicar) {
        Imagen[] vectorDuplicado = new Imagen[vectorAduplicar.length];
        for (int i = 0; i < vectorAduplicar.length; i++) {
            vectorDuplicado[i] = vectorAduplicar[i];

        }
        return vectorDuplicado;
    }
    
    public ArrayList<Imagen> copiarArrayList(ArrayList<Imagen> listADuplicar) {
        ArrayList<Imagen> listDuplicada = new ArrayList<>();
        for (Imagen img : listADuplicar) {
            listDuplicada.add(img);
        }
        return listDuplicada;
    }
    
    public LinkedList<Imagen> copiarLinkedList(LinkedList<Imagen> listADuplicar) {
        LinkedList<Imagen> listDuplicada = new LinkedList<>();
        for (Imagen img : listADuplicar) {
            listDuplicada.add(img);
        }
        return listDuplicada;
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

    private void armaHeap(Imagen[] datosParaClasificar, int primero, int ultimo) {
        if (primero < ultimo) {
            int r = primero;
            while (r <= ultimo / 2) {
                if (ultimo == 2 * r) { //r tiene un hijo solo
                    if (datosParaClasificar[r].getId() > datosParaClasificar[r * 2].getId()) {
                        intercambiar(datosParaClasificar, r, 2 * r);
                    }
                    r = ultimo;
                } else { //r tiene 2 hijos
                    int posicionIntercambio = 0;
                    if (datosParaClasificar[2 * r].getId() > datosParaClasificar[2 * r + 1].getId()) {
                        posicionIntercambio = 2 * r + 1;
                    } else {
                        posicionIntercambio = 2 * r;
                    }
                    if (datosParaClasificar[r].getId() > datosParaClasificar[posicionIntercambio].getId()) {
                        intercambiar(datosParaClasificar, r, posicionIntercambio);
                        r = posicionIntercambio;
                    } else {
                        r = ultimo;
                    }
                }
            }
        }
    }

    public void ordenarParcialApellido(Imagen[] datos) {
        int a = 0, b = 0, aux = 0;
        int i = 0;
        while (datos[i].getAnio() <= 2015 && i < datos.length - 1) {
            boolean bandera = false;
            while ((i < datos.length - 1) && datos[i].getAnio().equals(datos[i + 1].getAnio())) {
                aux++;
                b++;
                i++;
                bandera = true;
            }
            if (bandera) {
                quicksortCampo(datos, a, b, 2);

            } else {
                i++;
                a++;
                b++;
                aux++;
            }
            a = aux;

        }
    }

    private void ordenarParcialNombre(Imagen[] datos) {
        int a = 0, b = 0, aux = 0;
        int i = 0;
        while (datos[i].getApellido().compareTo("von") <= 0 && i < datos.length - 1) {
            boolean bandera = false;
            while ((i < datos.length - 1) && datos[i].getApellido().equals(datos[i + 1].getApellido())) {
                aux++;
                b++;
                i++;
                bandera = true;
            }
            if (bandera) {
                quicksortCampo(datos, a, b, 2);

            } else {
                i++;
                a++;
                b++;
                aux++;
            }
            a = aux;

        }
    }

    public Imagen[] ordenarPiñeiro(Imagen[] datosParaClasificar) {
        int n = datosParaClasificar.length;
        ordenarPorQuickSortCampo(datosParaClasificar, 1); //Ordeno por año
        ordenarParcialApellido(datosParaClasificar);
        ordenarParcialNombre(datosParaClasificar);
        return datosParaClasificar;
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

    public ArrayList tiempoArrayList(Imagen[] datos) {
        ArrayList vec = new ArrayList();

        for (Imagen i : datos) {
            vec.add(i);
        }
        Collections.sort(vec);

        return vec;
    }

    public ArrayList tiempoArrayListCascara(Imagen[] datos) {
        ArrayList vec = new ArrayList();

        for (Imagen i : datos) {
            vec.add(i);
        }
        vec = new ArrayList();
        Collections.sort(vec);

        return vec;
    }

    public LinkedList tiempoLinkedList(Imagen[] datos) {

        LinkedList l = new LinkedList();
        for (Imagen i : datos) {
            l.add(i);
        }

        Collections.sort(l);

        return l;
    }

    public LinkedList tiempoLinkedListCascara(Imagen[] datos) {
        LinkedList l = new LinkedList();
        for (Imagen i : datos) {
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

    public double tiempoMedioAlgoritmoBaseYCascara(Imagen[] datosParaClasificar, int metodo) {
        long tiempoNanoAntes = System.nanoTime();
        long total = 0;
        long cantidadDeLlamadas = 0;
        long tiempoNanoDespues = 0;
        while (total < 1e9) {
            cantidadDeLlamadas++;
            Imagen[] vectorCopia = vectorDuplicado(datosParaClasificar);
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
            Imagen[] vectorCopia = vectorDuplicado(datosParaClasificar);
            clasificar(vectorCopia, metodo, true);//Pongo true porque llamo a la cáscara
            tiempoNanoDespues = System.nanoTime();
            total = tiempoNanoDespues - tiempoNanoAntes;
        }
        long promedioCascara = total / cantidadDeLlamadas;

        return ((promedioClasificando - promedioCascara) / 1e6);
    }
    
    public double tiempoMedioAlgoritmoBaseYCascara(ArrayList<Imagen> datosParaClasificar) {
        long tiempoNanoAntes = System.nanoTime();
        long total = 0;
        long cantidadDeLlamadas = 0;
        long tiempoNanoDespues = 0;
        while (total < 1e9) {
            cantidadDeLlamadas++;
            ArrayList<Imagen> copia = copiarArrayList(datosParaClasificar);
            Collections.sort(copia);
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
            ArrayList<Imagen> copia = copiarArrayList(datosParaClasificar);
            Collections.sort(new ArrayList());
            tiempoNanoDespues = System.nanoTime();
            total = tiempoNanoDespues - tiempoNanoAntes;
        }
        long promedioCascara = total / cantidadDeLlamadas;

        return ((promedioClasificando - promedioCascara) / 1e6);
    }
    
    public double tiempoMedioAlgoritmoBaseYCascara(LinkedList<Imagen> datosParaClasificar) {
        long tiempoNanoAntes = System.nanoTime();
        long total = 0;
        long cantidadDeLlamadas = 0;
        long tiempoNanoDespues = 0;
        while (total < 1e9) {
            cantidadDeLlamadas++;
            LinkedList<Imagen> copia = copiarLinkedList(datosParaClasificar);
            Collections.sort(copia);
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
            LinkedList<Imagen> copia = copiarLinkedList(datosParaClasificar);
            Collections.sort(new LinkedList());
            tiempoNanoDespues = System.nanoTime();
            total = tiempoNanoDespues - tiempoNanoAntes;
        }
        long promedioCascara = total / cantidadDeLlamadas;

        return ((promedioClasificando - promedioCascara) / 1e6);
    }

}
