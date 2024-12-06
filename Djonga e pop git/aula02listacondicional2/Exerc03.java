package aula02listacondicional2;
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1;

        System.out.println("Digite um numero: ");
        num1 = ler.nextInt();

        if(num1 >10 && num1 < 100){
            System.out.println(" número é maior que 10 e menor que 100");
        }else{
            System.out.println("O número não está no intervalo entre 10 e 100");
        }
    }
}