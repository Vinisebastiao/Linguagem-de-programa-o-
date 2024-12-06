package Aula01ListadeOperadores2;

import java.util.Scanner;


public class exe02 {
    public static void main(String[] args) {




        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        boolean Maior;


        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        n2 = ler.nextInt();


        Maior = (n1>n2);
        System.out.println("O número 1 é maior que o número? "+ Maior);
    }
}
