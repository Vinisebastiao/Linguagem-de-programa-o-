package Aula01ListadeOperadores2;

import java.util.Scanner;


public class exe01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int numero1;
        int numero2;


        boolean saoIguais;


        System.out.println("Informe um número: ");
        numero1 = ler.nextInt();


        System.out.println("Informe outro número: ");
        numero2 = ler.nextInt();


        saoIguais = (numero1 == numero2);


        System.out.println("Os números são iguais? " + saoIguais);


    }
}
