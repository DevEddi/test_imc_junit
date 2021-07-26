package aplication;

import entities.IMC;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        IMC imc = new IMC();
        System.out.println("Digite o seu peso: ");
        imc.setPeso(sc.nextDouble());
        System.out.println("Digite o seu altura: ");
        imc.setAltura(sc.nextDouble());
        System.out.printf("O seu IMC: %.2f", imc.calculcaImc());
        System.out.println();
        System.out.println("Você está com saúde??? ");
        System.out.println(imc.saudavel());



        sc.close();
    }

}
