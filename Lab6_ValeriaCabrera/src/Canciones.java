
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Canciones {
    
    private String nombre;
    private int puntuacion;
    private Date year;
    private String artista;
    private String album;

    public Canciones() {
    }

    public Canciones(String nombre, int puntuacion, Date year, String artista, String album) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.year = year;
        this.artista = artista;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + ", year=" + year + ", artista=" + artista + ", album=" + album + '}';
    }
    
    
    
    
}
