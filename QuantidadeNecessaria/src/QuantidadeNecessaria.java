import java.util.Scanner;

public class QuantidadeNecessaria {

    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de caso de testes: ");
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println("Informe a quantidade de amigos: ");
            int N = scanner.nextInt();
            System.out.println("Informe a quantidade de fatias necessárias: ");
            int X = scanner.nextInt();

            int quantPizzas = (N * X + 3) / SLICE; //(1 * 5 + 3) / 4 = 2

            System.out.println(quantPizzas);
        }
    }
    
}