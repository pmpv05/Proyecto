/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author diego
 */
public class ObligatorioUtils {

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

    /**
     * Agrega todos los archivos que se encuentran en una carpeta y sus
     * sub-carpetas a una lista de File.
     *
     * @param folderPath - Ruta de la carpeta raiz
     * @param files - Lista de File inicializada
     */
    public static void listFilesForFolder(final String folderPath,List<File> files) {
        File folder = new File(folderPath);
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry.getPath(), files);
            } else {
                files.add(fileEntry);
            }
        }
    }

    /**
     * Transforma una cadena hexadecimal en formato String a array de bytes.
     * El largo de la cadena debe ser multiplo de 2
     * @param data String que representa la data en hexa
     * @return 
     */
    public static byte[] hexStringToBytes(String data) {
        byte[] result = new byte[data.length() / 2];
        Integer suma = 0;
        for (int i = 0; i < data.length(); i++) {
            Character j = Character.valueOf(data.charAt(i));
            int digit = Character.digit(j, 16);
            if (i % 2 == 0) {
                suma += digit << 4;
            } else {
                suma += digit;
                result[(i - 1) / 2] = suma.byteValue();
                suma = 0;
            }
        }
        return result;
    }

  
    /**
     * Transforma un array de bytes a un string de hexadecimales
     * @param bytes
     * @return 
     */
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        int corte = 16;
        int contadorCorte = 0;
        for (int j = 0; j < bytes.length; j++) {

            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];

        }
        return new String(hexChars);
    }

    /**
     * Almacena en disco una imagen.
     * 
     * @param bytes Array de bytes con la data de la imagen
     * @param fileName Nombre del archivo a guardar
     * @param extension Extension de la imagen
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void bytesToImage(byte[] bytes, String fileName, String extension) throws FileNotFoundException, IOException {
        File newFile = new File(fileName + "."+extension);
        FileOutputStream fos = new FileOutputStream(newFile);
        fos.write(bytes);
        fos.close();
    }

}
