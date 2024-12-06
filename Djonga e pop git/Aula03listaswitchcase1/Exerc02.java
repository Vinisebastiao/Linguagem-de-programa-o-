package Aula03listaswitchcase1;

public class Exerc02 {
    public static void main(String[] args) {

        util util = ;
        String letra = util.SolicitarPalavra("Digite uma letra:").toLowerCase();

        if (letra.length() == 1) {

            switch (letra.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ImprimiResultado("A letra é uma vogal");
                    break;
                default:
                    ImprimiResultado("A letra é uma consoante");
                    break;
            }
        }
    }
}
