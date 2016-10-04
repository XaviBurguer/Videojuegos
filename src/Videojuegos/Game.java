package Videojuegos;

import java.io.Serializable;
/**
 * Created by DAM on 30/9/16.
 */
public class Game implements Serializable{
    private String nombre;
    private String genero;
    private int puntos;
    private double precio;
    private boolean enPropiedad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEnPropiedad() {
        return enPropiedad;
    }

    public void setEnPropiedad(boolean enPropiedad) {
        this.enPropiedad = enPropiedad;
    }
}
