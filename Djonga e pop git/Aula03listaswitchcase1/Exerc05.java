package Aula03listaswitchcase1;

import java.util.Scanner;

public class Exerc05 {
    
        public static void main(String[] args) {

            int numero = util.SolicitaNumeroInteiro("Digite um número de 1 a 4:");

            switch (numero) {
                case 1:
                    ImprimiResultado("Primeiro quadrante (x positivo, y positivo)");
                    break;
                case 2:
                    ImprimiResultado("Segundo quadrante (x negativo, y positivo)");
                    break;
                case 3:
                    ImprimiResultado("Terceiro quadrante (x negativo, y negativo)");
                    break;
                case 4:
                    ImprimiResultado("Quarto quadrante (x positivo, y negativo)");
                    break;
                default:
                    ImprimiResultado("Número inválido");
                    break;
            }
        }
    }

}
