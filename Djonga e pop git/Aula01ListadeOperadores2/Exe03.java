import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String texto1,texto2;
        boolean diferentes;
        System.out.println(" Insira seu primeiro texto: ");
        texto1= ler.nextLine();
        System.out.println("Insira o segundo texto: ");
        texto2= ler.nextLine();


        diferentes = texto1.equals(texto2);
        System.out.println("Os textos são iguais? " + diferentes);



    }
}