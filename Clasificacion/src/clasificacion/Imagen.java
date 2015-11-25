package clasificacion;

import java.util.Date;

public class Imagen {

    private Long id;
    private String nombre;
    private String apellido;
    private Long tamanioImagen;

    /**
     * Fecha en formato : 2015-11-19 06:54
     */
    private Date fechaCreacion;
    private String data;
    private Integer anio;

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param tamanioImagen
     * @param anio
     * @param fechaCreacion
     * @param data
     */
    public Imagen(Long id, String nombre, String apellido, Long tamanioImagen, Integer anio, Date fechaCreacion, String data) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tamanioImagen = tamanioImagen;
        this.anio = anio;
        this.fechaCreacion = fechaCreacion;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getTamanioImagen() {
        return tamanioImagen;
    }

    public void setTamanioImagen(Long tamanioImagen) {
        this.tamanioImagen = tamanioImagen;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Imagen{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tamanioImagen=" + tamanioImagen + ", anio=" + anio + ", fechaCreacion=" + fechaCreacion + ", data=" + "..a lot of bytes..." + '}';
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

}
