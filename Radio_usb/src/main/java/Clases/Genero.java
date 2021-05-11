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
public class Genero {
    protected String nombre;
    protected String fecha_de_creacion;
    protected String lugar_origen;
    protected String ritmo;

    public Genero(String nombre, String fecha_de_creacion, String lugar_origen, String ritmo) {
        this.nombre = nombre;
        this.fecha_de_creacion = fecha_de_creacion;
        this.lugar_origen = lugar_origen;
        this.ritmo = ritmo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public String getLugar_origen() {
        return lugar_origen;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_de_creacion(String fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
}
