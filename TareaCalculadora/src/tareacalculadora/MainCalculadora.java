/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacalculadora;

/**
 *
 * @author Usuario
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora("Casio", "cientifica", "Panel Solar", "LED");
        String cal = calculadora1.toString();
        System.out.println(cal);
        int resultadoSuma = calculadora1.suma(5, 4);
        System.out.println("El resultado de la suma es: " +resultadoSuma);
        int resultadoResta = calculadora1.resta(35, 44);
        System.out.println("El resultado de la resta es: " +resultadoResta);
        int resultadoMultiplicacion = calculadora1.multiplicacion(445, 43);
        System.out.println("El resultado de la multiplicacion es: " +resultadoMultiplicacion);
        float resultadoDivision = calculadora1.division(223, 3333);
        System.out.println("El resultado de la division es: " +resultadoDivision);
    }

}
