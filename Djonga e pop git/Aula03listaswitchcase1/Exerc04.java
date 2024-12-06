package Aula03listaswitchcase1;

public class Exerc04 {
        public static void main(String[] args) {

            double nota1 = util.SolicitaNumeroInteiro("Digite a primeira nota (0 a 10):");
            double nota2 = util.SolicitaNumeroInteiro("Digite a segunda nota (0 a 10):");
            double nota3 = util.SolicitaNumeroInteiro("Digite a terceira nota (0 a 10):");

            if (isNotaValida(nota1) && isNotaValida(nota2) && isNotaValida(nota3)) {

                double media = (nota1 + nota2 + nota3) / 3;

                if (media >= 7) {
                 util.'ImprimiResultado("Aprovado");
                } else if (media >= 4) {
                    ImprimiResultado("Em recuperação");
                } else {
                    ImprimiResultado("Reprovado");
                }
            } else {
                ImprimiResultado("Nota inválida");
            }
        }

        public static boolean isNotaValida(double nota) {
            return nota >= 0 && nota <= 10;
        }
    }
}
