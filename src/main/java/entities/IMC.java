package entities;

public class IMC {
    private double altura;
    private double peso;
    private double resultado;
    public double calculcaImc(){

        return  resultado = peso / (altura * altura);
    }

    public String saudavel(){
        if (resultado <= 20.7) {
            return "Abaixo do peso";
        } else if (resultado <= 26.4) {
            return "Peso ideal";
        } else if (resultado <= 27.8) {
            return "marginalmente acima do peso";
        } else if (resultado <= 31.1) {
            return "acima do peso ideal";
        } else  {
            return "Obeso";
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
