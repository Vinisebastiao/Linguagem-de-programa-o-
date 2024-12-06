package Aula01ListadeOperadores2;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float alt1, alt2;
        boolean diferente;
        System.out.println(" Digite a primeira altura: ");
        alt1 = ler.nextFloat();
        System.out.println(" Digite a segunda altura: ");
        alt2 = ler.nextFloat();

        diferente = (alt1 >= alt2);
        System.out.println(" A primeira altura é maior ou igual que a segunda? " + diferente);
    }
}