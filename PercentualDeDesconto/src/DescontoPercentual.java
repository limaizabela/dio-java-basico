import java.util.*;

public class DescontoPercentual {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Informe o valor original: ");
            int M = input.nextInt();
            System.out.println("Informe o valor com desconto: ");
            int S = input.nextInt(); 
            
            
            float desconto = (S - M);
            float desc = (desconto/M) * (-1) *100;
            int v = (int) desc;

            System.out.println("O desconto foi de " + v + "%");
            
        }
      
    }
}
