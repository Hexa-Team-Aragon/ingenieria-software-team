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
public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Farenheit 451", "555", "Bradbury");
        String pp = libro1.PasarPagina();
        System.out.println(pp);
        String ts = libro1.toString();
        System.out.println(ts);
    }
}
