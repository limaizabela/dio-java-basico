import java.util.Scanner;

public class EmboscadaNoRPG {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Número: ");
        int dados = leitor.nextInt();
        System.out.println("Número: ");
        int vidaDoJogador = leitor.nextInt();
        System.out.println("Número: ");
        int ataqueDoJogador = leitor.nextInt();
        System.out.println("Número: ");
        int defesaDoJogador = leitor.nextInt();
        System.out.println("Número: ");
        int vidaDoInimigo = leitor.nextInt();
        System.out.println("Número: ");
        int ataqueDoInimigo = leitor.nextInt();

        vidaDoJogador -= ataqueDoInimigo - (defesaDoJogador + dados);

        if (vidaDoJogador > 0) {

            vidaDoInimigo -= ataqueDoJogador + dados;

            if (vidaDoInimigo <= 0) {
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        } else {
            System.out.println("Jogador nao sobreviveu");
        }
    }
}
