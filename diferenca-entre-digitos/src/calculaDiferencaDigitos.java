import java.util.Arrays;
import java.util.Scanner;

public class calculaDiferencaDigitos {
    public static void main(String[] args) throws Exception {
        int produto = 1;
        int soma = 0;
        int digito = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = scan.nextInt();

        while (numero != 0){
            
            digito = numero % 10;
            System.out.println("Dígito: " + digito);
            numero = numero / 10;
            soma = soma + digito;
            //System.out.println("Soma: " + soma);
            produto = produto * digito;     
            //System.out.println("Produto: " + produto);

        }

        int diferenca = produto - soma; 
        System.out.println("Diferença: " + diferenca);

       /*  String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
 */
    }
}