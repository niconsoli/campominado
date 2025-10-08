import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

        System.out.println("Esta é uma calculadora funcional operando em java.");
        System.out.println("Para iniciar, informe qual operação deseja");

    while (true){
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Média aritmética");
        System.out.println("6. Potenciação");
        System.out.println("7. Radiciação");
        System.out.println("8. Fatorial");
        System.out.println("9. Logaritmo");
        System.out.println("10. Teorema de Pitágoras");
        System.out.println("11. MMC (Mínimo Múltiplo Comum)");
        System.out.println("12. MDC (Máximo Divisor Comum)");
        System.out.println("13. Seno");
        System.out.println("14. Cosseno");
        System.out.println("15. Tangente");
        System.out.println("16. Porcentagem");
        System.out.println("0. Sair");
        System.out.print("Digite sua opção a seguir: ");
        opt = sc.nextInt();
        int n = 0;

        if (opt == 0){
            System.out.println("Certo! Encerrando o programa...");
            break;
        }

        switch (opt) {
            case 1:
                System.out.println("Perfeito!");
                System.out.println("Então, faremos a soma simples de números.");
                System.out.println("Primeiro, por favor, informe quantos números estaremos somando");
                n = sc.nextInt();
                System.out.println("Perfeito, agora vamos realizar a soma!");
                System.out.println("Informe abaixo os números que serão somados");
                int soma = 0;
                
            for (int i = 1; i <= n; i++) {
                System.out.print("Número " + i + ": ");
                int valor = sc.nextInt();
                soma += valor;
            }

                System.out.println("O valor total da soma deu " + soma + "!");
            break;

            case 2:
                System.out.println("Certo!");
                System.out.println("Para realizarmos a subtração, primeiro precisamos saber quantos números subtraremos");
                System.out.print("Quantos números subtraremos?");
                n = sc.nextInt();
                System.out.println("Certo, agora informe os números a serem subtraídos ");
                System.out.print("Número 1: ");
                int subtracao = sc.nextInt();

            for (int i = 2; i <= n; i++) {
                System.out.print("Número " + i + ": ");
                int valor = sc.nextInt();
                subtracao -= valor;
            }
            
                System.out.println("O valor total da subtração deu " + subtracao + "!");
            break;

            case 3:
                System.out.println("Ok!");
                System.out.println("Vamos realizar a multiplicação!");
                System.out.print("Quantos números multiplicaremos? ");
                n = sc.nextInt();
                System.out.print("Agora, nomeie quais números estaremos multiplicando! ");
                int multiplicacao = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print("Número " + i + ": ");
                int valor = sc.nextInt();
                multiplicacao *= valor;
            }    

                System.out.println("O valor total da multiplicação deu " + multiplicacao + "!");
            break;

            case 4:
                System.out.println("Beleza!");
                System.out.println("A divisão requer geralmente somente dois números");
                System.out.println("O dividendo, o número a ser dividido");
                System.out.println("E o divisor, o número que estará o dividindo");
                System.out.print("Me informe qual o dividendo: ");
                int dividendo = sc.nextInt();
                System.out.print("Agora o divisor! ");
                int divisor = sc.nextInt();
                
                int divisao = dividendo/divisor;
                System.out.println("O valor total da divisão deu " + divisao + "!");
            break;

            case 5:
                System.out.println("A média aritmética se trata do valor mediano entre n números");
                System.out.println("Primeiro, precisa ser determinado quantos números você me informará");
                System.out.print("E quantos são? ");
                n = sc.nextInt();
                System.out.println("Beleza, agora vamos lá, me diga os números!");
                int subsoma = 0;

            for (int i = 1; i <= n; i++){
                System.out.print("Número " + i + ": ");
                int valor = sc.nextInt();
                subsoma += valor;
            }
                int media = subsoma/n;
                System.out.println("O valor total da média aritmética deu " + media + "!");
            break;

            case 6:
                System.out.println("Potenciação se trata de quantas vezes um número de multiplica por ele mesmo");
                System.out.println("Por exemplo, a potência de dois elevado à 3 dá 8");
                System.out.println("Isso porque 2*2 dá quatro e 4*2 dá oito");
                System.out.print("Que número potencializaremos? ");
                int valor = sc.nextInt();
                System.out.print("E quantas vezes vamos o potencializar? ");
                n = sc.nextInt();
                double resultado = Math.pow(valor, n);
                int potenciacao = (int) resultado;
                
                System.out.println("O valor total da sua potenciação deu " + potenciacao + "!");
            break;

            case 7:
                System.out.println("A radiciação é a operação matemática inversa à potenciação");
                System.out.println("Se trata de encontrar qual número, redondo ou a arredondado pode resultar ao valor pedido, quando multiplicado por uma raiz específica");
                System.out.println("Em resumo, é chamado de raiz quadrada toda radiciação de índice 2");
                System.out.println("A raiz quadrada de 4 é 2, porque 2*2 dá 4");
                System.out.println("A raiz cúbica de 8 dá 2 pelo mesmo motivo, porque 2*2*2 dá 8");
                System.out.print("Por isso, para realizar esse cálculo, precisamos saber de qual raiz estamos falando: ");   
                int raiz = sc.nextInt();
                System.out.print("Certo, agora qual número queremos saber? ");
                valor = sc.nextInt();
                System.out.println("Por fim, você quer o valor arredondado ou exato?");
                System.out.println("1. Arredondado");
                System.out.println("2. Exato");
                int opcRaiz = sc.nextInt();

                switch (opcRaiz) {
                    case 1:
                    resultado = Math.pow(valor, 1.0/raiz);
                    Math.round(resultado);
                    int radiciacaoInt = (int) Math.round(resultado);

                    System.out.println("O valor total arredondado da sua radiciação deu " + radiciacaoInt + "!");
                    break;

                    case 2:
                    resultado = Math.pow(valor, 1.0/raiz);

                    if (resultado % 1 == 0){
                        System.out.println("O valor total exato da sua radiciação deu " + resultado + "!");
                    } else {
                        System.out.println("O resultado da sua operação matemática não retornou um valor exato.");
                        System.out.println("Você deseja visualizá-la assim mesmo?");
                        System.out.println("1. Sim");
                        System.out.println("2. Não");
                        int opcVer = sc.nextInt();
                            switch (opcVer){
                                case 1:
                                System.out.println("O valor total da sua radiciação deu " + resultado);
                                int resultadoArdd = (int) resultado;
                                System.out.println("Este valor seria arredondado para " + resultadoArdd + "!");

                                case 2:
                                System.out.println("Certo, se precisar de algo mais, me avise!");
                                break;
                            }
                    break;
                    }
                }
            break;

            case 8:
                System.out.println("Fatorial é o processo da multiplicação de todos os números que antecedem um valor");
                System.out.println("Por exemplo! Se requisitado o valor do fatorial de 3, deverá ser calculado 3*2*1");
                System.out.print("Qual número você quer calcular o fatorial? ");
                valor = sc.nextInt();
                int fatorial = 1;

            for (int i = 1; i <= valor; i++){
                fatorial *= i;
            }

                System.out.println("O valor total do seu fatorial deu " + fatorial + "!");
            break;

            case 9:
                System.out.println("Logaritmo se relaciona com potenciação e radiciação, fechando o 'trio'");
                System.out.println("No logaritmo, a função é descobrir qual expoente multiplica o logaritmando pela base do logaritmo");
                System.out.println("Se um logaritmo ausenta base, significa que a base-padrão do mesmo é 10");
                System.out.println("Um exemplo prático é o log₂8 é 3, pois 2³ é 8");
                System.out.print("Sem mais enrolações, qual a base do seu logaritmo? ");
                int base = sc.nextInt();
                System.out.print("Certo! E o valor do logaritmo, o logaritmando? ");
                int logaritmando = sc.nextInt();
                resultado = Math.log(logaritmando) / Math.log(base);

                System.out.println("O valor do logaritmo de " + logaritmando + " sobre a base de " + base + " resulta em " + resultado);
            break;

            case 10:
                System.out.println("O Teorema de Pitágoras é um dos mais populares e mais conhecidos teoremas da Matemática!");
                System.out.println("Se resume em uma relação fundamental dentro de triângulos retângulos");
                System.out.println("Diz que o quadrado do comprimento da hipotenusa, o lado oposto ao ângulo reto deve, sempre, ser igual à soma dos quadrados dos comprimentos dos outros dois catetos");
                System.out.println("Usando-os podemos tanto calcular a hipotenusa quanto algum dos dois catetos");
                System.out.println("Qual você quer calcular?");
                System.out.println("1. Hipotenusa");
                System.out.println("2. Cateto");
                int opcPit = sc.nextInt();

                switch (opcPit){
                    case 1:
                        System.out.println("Certo, vamos calcular a hipotenusa!");
                        System.out.println("Ressaltando então, que na situação atual, nós temos os dois catetos, correto?");
                        System.out.print("Então vamos lá! Me informe o valor do primeiro cateto, por favor ");
                        int c1 = sc.nextInt();
                        System.out.print("Agora, me informe o valor do outro cateto, por favor! ");
                        int c2 = sc.nextInt();
                        double hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c1, 2));

                        System.out.println("O valor total da hipotenusa do seu triângulo de lados " + c1 + " e " + c2 + " é " + hipotenusa + "!");
                    break;

                    case 2:
                        System.out.println("Perfeito!");
                        System.out.print("Então, você já tem o valor da hipotenusa, certo? Pode me informá-lo? ");
                        int hip = sc.nextInt();
                        System.out.print("Perfeito! Agora, e o valor do cateto, aquele que você tem conhecimento sobre? ");
                        c1 = sc.nextInt();

                        double cateto = Math.sqrt(Math.pow(hip, 2) + Math.pow(c1, 2));

                        System.out.println("O valor do cateto do seu triângulo de lado " + c1 + " e hipotenusa " + hip + " é " + cateto + "!");
                    break;
                }
                break;

            case 11:
                System.out.println("Mínimo múltiplo comum é como é chamado o menor número inteiro positivo que é múltiplo de dois ou mais números!");
                System.out.println("Você quer saber o 'MMC' de quantos números?");
                n = sc.nextInt();

                int[] numeros = new int[n];
            for (int i = 0; i < n; i++) { // so colocando em array
                System.out.print("Número " + (i+1) + ": ");
                numeros[i] = sc.nextInt();
            }
                int mmc = numeros[0];
            for (int i = 1; i < n; i++) {
                if (numeros[i] > mmc) {
                    mmc = numeros[i];
                }
            }

                boolean encontrado = false;
            while (!encontrado) {
                encontrado = true;

            for (int i = 0; i < n; i++) {
                if (mmc % numeros[i] != 0) {
                    encontrado = false;
                    break;
                }
            }

                if (!encontrado) {
                    mmc++;
                }}

                System.out.println("O valor do Mínimo Múltiplo Comum é " + mmc + "!");
            break;

            case 12:
                System.out.println("O Máximo Divisor Comum se trata do maior número inteiro que divide dois ou mais números dados simultaneamente, de forma que não haja restos");
                System.out.print("Quantos números usaremos no nosso 'MDC'? ");
                n = sc.nextInt();
                    
                numeros = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Número " + (i+1) + ": ");
                numeros[i] = sc.nextInt();
            }
                int mdc = numeros[0];
                for (int i = 1; i < n; i++) {
                int a = mdc;
                int b = numeros[i];
                while (b != 0) {
                    int resto = a % b;
                    a = b;
                    b = resto;
                }
                mdc = a;}

                System.out.println("O valor do Máximo Divisor Comum é " + mdc + "!");    
            break;

            case 13:
                System.out.println("O seno de um ângulo é uma das funções principais da trigonometria");
                System.out.println("E é definido pela razão entre o comprimento do cateto oposto e o comprimento da hipotenusa, dentro de um triângulo retângulo");
                System.out.println("Entretanto, posso calcular pra você somente pelo valor do ângulo cujo seno você quer descobrir");
                System.out.print("Esse valor inclusive, que é? ");
                valor = sc.nextInt();
                double seno = Math.sin(valor);
                int senoRound = (int) Math.round(seno);

                System.out.println("Perfeito! O valor do seu seno é " + seno + ", que arredondado fica " + senoRound); 
            break;

            case 14:
                System.out.println("O cosseno de um ângulo compõe uma das três principais funções da trigonometria");
                System.out.println("É definido pela razão entre o cateto adjacente a e a hipotenusa deste triângulo");
                System.out.println("Entretanto, posso calcular pra você somente pelo valor do ângulo cujo cosseno você quer descobrir");
                System.out.print("Esse valor inclusive, que é? ");
                valor = sc.nextInt();
                double cosseno = Math.cos(valor);
                int cossenoRound = (int) Math.round(cosseno);

                System.out.println("Perfeito! O valor do seu cosseno é " + cosseno + ", que arredondado fica " + cossenoRound); 
            break;

            case 15:
                System.out.println("A tangente de um ângulo é uma das principais e essenciais funções da trigonometria");
                System.out.println("É definida pela razão de um cateto oposto pelo cateto adjacente em um triângulo retângulo");
                System.out.println("Entretanto, posso calcular pra você somente pelo valor do ângulo cujo tangente você quer descobrir");
                System.out.print("Esse valor incluse, que é? ");
                valor = sc.nextInt();
                double tangente = Math.tan(valor);
                int tangenteRound = (int) Math.round(tangente);

                System.out.println("Perfeito! O valor do seu tangente é " + tangente + ", que arredondado fica " + tangenteRound); 
            break;

            case 16:
                System.out.println("A porcentagem é uma medida de razão com base em 100 que vemos quase todos os dias");
                System.out.println("Para calculá-la, precisamos de um número base!");                                     
                System.out.println("Por exemplo, se eu quero saber 25% de 75, digamos que o 75 é esse número base");
                System.out.print("Entendeu? Qual número-base você quer calcular a porcentagem? ");
                base = sc.nextInt();
                System.out.println("Perfeito! E, qual a porcentagem que você quer descobrir desse número?");
                System.out.println("Devo esclarecer para não ser incluso o algorismo %");
                System.out.println("Caso queira saber 25%, por exemplo, escreva somente 25.");
                int porcent = sc.nextInt();

                double porcentagem = base * (porcent/100.0);

                System.out.println("O valor total do cálculo da porcentagem de " + porcent + "% de " + base + " resultou em: " + porcentagem + "!");
            break;

            default:
                System.out.println("Eu não entendi! Acho que você digitou incorretamente...");
            }
        }
    }
}