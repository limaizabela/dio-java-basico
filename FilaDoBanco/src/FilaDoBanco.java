import java.util.Scanner;

public class FilaDoBanco {
 
    public static void main(String[] args) { 
    
    String nomesFila[] = new String[3];
    Scanner nome = new Scanner(System.in);
     
    int i;

    for (i = 0; i < nomesFila.length; i++) {
        System.out.println("Informe o nome: ");
        nomesFila[i] = nome.next();

    }

    System.out.println(nomesFila[0]+ " - está na posição: 1");
    System.out.println(nomesFila[1]+ " - está na posição: 2");
    System.out.println(nomesFila[2]+ " - está na posição: 3");
      
    }

}
