package Aula01ListadeOperadores2;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anoNasc1;
        int anoNasc2;
        boolean resultado;

        System.out.println("Informe o ano de nascimento 1: ");
        anoNasc1 = ler.nextInt();;
        System.out.println("Informe o ano de nascimento 2: ");
        anoNasc2 = ler.nextInt();

        resultado=(anoNasc1 < anoNasc2);

        System.out.println("A pessoa 1 é mais nova quuee a pessoa 2?"+resultado);

    }
}
