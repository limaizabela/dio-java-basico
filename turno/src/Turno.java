// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.security.Signature;
import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe em qual turno você estuda (M/T/N): ");
        char turno = leitor.next().toUpperCase().charAt(0);

            if (turno == 'm' || turno == 'M') {
                System.out.println("Bom Dia!");
            }else if (turno == 'v' || turno == 'V') { 
                System.out.println("Boa tarde!");
            }else if (turno == 'n' || turno == 'N') { 
                System.out.println("Boa Noite!");
            }else{
                System.out.println("Valor Inválido!");
            }
              
    
        }

}