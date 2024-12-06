import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        float preco1, preco2;
        boolean diferentes;
        System.out.println("Digite o primeiro valor:");
        preco1 = ler.nextFloat();
        System.out.println("Digite o segundo valor:");
        preco2 = ler.nextFloat();


        diferentes = (preco1 <= preco2);
        System.out.println(" O primeiro preço é menor ou igual ao do segundo?: " + diferentes);
    }

}
