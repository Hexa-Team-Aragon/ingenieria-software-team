/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Lyzz
 */
public class Libro {
    private String nombre;
    private String editorial;
    private String autor;
    
    public Libro() {
    }

    public Libro(String nombre, String precio, String autor) {
        this.nombre = nombre;
        this.editorial = precio;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String PasarPagina(){
        return "Pasando a la siguiente página...";
    }

    @Override
    public String toString() {
        return "Libro: " + "\n- Nombre del libro: " + nombre + "\n- Editorial: " + editorial + "\n- Autor: " + autor;
    }
    
    
}
