import java.util.Random;
public class Tabela {
    // tabela.length = linhas  &&  tabela[0].length = colunas
    public Celula[][] tabela;
    public boolean endgame;
    public boolean gameWin;

    public Tabela(int linhas, int colunas){
        tabela = new Celula[linhas][colunas];
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                tabela[i][j] = new Celula(); } } }

    public void imprimir(){
        for (int i = 0; i < tabela.length ; i++) {
            for (int j = 0; j < tabela[i].length ; j++) {
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println(); } }

    public void colocarBombas(){
        int qtdBombas = (int) Math.round((tabela.length * tabela[0].length) * 0.25);
        int bombasColocadas = 0;
        Random random = new Random();

        while (bombasColocadas < qtdBombas){
            int i = random.nextInt(tabela.length);
            int j = random.nextInt(tabela[0].length);

            if (!tabela[i][j].temBomba){
                tabela[i][j].temBomba = true;
                bombasColocadas++; } } }

    public void calcularBombasArd(){ //around 😎 //bglh mais dificil disparado
        for (int i = 0; i < tabela.length; i++){
            for (int j = 0; j < tabela[0].length; j++){
                int contador = 0;

                for (int dx = -1; dx <= 1; dx++){
                    for (int dy = -1; dy <= 1; dy++){
                        if (dx == 0 && dy == 0) continue;
                        int vizinhoLinha = i + dx;
                        int vizinhoColuna = j + dy;

                        if (vizinhoLinha >= 0 && vizinhoLinha < tabela.length && vizinhoColuna >= 0 && vizinhoColuna < tabela[0].length){ //out of bounds
                            if (tabela[vizinhoLinha][vizinhoColuna].temBomba){
                            contador++; } } } } 
            tabela[i][j].bombasAoRedor = contador;} } } //meudeus quanta coisa

    public void revelarTudo(){
        for (int i = 0; i < tabela.length; i++){
            for (int j = 0; j < tabela[i].length; j++){
                tabela[i][j].reveal = true;
            } } }

    public void toggleFlag(int linha, int coluna){
        tabela[linha][coluna].flagged = !tabela[linha][coluna].flagged;
    }

    public void reveal(int linha, int coluna){
    
        if (linha >= 0 && linha < tabela.length && coluna >= 0 && coluna < tabela[0].length){ //out of bounds inicial
            if (!tabela[linha][coluna].reveal){
                if (!tabela[linha][coluna].temBomba){ //reveal inicial
                    tabela[linha][coluna].reveal = true;

                    for (int dx = -1; dx <= 1; dx++){
                    for (int dy = -1; dy <= 1; dy++){
                        int linhaReveal = linha + dx;
                        int colunaReveal = coluna + dy;

                        if (linhaReveal >= 0 && linhaReveal < tabela.length && colunaReveal >= 0 && colunaReveal < tabela[0].length) { //out of bounds linha
                            if(!tabela[linhaReveal][colunaReveal].temBomba){
                            tabela[linhaReveal][colunaReveal].reveal = true;   
                            }
                    }}}
                } else {
                    tabela[linha][coluna].reveal = true;
                    endgame = true; //reveal inicial
                }} else {
                System.out.println("Célula já reveleada.");
        }}}

    public boolean checarVitoria(){
        gameWin = true;
        for (int i = 0; i < tabela.length; i++){
            for (int j = 0; j < tabela[0].length; j++){
                if(!tabela[i][j].reveal && !tabela[i][j].temBomba){ //celulas seguras nao reveladas == jogo not over
                    gameWin = false;
                }}}
        return gameWin;
    }
}
