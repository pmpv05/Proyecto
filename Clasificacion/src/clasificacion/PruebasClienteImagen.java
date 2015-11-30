package clasificacion;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author diego
 */
public class PruebasClienteImagen {

    private static final int POSICION_ID = 0;
    private static final int POSICION_NOMBRE = 1;
    private static final int POSICION_APELLIDO = 2;
    private static final int POSICION_TAMANIO = 3;
    private static final int POSICION_FECHA = 4;
    private static final int POSICION_BYTES = 5;
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm";

    public static void main(String[] args) throws ParseException, IOException {
        List<Imagen> listaImagenes = new LinkedList<>();
        List<File> archivos = new LinkedList<>();
        ObligatorioUtils.listFilesForFolder("datosFuente", archivos);
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        for (File file : archivos) {
            System.out.println("Procesando archivo: " + file.getName());
            String[] data = ManejadorArchivosGenerico.leerArchivo(file.getPath(), false);
            for (String string : data) {
                String[] separatedData = string.split(",");
                Date fechaImagen = sdf.parse(separatedData[POSICION_FECHA]);
                Calendar cal = Calendar.getInstance();
                cal.setTime(fechaImagen);
                int anio = cal.get(Calendar.YEAR);

                Imagen imagen = new Imagen(
                        Long.parseLong(separatedData[POSICION_ID]),
                        separatedData[POSICION_NOMBRE],
                        separatedData[POSICION_APELLIDO],
                        Long.parseLong(separatedData[POSICION_TAMANIO]),
                        anio,
                        fechaImagen,
                        separatedData[POSICION_BYTES]);
                listaImagenes.add(imagen);
            }
        }
        System.out.println("Fin del proceso. Tamaño de tabla: " + listaImagenes.size());
//==================================================================
        
//        ArrayList<Imagen> imagenesArrayList = new ArrayList<>();
//        LinkedList<Imagen> imagenesLinkedList = new LinkedList<>();
//        for(int img1 = 0; img1<listaImagenes.size(); img1++)
//            imagenesArrayList.add(listaImagenes.get(img1));
//        for(int img2 = 0; img2<listaImagenes.size(); img2++)
//            imagenesLinkedList.add(listaImagenes.get(img2));
//        
//        System.out.println("ArrayList tiene "+imagenesArrayList.size()+" imágenes.");
//        System.out.println("LinkedList tiene "+imagenesLinkedList.size()+" imágenes.");
//        
//        TClasificador clas = new TClasificador();
//        System.out.println("Tiempo ArrayList: " + clas.tiempoMedioAlgoritmoBaseYCascara(imagenesArrayList));
//        System.out.println("Tiempo LinkedList: " + clas.tiempoMedioAlgoritmoBaseYCascara(imagenesLinkedList));
        
//        Collections.sort(imagenesArrayList);
//        for(int img =0;img<50;img++) System.out.println(imagenesArrayList.get(img));
        
//        Imagenes imagenes = new Imagenes(10000);
//        for (int i = 0; i < 10000; i++) {
//            imagenes.imagenes[i] = listaImagenes.get(i);
//        }
//        System.out.println("Array Imagenes tiene " + imagenes.imagenes.length + " imágenes.");
//
//        TClasificador clas = new TClasificador();
        
//        clas.ordenarPorSeleccion(imagenes.getImagenes());
//        System.out.println(imagenes.getImagenes()[listaImagenes.size()-1]);
        
//        clas.ordenarPiñeiro(imagenes.getImagenes());
//        for(int i=0; i<50; i++) System.out.println(imagenes.getImagenes()[i]);
        
//        clas.ordenarPorQuickSort(imagenes.getImagenes());
//        for(int i=0; i<50; i++) System.out.println(imagenes.getImagenes()[i]);

//        System.out.println("Tiempo en ordenar Imágenes por ID (SortArray): "+clas.tiempoMedioAlgoritmoBaseYCascara(imagenes.getImagenes(), 9));
//        System.out.println("Tiempo en ordenar Imágenes por ID (ParallelSortArray): "+clas.tiempoMedioAlgoritmoBaseYCascara(imagenes.getImagenes(), 10));
//        System.out.println("Tiempo en ordenar Imágenes por ID (QuickSort): "+clas.tiempoMedioAlgoritmoBaseYCascara(imagenes.getImagenes(), 4));
//        System.out.println("Tiempo en ordenar Imágenes por ID (Burbuja): "+clas.tiempoMedioAlgoritmoBaseYCascara(imagenes.getImagenes(), 3));
////        
//        System.out.println("Tiempo en ordenar Imágenes por Año, Apellido y Nombre (Piñeiro): "+clas.tiempoMedioAlgoritmoBaseYCascara(imagenes.getImagenes(), 11));
    }
}
