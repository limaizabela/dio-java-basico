import java.util.Scanner;

public class MinimoMultiplo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Informe um número inteiro: ");
			int numero = scanner.nextInt();
			
//TODO: Crie as outras condições necessárias para a resolução do desafio.
			int minimoMultiplo = 0;
			if (numero % 2 == 0) {
			    minimoMultiplo = numero;
			} else {
			    minimoMultiplo = numero * 2;
			}
			
			System.out.println("O resultado é:c" + minimoMultiplo);
		}
        }
}
