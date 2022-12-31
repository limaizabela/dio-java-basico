import java.util.*;

public class NumeroFeliz{
    public static void main(String[] args) {

        int dig;
        int soma;


        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe um número inteiro: ");
            int n = leitor.nextInt();

            while (n != 89 && n != 1){
                soma = 0;
                while (n > 0) {
                    dig = n%10;
                    n = n/10;
                    soma = soma + (dig*dig);
                }
                System.out.printf("soma= %d\n",soma);
                n = soma;

            }
            if (n == 1){
                System.out.printf("\nFeliz!\n",n);
            }else {
                System.out.printf("\nNão Feliz!\n",n);
            }
        }
    }
}