package Videojuegos;

import Videojuegos.Utilidades.EntradaDatos;
import Videojuegos.Utilidades.Fichero;

import static Videojuegos.Utilidades.EntradaDatos.pedirCadena;
import static Videojuegos.Utilidades.EntradaDatos.pedirDouble;
import static Videojuegos.Utilidades.EntradaDatos.pedirEntero;

/**
 * Created by DAM on 30/9/16.
 */
public class Videojuegos {
    private static GameList misJuegos;
    private static Fichero miFichero;

    public static void main(String[] args){
        miFichero = new Fichero("juegos.xml");
        misJuegos = (GameList) miFichero.leer();
        if(misJuegos == null){
            misJuegos = new GameList();
        }
        int opcion;
        do{
            mostrarMenu();
            opcion = EntradaDatos.pedirEntero("Escoge una opción");
            switch (opcion){
                case 1:
                    newGame();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while (opcion != 0);
    }

    private static void newGame() {
        String nombre;
        do {
            nombre = pedirCadena("Nombre: ");
            if (nombre.equals("")){
                System.out.println("No se puede dejar en blanco.");
            }
        }while(nombre.equals(""));
        String genero;
        do {
            genero = pedirCadena("Genero: ");
            if (genero.equals("")){
                System.out.println("No se puede dejar en blanco.");
            }
        }while(genero.equals(""));
        int puntos;
        do{
            puntos = pedirEntero("Valoración: ");
            if (puntos < 0 || puntos > 10){
                System.out.println("Debe estar entre 0 y 10");
            }
        }while (puntos < 0 || puntos > 10);
        double precio;
        do{
            precio = pedirDouble("Precio: ");
            if (precio < 0){
                System.out.println("No puede ser negativo");
            }
        }while (precio < 0);
        String respuesta;
        boolean enPropiedad;
        do{
            respuesta = pedirCadena("¿LO TIENES (SI/NO)? ");
            if (respuesta.equalsIgnoreCase("si")){
                enPropiedad = true;
            }
            else if (respuesta.equalsIgnoreCase("no")) {
                enPropiedad = false;
            }
            else {
                System.out.println("Respuesta incorrecta. Escribe si o no");
            }

        }while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("no"));

    }

    private static void mostrarMenu(){
        System.out.println("1. Nuevo juego:");
        System.out.println("2. ");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("Salir");
    }
}
