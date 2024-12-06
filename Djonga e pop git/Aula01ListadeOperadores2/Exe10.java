package Aula01ListadeOperadores2;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra1;
        String palavra2;
        boolean resultado;

        System.out.println("Digite a primeira palavra: ");
        palavra1= ler.nextLine();
        System.out.println("Digite a segunda palavra: ");
        palavra2= ler.nextLine();

        int tamanho1 = palavra1.length();
        int tamanho2 = palavra2.length();

        resultado = tamanho1>tamanho2;

        System.out.println("O tamanho da primeira é maior do que a segunda? "+ resultado );
    }
}