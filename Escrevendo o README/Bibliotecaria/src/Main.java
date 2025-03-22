import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operation = "";

        while (!operation.equalsIgnoreCase("S")) {
            System.out.println("\nQual operação você deseja fazer no arquivo da biblioteca?");
            System.out.println("C - Create, R - Read, U - Update, D - Delete ou S para sair");
            System.out.print("Escolha: ");
            operation = scan.nextLine();

            switch (operation) {
                case "C" -> {
                    System.out.println("\nMétodo de criação de Livros Selecionado!");
                    Methods.create();
                }
                case "R" -> {
                    System.out.println("\nMétodo de leitura de Livros Selecionado!");
                    Methods.read();
                }
                case "U" -> {
                    System.out.println("\nMétodo de atualização de Livros Selecionado!");
                    Methods.update();
                }
                case "D" -> {
                    System.out.println("\nMétodo de exclusão de Livros Selecionado!");
                    Methods.delete();
                }
                default -> System.out.println("Operação finalizada");
            }
        }
    }
}