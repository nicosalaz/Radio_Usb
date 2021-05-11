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
public class Cancion{
    Artista artista;
    Album album;
    Genero genero;
    private String duracion;
    private String nombre_cancion;

    public Cancion(Artista artista, Album album, Genero genero, String duracion, String nombre_cancion) {
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
        this.nombre_cancion = nombre_cancion;
    }

    public Artista getArtista() {
        return artista;
    }

    public Album getAlbum() {
        return album;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    @Override
    public String toString() {
        return "artista=" + artista.getNombre_artistico() + ", album=" + album.getNombre_album() + ", genero=" + genero.getNombre() + ", duracion=" + duracion + ", nombre_cancion=" + nombre_cancion;
    }
    
}
    