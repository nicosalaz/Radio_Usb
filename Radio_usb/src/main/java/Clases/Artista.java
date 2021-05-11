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
public class Artista extends Persona{
    private String nombre_artistico;

    public Artista(String nombre_artistico, String nombre, String fecha_nacimiento, String nacionalidad) {
        super(nombre, fecha_nacimiento, nacionalidad);
        this.nombre_artistico = nombre_artistico;
    }

    public String getNombre_artistico() {
        return nombre_artistico;
    }

    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    @Override
    public String toString() {
        return "nombre_artistico=" + nombre_artistico;
    }
    
    
}
