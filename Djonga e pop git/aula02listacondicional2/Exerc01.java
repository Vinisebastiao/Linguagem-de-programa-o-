package aula02listacondicional2;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = ler.nextLine().toLowerCase();

        if(palavra.startsWith("a") && palavra. endsWith("z")){
            System.out.println("A palavra começa com ‘a’ e termina com ‘z’");
        }else{
            System.out.println("A palavra não começa com ‘a’ ou não termina com ‘z’");
        }

    }
}