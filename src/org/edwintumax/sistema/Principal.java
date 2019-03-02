package org.edwintumax.sistema;

import java.util.Date;
import org.edwintumax.bean.Book;
import org.edwintumax.exception.ValidarException;
import org.edwintumax.util.ManejadorDeArchivos;

public class Principal {

    public static void main(String args[]) {
        try {
            String authors[] = {"Juan Perez", "Julio Martinez"};
            Book lista[] = new Book[5];
            lista[0] = new Book("Book1", new Date(), "Editorial 1", authors);
            lista[1] = new Book("Book2", new Date(), "Editorial 2", authors);
            lista[2] = new Book("Book3", new Date(), "Editorial 3", authors);
            lista[3] = new Book("Book4", new Date(), "Editorial 4", authors);
            lista[4] = new Book("Book5", new Date(), "Editorial 5", authors);
            lista[0].setIsbn("1111");
            lista[1].setIsbn("2222");
            lista[2].setIsbn("3333");
            lista[3].setIsbn("4444");
            lista[4].setIsbn("5555");
            imprimirLibros(lista);
            guardarInformacion(lista);
        } catch (ValidarException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Esto siempre se ejecuta si o no, existe un exception");
        }
        /*long inicio = new Date().getTime();
        String salida = "";
        StringBuffer otro = new StringBuffer();
        for(int i = 0; i < 100000; i++){
            salida = salida + "Tumax!!!";
            otro.append("Tumax!!!");
        }
        long fin = new Date().getTime();
        System.out.println("Tiempo: " + (fin - inicio));
        System.out.println(otro.toString());*/
    }

    public static void imprimirLibros(Book[] libros) throws ValidarException {
        try {
            for (int i = 0; i < libros.length; i++) {
                System.out.println(libros[i]);
            }
        } catch (Exception e) {
            throw new ValidarException();
        }
    }

    public static void guardarInformacion(Book[] libros) {
        ManejadorDeArchivos manejador = new ManejadorDeArchivos("books.txt");
        for (int i = 0; i < libros.length; i++) {
            manejador.escribir(libros[i].toString());
        }
    }
}
