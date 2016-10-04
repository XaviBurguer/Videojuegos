package Videojuegos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DAM on 30/9/16.
 */
public class GameList implements Serializable{
    private ArrayList<Game> lista;

    public GameList() {
        this.lista = lista;
    }



    public ArrayList<Game> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Game> lista) {
        this.lista = lista;
    }
}
