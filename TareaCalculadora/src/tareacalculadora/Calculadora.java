package tareacalculadora;

public class Calculadora {

    public Calculadora() {
    }
    
    public int suma(int a, int b){
        return a + b;
    }
    
    public int resta(int a, int b){
        return a - b;
    }
    
    public int multiplicacion(int a, int b){
        return a * b;
    }
    
    public float division(int a, int b){
        if (b == 0){
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (float)a / (float)b;
    }
}
