import java.util.Scanner;

public class FlechaEscudoEspada{
    public static void main(String[] args) throws Exception {
            
        try (Scanner leitor = new Scanner(System.in)) {
            int jogadaJogador,jogadaInimigo;
                
            System.out.println("Escolha entre 1, 2 e 3 , sendo : ");
            System.out.println("Flecha = 1 ");
            System.out.println("Escudo = 2  ");
            System.out.println("Espada = 3");
                
            System.out.println("Jogador 1: ");
            jogadaJogador = leitor.nextInt();
                
            System.out.println("Jogador 2: ");
            jogadaInimigo = leitor.nextInt();
                
            switch (jogadaJogador){
                case 1: 
                    switch (jogadaInimigo){
                        case 1:
                            System.out.println("Empatou");
                            break;
                        case 2:
                            System.out.println("Jogador 2 ganhou");
                            break;
                        case 3:
                            System.out.println("Jogador 1 ganhou");
                            break;
                        default: 
                                System.out.println ("OPÇÃO INVÁLIDA");
                    } break;
                case 2:
                    switch(jogadaInimigo) {
                        case 1: 
                            System.out.println("Jogador 1 ganhou");
                            break;
                        case 2:
                            System.out.println("Empatou");
                            break;
                        case 3:
                            System.out.println("Jogador 2 ganhou");
                            break;
                        default: 
                            System.out.println ("OPÇÃO INVÁLIDA");
                    } break;
                case 3:
                    switch(jogadaInimigo) {
                            case 1:
                                System.out.println("Jogador 2 ganhou");
                                break;
                            case 2:
                                System.out.println("Jogador 1 ganhou");
                                break;
                            case 3:
                                System.out.println("Empatou");
                                break;
                            default: 
                                System.out.println ("OPÇÃO INVÁLIDA");
                    } break;
                default: 
                System.out.println ("OPÇÃO INVÁLIDA");
            }
        }
    }
   
}
