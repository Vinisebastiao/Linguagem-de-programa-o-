package aula02listacondicional2;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);

        float num;

        System.out.println("Digite um número: ");
        num = ler.nextFloat();

        if(num <0 || num >=5 && num<=15){
            System.out.println("O número é negativo ou está entre 5 e 15");
        }else{
            System.out.println(" número não é negativo e não está entre 5 e 15");
        }
    }
}
