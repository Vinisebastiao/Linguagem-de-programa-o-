package Aula03listaswitchcase1;

    import java.util.Scanner;

    public class util {
        static Scanner ler = new Scanner(System.in);

        public static int SolicitaNumeroInteiro(String msg){
            System.out.println(msg);
            return ler.nextInt();
        }

        public static String SolicitaPalavra(String msg){
            System.out.print(msg);
            return ler.next();
        }


        public static void ImprimiResultado(String msg){
            System.out.println(msg);
        }

        public static double SolicitaNumeroDecimal(){
            System.out.println("Digite um número: ");
            return ler.nextDouble();
        }
    }

