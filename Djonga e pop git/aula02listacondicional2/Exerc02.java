package aula02listacondicional2;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1;

        System.out.println("Insira um número: ");
        num1 = ler.nextInt();

        if (num1 % 2 == 0 && num1 % 3 == 0){
            System.out.println("O número é par ou múltiplo de 3 ");
        } else{
            System.out.println("O número não é par nem múltiplo de 3 ");
        }
    }
}