package tareacalculadora;

public class Calculadora {
    
    private String marca;
    private String cientifica;
    private String fuenteDeEnergia;
    private String tipoDePatalla;

    public Calculadora() {
    }
    
    public Calculadora(String marca, String cientifica, String fuenteDeEnergia, String tipoDePatalla) {
        this.marca = marca;
        this.cientifica = cientifica;
        this.fuenteDeEnergia = fuenteDeEnergia;
        this.tipoDePatalla = tipoDePatalla;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getCientifica() {
        return cientifica;
    }

    public String getFuenteDeEnergia() {
        return fuenteDeEnergia;
    }

    public String getTipoDePatalla() {
        return tipoDePatalla;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCientifica(String cientifica) {
        this.cientifica = cientifica;
    }

    public void setFuenteDeEnergia(String fuenteDeEnergia) {
        this.fuenteDeEnergia = fuenteDeEnergia;
    }

    public void setTipoDePatalla(String tipoDePatalla) {
        this.tipoDePatalla = tipoDePatalla;
    }
    
    @Override
    public String toString(){
        return "Calculadora " + cientifica + " marca: " + marca + " con " + fuenteDeEnergia + " y pantalla " + tipoDePatalla;
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
