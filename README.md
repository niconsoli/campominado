## Campo Minado!

Feito inteiramente em Java, este projeto simula o jogo eterno Campo Minado com muitas das funcionalidades clássicas!

## Regras do jogo

- Revele células;
- Os números que cada célula possui representa quantas bombas estão ao redor desta mesma
<img width="250" height="250" alt="image" src="https://github.com/user-attachments/assets/ffeaff08-68e4-4dbe-864b-09df86e7aa00" />

| Como mostra a imagem acima, o número representa exatamente quantas bombas estão em um quadrado 3x3, com a célula numerada como a central. No caso específico da imagem, apesar de sabermos que há seis bombas ao redor da célula central, não conseguimos saber aonde estas bombas estão.

- Marque com bandeiras as células das quais você sabe que podem ter bombas!
- Revele todas as células seguras do jogo para vencer!

## Demonstração

Ao iniciar o código, você será recebido com um pequeno menu de escolha de dificuldades. Digite o número de acordo com qual dificuldade deseja jogar e assim procede o programa.

<img width="374" height="95" alt="image" src="https://github.com/user-attachments/assets/f1e04433-52ae-4d24-890f-fffa431dbe16" />


No exemplo abaixo, foi requisitado um jogo no modo Fácil, por isso, recebemos uma grade 8x8 de pontos de interrogação `(onde cada ponto de interrogação significa uma célula ainda não revelada!)`.

<img width="250" height="250" alt="image" src="https://github.com/user-attachments/assets/4286fdd0-db13-4c05-a9d1-b551c57341a2" />


A fim de realizar as jogadas neste Campo Minado, o jogador deve seguir um padrão determinado e explicado pelo menu do sistema.
Deve ser enviado ao programa no exato padrão de `ação`, `linha` e `coluna`, separados por espaços, a fim de que o código entenda.
<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/9ff2dcb5-4265-4827-99d7-a1ee4a1faae3" />

| Dos exemplos acima, `reveal` `1` `3` implica que a célula da `primeira` linha e da `terceira` coluna seja `revelada`, `flag` `3` `2` implica que a célula da `terceira` linha e da `segunda` coluna receba uma `bandeira`, e por aí vai!
| OBS.: Utilizar o comando `flag` em uma célula que já contém bandeira `removerá` a bandeira da mesma!

Assim que encerrado, o jogo deve te parabenizar por vencer o jogo e te mostrar uma última vez a grade, com as células seguras reveladas!
<img width="250" height="250" alt="image" src="https://github.com/user-attachments/assets/e8f3cf1c-27fa-4ec7-b3a6-ede673356cc9" />

## Instalação

| Passo a passo para realizar a instalação deste Campo Minado <b>sem Git!</b>

- Acesse os [`releases`](https://github.com/niconsoli/campominado/releases);
- Realize o download do jar mais atualizado;
- Abra o terminal;
- Digite `java -jar [caminho-do-arquivo]`;
| Em `[caminho-do-arquivo]` insira o caminho completo do arquivo baixado, como por exemplo: "C:\Users\Usuário\Downloads\Campo Minado.jar"
- Se divirta!











