package Aula01ListadeOperadores2;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade1,idade2;
        boolean diferente;

        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = ler.nextInt();
        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = ler.nextInt();

        diferente = idade1 > idade2;

        System.out.println("A  primeira pessoa é mais velha? " + diferente);
    }
}
