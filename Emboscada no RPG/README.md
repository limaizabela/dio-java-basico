## Desafio
Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados. Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terrível goblin. Como em todo bom RPG, temos alguns parâmetros que definem os status dos personagens:

Vida: Pontos que devem ser maiores que 0, se não o personagem morre.
Ataque: Pontos que definem quanto de dano ele inflingirá nos outros personagens.
Defesa: Pontos que definem quanto dano será mitigado quando ele levar um ataque.

O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser somado ao seu ataque ou a sua defesa. Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um crítico e essa soma deve ser DOBRADA.

O dano causado ao jogador é calculado dessa forma:
vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))

O dano causado ao inimigo é calculado dessa forma:
vidaDoInimigo - (ataqueDoJogador + dados)

Caso o jogador sobreviva a emboscada, ele contra-ataca.

Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, você decidiu criar esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.

## Entrada
A entrada serão seis parâmetros nessa ordem:
Dados;
Vida do Jogador;
Ataque do Jogador;
Defesa do Jogador
Vida do Inimigo;
Ataque do Inimigo;

## Saída
A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha sobrevivido, verificar se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em seguida, para cada caso, imprima na tela as respectivas ocorrências.