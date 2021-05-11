/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.*;

/**
 *
 * @author Nicolas Salazar
 */
public class Biblioteca implements Categoria{
    ArrayList<Cancion> canciones = new ArrayList<Cancion>();
    
    public void agregar_cancion(Cancion c){
        canciones.add(c);
    }
    
    public void mostrar_canciones(){
        for (int i = 0; i < canciones.size(); i++) {
            System.out.println((i+1)+". "+canciones.get(i).toString());
        }
    }

    @Override
    public void buscar_por_artista(String a) {
        int conta = 0;
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getArtista().getNombre_artistico().toLowerCase().equals(a.toLowerCase())) {
                System.out.println(canciones.get(i).toString());
                conta++;
            }
        }
        if(conta == 0){
            System.out.println("No existen canciones de este artista");
        }
    }

    @Override
    public void buscar_por_album(String a) {
        int conta = 0;
        for (int i = 0; i < canciones.size(); i++) {
            if(canciones.get(i).getAlbum().getNombre_album().toLowerCase().equals(a.toLowerCase())){
                System.out.println(canciones.get(i).toString());
                conta++;
            }
        }
        if (conta==0){
            System.out.println("No existen canciones de este album");
        }
    }

    @Override
    public void buscar_por_genero(String g) {
        int conta = 0;
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getGenero().getNombre().toLowerCase().equals(g.toLowerCase())) {
                System.out.println(canciones.get(i).toString());
                conta++;
            }
        }
        if (conta == 0) {
            System.out.println("No exixte canciones de este genero");
        }
    }
    
    
}
