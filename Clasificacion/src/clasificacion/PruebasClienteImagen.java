package clasificacion;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
            String[] data = ManejadorArchivosGenerico.leerArchivo(file.getPath(),false);
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
        System.out.println("Fin del proceso. Tamaño de tabla: "+listaImagenes.size());
    }
}
