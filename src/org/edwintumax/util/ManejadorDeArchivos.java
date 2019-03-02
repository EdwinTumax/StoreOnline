package org.edwintumax.util;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejadorDeArchivos {
    private PrintWriter escritor;
    private BufferedReader lector;

    public ManejadorDeArchivos(String nombre) {
        FileWriter escritorDeArchivo = null;
        try{
            escritorDeArchivo = new FileWriter(nombre,true);
        }catch(IOException e){
            System.out.println("Error al intentar escribir el archivo");
        }
        escritor = new PrintWriter(escritorDeArchivo,true);
    }    
    public void escribir(String texto){
        escritor.println(texto);
    }
}







