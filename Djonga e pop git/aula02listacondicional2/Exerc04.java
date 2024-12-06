package aula02listacondicional2;
import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        String possuiTitulo;

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println(" Possui título de eleitor? (S/N)");
        possuiTitulo = String.valueOf(ler.next().toUpperCase().charAt(0));

        if (idade >= 16 && possuiTitulo.equalsIgnoreCase("S") ){
            System.out.println(" A pessoa tem idade para votar e possui título de eleitor. ");
        }else {
            System.out.println(" A pessoa não tem idade para votar ou não possui título de eleitor. ");
        }
    }
}