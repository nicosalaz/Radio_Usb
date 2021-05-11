/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Nicolas Salazar
 */
public class Album {
    private String nombre_album;
    private String fecha_creacion;
    private int numero_de_canciones;

    public Album(String nombre_album, String fecha_creacion, int numero_de_canciones) {
        this.nombre_album = nombre_album;
        this.fecha_creacion = fecha_creacion;
        this.numero_de_canciones = numero_de_canciones;
    }

    public String getNombre_album() {
        return nombre_album;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public int getNumero_de_canciones() {
        return numero_de_canciones;
    }

    public void setNombre_album(String nombre_album) {
        this.nombre_album = nombre_album;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setNumero_de_canciones(int numero_de_canciones) {
        this.numero_de_canciones = numero_de_canciones;
    }

    @Override
    public String toString() {
        return  "nombre_album=" + nombre_album;
    }
    
}
