package Videojuegos.Utilidades;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by DAM on 30/9/16.
 */
public class Fichero {

    private String nombre;

    public Fichero(String nombre) {
        this.nombre = nombre;
    }
    public void grabar(Object o){
        try {
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));
            codificador.writeObject(o);
            codificador.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Object leer(){
        try {
            XMLDecoder decodificador = new XMLDecoder(new FileInputStream(new File(nombre)));
            Object o = decodificador.readObject();
            return o;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}