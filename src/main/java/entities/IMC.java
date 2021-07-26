package entities;

public class IMC {
    private double altura;
    private double peso;
    private double resultado;
    public double calculcaImc(){

        return  resultado = peso / (altura * altura);
    }

    public String saudavel(){
        if (resultado <= 19.1) {          //1
            return "Abaixo do peso";       //2
        } else if (resultado <= 25.8) {    //3
            return "Peso ideal";            //4
        } else if (resultado <= 27.3) {        //5
            return "marginalmente acima do peso";   //6
        } else if (resultado <= 32.3) {             //7
            return "acima do peso ideal";           //8
        } else  {
            return "Obeso";                         //9
        }
    }                                              //10

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
