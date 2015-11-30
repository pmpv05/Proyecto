/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacion;

public class Imagenes {

    Imagen[] imagenes;

    public Imagen[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(Imagen[] imagenes) {
        this.imagenes = imagenes;
    }

    int cantidadImagenes;

    public int getCantidadImagenes() {
        return cantidadImagenes;
    }

    public void setCantidadImagenes(int cantidadImagenes) {
        this.cantidadImagenes = cantidadImagenes;
    }

    public Imagenes(int cantImagenes) {
        cantidadImagenes = cantImagenes;
        imagenes = new Imagen[cantImagenes];
    }

}
