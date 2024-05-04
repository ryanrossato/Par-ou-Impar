import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){

        System.out.println("Qual número deseja saber se é par ou impar? ");
        System.out.println("Para sair digite -1");
        int numero = entrada.nextInt();

            if(numero == -1){
                System.out.println("PROGRAMA FINALIZADO!");
                continuar = false;
                continue;
            }

        int soma = numero%2;

        System.out.println("Resultado:");

        if (soma == 0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }

    }


        entrada.close();
    }
}
