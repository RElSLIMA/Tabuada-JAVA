import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("Digite um número para gerar sua tabuada ou 't' para ver a tabuada dos números de 1 a 10: ");
        Scanner entrada = new Scanner(System.in);

        while (true) {

            if (entrada.hasNextInt()) {
                int n = entrada.nextInt();
                System.out.println("");
                for (int i = 0; i <= 10; i++)
                    System.out.println(n + " x " + i + " = " + n * i);
                System.out.println("");
                System.out.println("Digite um novo valor para obter novos resultados ou 'x' para sair.");
            } 
            else if (entrada.hasNext("t")) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("");
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " x " + j + " = " + i * j);
                    }
                }
                System.out.println("");
                System.out.println("Digite um novo valor para obter novos resultados ou 'x' para sair.");
            } 
            else if (entrada.hasNext("x")) {
                System.out.println("Você saiu!");
                break;
            } 
            else {
                System.out.println("");
                System.out.println("Valor inválido, digite um valor válido ou aperte 'x' para sair");
                entrada.next();
            }

          System.out.println("");
          entrada.nextLine();
        }
      
        entrada.close();
    }
}
