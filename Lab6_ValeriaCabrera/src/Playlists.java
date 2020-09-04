
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Playlists {
    
    private String nombre;
    private ArrayList<Canciones> songs = new ArrayList();

    public Playlists() {
    }

    public Playlists(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Canciones> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
