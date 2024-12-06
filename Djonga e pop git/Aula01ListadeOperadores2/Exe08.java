package Aula01ListadeOperadores2;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String string1;
        String string2;

        boolean diferente;

        System.out.println("Digite a primeira string: ");
        string1= ler.nextLine();
        System.out.println("Digite a segunda string: ");
        string2= ler.nextLine();

        int tamanho1 = string1.length();
        int tamanho2 = string2.length();

        diferente = tamanho1<tamanho2;

        System.out.println("O tamanho da primeira é menor do que a segunda? "+diferente);
    }
}
