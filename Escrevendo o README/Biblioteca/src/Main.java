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
            System.out.println("Parar busca: 0");
            System.out.println("Código: 1");
            System.out.println("Area e Nome: 2");
            codigo = scan.nextInt();

            if (codigo == 0) {
                break;
            } else if (codigo == 1) {
                System.out.print("Escreva o código do Livro: ");
                auxiliarCode = scan.nextInt();
                tools.buscarEPrintarLivroPorCodigo(auxiliarCode);
            } else if (codigo == 2) {
                System.out.print("Escreva a área e o Nome do Livro: ");
                System.out.print("Área 1, 2 ou 3: ");
                auxiliarCode = scan.nextInt();
                System.out.print("Nome: ");
                auxiliarString = scan.nextLine();
            }

        }
    }
}