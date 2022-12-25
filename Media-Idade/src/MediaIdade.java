
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe sua idade: ");
            int idade1 = leitor.nextInt();
            System.out.println("Informe sua idade: ");
            int idade2 = leitor.nextInt();
            System.out.println("Informe sua idade: ");
            int idade3 = leitor.nextInt();


            float media = (idade1+idade2+idade3)/3f;
            System.out.printf("A média das idades é: %.2f %n" , media);
            
            if( (media >= 0) && (media <= 25) ){
                System.out.println("Jovem!");
            } else if( (media >= 26) && (media <= 60)){
                System.out.println("Adulta!");
            } else if(media > 60){
                System.out.println("Idosa!");
            }
        }
 
    }

}
