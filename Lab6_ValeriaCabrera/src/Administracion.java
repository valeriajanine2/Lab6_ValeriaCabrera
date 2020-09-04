import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Administracion {
    
    private ArrayList<Canciones> listaCanciones = new ArrayList();
    private File archivo = null;

    public Administracion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Canciones> getListaVehiculos() {
        return listaCanciones;
    }

    public void setListaVehiculos(ArrayList<Canciones> listaVehiculos) {
        this.listaCanciones = listaCanciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCanciones=" + listaCanciones;
    }
    
    //extra mutador
    public void setVehiculo(Canciones v){
        this.listaCanciones.add(v);
    }
    
    //metodos de administracion
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Canciones list : listaCanciones) {
                bw.write(list.getNombre()+"|");
                bw.write(list.getPuntuacion()+"|");
                bw.write(list.getYear()+"|");
                bw.write(list.getArtista()+"|");
                bw.write(list.getAlbum()+"|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        listaCanciones = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listaCanciones.add(new Canciones(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }

    
}

