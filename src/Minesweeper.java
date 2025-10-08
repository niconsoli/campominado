import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); Random random = new Random();
        Tabela tab = new Tabela(0,0);
        int opt; String jogada = ""; String[] jogadaArray; String acao; int linha; int coluna;
        System.out.println("Bem-vindo ao Campo Minado!");
        System.out.println("1. Fácil (8x8)");
        System.out.println("2. Intermediário (16x16)");
        System.out.println("3. Difícil (32x32)");
        System.out.print("Selecione a dificuldade que deseja jogar: ");
        opt = sc.nextInt(); sc.nextLine(); //segundo nextLine é um debug p linha 31

        switch (opt){
            case 1:
                tab = new Tabela(8,8);
                tab.imprimir();
                System.out.println("Todas as jogadas devem seguir o padrão abaixo:");
                System.out.println("(ação) (linha) (coluna)");
                System.out.println("Exemplos:");
                System.out.println("reveal 1 3 (revela a célula 1x3), flag 3 2 (bandeira a célula 3x2), reveal 4 4 (revela a célula 4x4)");
                System.out.println("Usar flag em uma região que já tem bandeira tirará a bandeira dali.");
                tab.colocarBombas();
                tab.calcularBombasArd();
                while (!tab.endgame && !tab.gameWin){
                    System.out.print("Digite sua jogada a seguir: ");
                    jogada = sc.nextLine();
                    jogadaArray = jogada.split(" ");
                    acao = jogadaArray[0];
                    linha = Integer.parseInt(jogadaArray[1]) - 1;
                    coluna = Integer.parseInt(jogadaArray[2]) - 1;
                    if (linha >= 0 && linha < tab.tabela.length && coluna >= 0 && coluna < tab.tabela[0].length){
                    switch (acao){
                        case "reveal":
                        tab.reveal(linha, coluna);
                        break;
                        case "flag":
                        tab.toggleFlag(linha, coluna);
                        break;
                        case "rvtd":
                        tab.revelarTudo();
                        break;
                        default:
                        System.out.print("Ação inválida, tente novamente."); System.out.println();
                        break;}}
                    tab.checarVitoria();
                    tab.imprimir();}
                if (tab.endgame){
                    System.out.println();
                    tab.revelarTudo();
                    tab.imprimir();
                    System.out.println("Você perdeu!");} 
                if (tab.gameWin){
                    System.out.println("Parabéns, você venceu!");}
            break;
            case 2:
                tab = new Tabela(16,16);
                                tab.imprimir();
                System.out.println("Todas as jogadas devem seguir o padrão abaixo:");
                System.out.println("(ação) (linha) (coluna)");
                System.out.println("Exemplos:");
                System.out.println("reveal 1 3 (revela a célula 1x3), flag 3 2 (bandeira a célula 3x2), reveal 4 4 (revela a célula 4x4)");
                System.out.println("Usar flag em uma região que já tem bandeira tirará a bandeira dali.");
                tab.colocarBombas();
                tab.calcularBombasArd();
                while (!tab.endgame && !tab.gameWin){
                    System.out.print("Digite sua jogada a seguir: ");
                    jogada = sc.nextLine();
                    jogadaArray = jogada.split(" ");
                    acao = jogadaArray[0];
                    linha = Integer.parseInt(jogadaArray[1]) - 1;
                    coluna = Integer.parseInt(jogadaArray[2]) - 1;
                    if (linha >= 0 && linha < tab.tabela.length && coluna >= 0 && coluna < tab.tabela[0].length){
                    switch (acao){
                        case "reveal":
                        tab.reveal(linha, coluna);
                        break;
                        case "flag":
                        tab.toggleFlag(linha, coluna);
                        break;
                        case "rvtd":
                        tab.revelarTudo();
                        break;
                        default:
                        System.out.print("Ação inválida, tente novamente."); System.out.println();
                        break;}}
                    tab.checarVitoria();
                    tab.imprimir();}
                if (tab.endgame){
                    System.out.println();
                    tab.revelarTudo();
                    tab.imprimir();
                    System.out.println("Você perdeu!");} 
                if (tab.gameWin){
                    System.out.println("Parabéns, você venceu!");}
            break;
            case 3:
                tab = new Tabela(32,32);
                                tab.imprimir();
                System.out.println("Todas as jogadas devem seguir o padrão abaixo:");
                System.out.println("(ação) (linha) (coluna)");
                System.out.println("Exemplos:");
                System.out.println("reveal 1 3 (revela a célula 1x3), flag 3 2 (bandeira a célula 3x2), reveal 4 4 (revela a célula 4x4)");
                System.out.println("Usar flag em uma região que já tem bandeira tirará a bandeira dali.");
                tab.colocarBombas();
                tab.calcularBombasArd();
                while (!tab.endgame && !tab.gameWin){
                    System.out.print("Digite sua jogada a seguir: ");
                    jogada = sc.nextLine();
                    jogadaArray = jogada.split(" ");
                    acao = jogadaArray[0];
                    linha = Integer.parseInt(jogadaArray[1]) - 1;
                    coluna = Integer.parseInt(jogadaArray[2]) - 1;
                    if (linha >= 0 && linha < tab.tabela.length && coluna >= 0 && coluna < tab.tabela[0].length){
                    switch (acao){
                        case "reveal":
                        tab.reveal(linha, coluna);
                        break;
                        case "flag":
                        tab.toggleFlag(linha, coluna);
                        break;
                        case "rvtd":
                        tab.revelarTudo();
                        break;
                        default:
                        System.out.print("Ação inválida, tente novamente."); System.out.println();
                        break;}}
                    tab.checarVitoria();
                    tab.imprimir();}
                if (tab.endgame){
                    System.out.println();
                    tab.revelarTudo();
                    tab.imprimir();
                    System.out.println("Você perdeu!");} 
                if (tab.gameWin){
                    System.out.println("Parabéns, você venceu!");}
            break;
            default:
            System.out.println("Valor inserido incorretamente. Reiniciando sistema...");
        }
    }
}