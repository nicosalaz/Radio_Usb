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
public class Persona {
    protected String nombre;
    protected String fecha_nacimiento;
    protected String nacionalidad;

    public Persona(String nombre, String fecha_nacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", nacionalidad=" + nacionalidad;
    }
    
    
}
