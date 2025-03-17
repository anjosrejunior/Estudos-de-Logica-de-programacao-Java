import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ferramentas tools = new Ferramentas();
        Scanner scan = new Scanner(System.in);
        tools.preencherVetores(); // Inserindo dados Aleatórios nos vetores

        String resposta, auxiliarString;
        int codigo;
        int auxiliarCode;

        System.out.println("Você quer fazer uma verificação no banco de dados?");
        System.out.print("Sim ou Não: ");
        resposta = scan.nextLine();

        while (resposta.equals("Sim")){
            System.out.println("\nDigite o método de Busca: ");
            System.out.println("0: Parar busca");
            System.out.println("1: Código");
            System.out.println("2: Área e Nome");
            System.out.println("3: Todos os livros p(Area)");
            System.out.println("4: Todos os livros p(Area) entre 100 e 300 pág");
            System.out.println("5: Alterar registro de um Livro");
            System.out.println("6: Remover registro de um Livro");

            System.out.print("Escolha: ");
            codigo = scan.nextInt();

            switch (codigo) {
                case 0:
                    break;

                case 1:
                    System.out.print("\nEscreva o código do Livro: ");
                    auxiliarCode = scan.nextInt();
                    tools.buscarEPrintarLivroPorCodigo(auxiliarCode);
                    break;

                case 2:
                    System.out.println("\nEscreva a área e o Nome do Livro: ");
                    System.out.print("Área 1, 2 ou 3: ");
                    auxiliarCode = scan.nextInt();
                    System.out.print("Nome: ");
                    scan.nextLine(); // Limpa o buffer do scanner
                    auxiliarString = scan.nextLine();
                    tools.buscarEPrintarLivroPorAreaENome(auxiliarCode, auxiliarString);
                    break;

                case 3:
                    System.out.println("\nEscreva a área para buscar os livros: ");
                    System.out.print("Área 1, 2 ou 3: ");
                    auxiliarCode = scan.nextInt();
                    tools.livrosDoados(auxiliarCode);
                    break;

                case 4:
                    System.out.println("\nEscreva a área para buscar os livros: ");
                    System.out.print("Área 1, 2 ou 3: ");
                    auxiliarCode = scan.nextInt();
                    tools.livrosCompradosEntreCemETrezentasPag(auxiliarCode);
                    break;

                case 5:
                    System.out.println("\nFaça a busca do Livro: ");
                    System.out.print("Qual o código de Catalogação?: ");
                    auxiliarCode = scan.nextInt();
                    tools.buscarEAlterarFicha(auxiliarCode);
                    break;

                case 6:
                    System.out.println("\nFaça a busca do Livro: ");
                    System.out.print("Qual o código de Catalogação?: ");
                    auxiliarCode = scan.nextInt();
                    tools.removerLivro(auxiliarCode);
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um código entre 0 e 4.");
                    break;
            }
        }
    }
}