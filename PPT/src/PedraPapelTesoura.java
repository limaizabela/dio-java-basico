
import java.util.Scanner;  

public class PedraPapelTesoura {  
    public static void main(String[] args){  

        Scanner leitor = new Scanner(System.in);
        int jogadaJogador,jogadaInimigo; 

        System.out.println("Jogador 1: ");
        jogadaJogador = leitor.nextInt();
                
        System.out.println("Jogador 2: ");
        jogadaInimigo = leitor.nextInt(); 
    
        if (jogadaJogador == 1 && jogadaInimigo == 1){
             System.out.println("Empatou");
        } else if (jogadaJogador == 1 && jogadaInimigo == 2){
             System.out.println("Perdeu");
        } else if (jogadaJogador == 1 && jogadaInimigo == 3){                               
             System.out.println("Ganhou");
        } else if (jogadaJogador == 2 && jogadaInimigo == 1){                               
             System.out.println("Ganhou");
        } else if (jogadaJogador == 2 && jogadaInimigo == 2){                               
             System.out.println("Empatou");
        } else if (jogadaJogador == 2 && jogadaInimigo == 3){                               
             System.out.println("Perdeu");
        } else if (jogadaJogador == 3 && jogadaInimigo == 1){                               
             System.out.println("Perdeu");
        } else if (jogadaJogador == 3 && jogadaInimigo == 2){                               
             System.out.println("Ganhou");
        } else if (jogadaJogador == 3 && jogadaInimigo == 3){                               
             System.out.println("Empatou");
        } else {
             System.out.println ("OPÇÃO INVÁLIDA");
        }
                                
     }  

}
