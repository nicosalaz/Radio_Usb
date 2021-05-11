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
public class Main {

    public static Artista crear_artista(){
      Scanner entrada = new Scanner(System.in);
      String nombre;
      String nombre_artistico;
      String fecha_nacimiento;
      String nacionalidad;
      System.out.println("Ingrese el nombre del artista:");
      nombre = entrada.nextLine();
      System.out.println("Ingrese el nombre artistico:");
      nombre_artistico = entrada.nextLine();
      System.out.println("Ingrese la fecha de nacimiento:");
      fecha_nacimiento = entrada.nextLine();
      System.out.println("Ingrese la nacionalidad:");
      nacionalidad = entrada.nextLine();

      return new Artista(nombre_artistico, nombre, fecha_nacimiento, nacionalidad);
    }

    public static Album crear_album(){
      Scanner ent = new Scanner(System.in);
      String nombre_album;
      String fecha_creacion;
      int numero_canciones;
      System.out.println("Ingrese el nombre del album:");
      nombre_album = ent.nextLine();
      System.out.println("Ingrese la fecha de creacion:");
      fecha_creacion = ent.nextLine();
      System.out.println("Ingrese el numero de canciones:");
      numero_canciones = ent.nextInt();

      return new Album(nombre_album, fecha_creacion, numero_canciones);
    }
    
    public static Genero crear_reggaeton(){
        return new Genero("reggaeton", "1990", "Puerto Rico", "95 BPM"); 
    }

    public static Genero crear_salsa(){
        return new Genero("salsa", "1950", "Cuba", "Son cubano"); 
    }
    
    public static void crear_cancion(Biblioteca b){
        Scanner ent = new Scanner(System.in);
        String nombre_cancion;
        String duracion;
        int opcion;
        System.out.println("Ingrese el nombre de la cancion:");
        nombre_cancion = ent.nextLine();
        System.out.println("Ingrese la duracion de la cancion:");
        duracion = ent.nextLine();
        Cancion cancion;
        System.out.println("Seleccione el genero:");
        System.out.println("1.Reggaeton\n2.Salsa:");
        opcion = ent.nextInt();
        if(opcion == 1){
            cancion = new Cancion(crear_artista(), crear_album(), crear_reggaeton(), duracion, nombre_cancion);
            b.agregar_cancion(cancion);
        }else if(opcion == 2){
            cancion = new Cancion(crear_artista(), crear_album(), crear_salsa(), duracion, nombre_cancion);
            b.agregar_cancion(cancion);
        }
    }
    
    public static Genero crear_reggaeton(int opcion){
        return new Genero("reggaeton", "1990", "Puerto Rico", "95 BPM"); 
    }

    public static Genero crear_salsa(int opcion){
        return new Genero("salsa", "1950", "Cuba", "Son cubano"); 
    }
    
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        boolean estado = true;
        boolean estado_interno = true;
        Scanner entrada = new Scanner(System.in);
        Scanner ent = new Scanner(System.in);
        int menu_inicio = 0;
        int menu_interno = 0;
        String album ="";
        String artista="";
        String genero="";
        do {            
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a la Radio USB!!\nSeleccione un opcion:");
            System.out.println("1.Agregar una canción\n2.Buscar canción\n3.Salir");
            System.out.println("--------------------------------------------------");
            menu_inicio = entrada.nextInt();
            switch(menu_inicio){
                case 1:
                    crear_cancion(biblio);
                    biblio.mostrar_canciones();
                    break;
                case 2:
                    //do{
                    System.out.println("--------------------------------------------------");
                    System.out.println("Seleccione la categoria");
                    System.out.println("1.Album\n2.Artista\n3.Genero\n3.Volver");
                    System.out.println("--------------------------------------------------");
                    menu_interno = entrada.nextInt();
                    switch(menu_interno){
                        case 1:
                            System.out.println("--------------------------------------------------");
                            System.out.println("Digite el nombre del album");
                            System.out.println("--------------------------------------------------");
                            album = ent.nextLine();
                            biblio.buscar_por_album(album);
                            break;
                        case 2:
                            System.out.println("--------------------------------------------------");
                            System.out.println("Digite el nombre artistico");
                            System.out.println("--------------------------------------------------");
                            artista = ent.nextLine();
                            biblio.buscar_por_artista(artista);
                            break;
                        case 3:
                            System.out.println("--------------------------------------------------");
                            System.out.println("Digite el nombre del genero");
                            System.out.println("--------------------------------------------------");
                            genero = ent.nextLine();
                            biblio.buscar_por_genero(genero);
                            break;
                        case 4:
                            estado_interno = false;
                            break;
                    }
                    //}while(estado_interno);
                    break;
                case 3:
                    estado = false;
                    break;
            }
        } while (estado);
        
    }
    
}
