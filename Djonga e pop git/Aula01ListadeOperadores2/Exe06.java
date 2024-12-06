import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char caracter1,caracter2;
        boolean diferente;

        System.out.println("Digite o primeiro caracter: ");
        caracter1 = ler.next().charAt(0);
        System.out.println("Digite o segundo caracter: ");
        caracter2 = ler.next().charAt(0);

        diferente = caracter1 == caracter2;
        System.out.println("Os caracteres diferentes: " + diferente);
    }
}
