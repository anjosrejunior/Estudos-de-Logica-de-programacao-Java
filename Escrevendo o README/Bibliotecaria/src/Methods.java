import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
    static Scanner scan = new Scanner(System.in);
    static String nome;
    static String assunto;
    static int paginas;
    static String bookSearch;
    static String bookLine; // BookLine representa uma linha com os dados de um livro
    static boolean encontrado;

    public static void create(){
        System.out.print("Digite o nome do Livro: ");
        Methods.nome = scan.nextLine();
        System.out.print("Digite o assunto do Livro: ");
        Methods.assunto = scan.nextLine();
        System.out.print("Digite o quantas páginas tem o Livro: ");
        Methods.paginas = scan.nextInt();
        scan.nextLine();

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\anjos\\Estudos-DEV\\" +
                    "Logica-de-Programacao-Java\\Escrevendo o README\\Bibliotecaria\\assets\\Livros.txt", true));
            String novoLivro = nome + ";" + assunto + ";" + paginas;
            bufferedWriter.write(novoLivro);
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("\nLivro adicionado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao adiocionar ao arquivo: " + e.getMessage());
        }
    }

    public static void read(){
        System.out.print("Busque o livro pelo nome: ");
        bookSearch = scan.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\anjos\\Estudos-DEV\\" +
                "Logica-de-Programacao-Java\\Escrevendo o README\\Bibliotecaria\\assets\\Livros.txt"))){
            while ((bookLine = bufferedReader.readLine()) != null) {
                if (bookLine.contains(bookSearch)) {
                    System.out.println("Livro: " + bookLine);
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler ao arquivo: " + e.getMessage());
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void update(){
        String escolha;
        do {
            System.out.println("\nQual o registro que você deseja modificar? ");

            read(); // Chamando a classe read para mostrar na tela o livro que ela buscou

            System.out.println("Deseja prosseguir S == Sim ou pesquisar novamente N == Não:");
            escolha = scan.nextLine();
        } while (!escolha.equals("Sim"));

        System.out.println("Vamos atualizar este registro, digite os novos dados!");
        System.out.print("Digite o nome do Livro: ");
        Methods.nome = scan.nextLine();
        System.out.print("Digite o assunto do Livro: ");
        Methods.assunto = scan.nextLine();
        System.out.print("Digite o quantas páginas tem o Livro: ");
        Methods.paginas = scan.nextInt();
        scan.nextLine();

        List<String> linhas = new ArrayList<>();
        encontrado = false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\anjos\\Estudos-DEV\\" +
                "Logica-de-Programacao-Java\\Escrevendo o README\\Bibliotecaria\\assets\\Livros.txt"))){
            while ((bookLine = bufferedReader.readLine()) != null) {
                String[] campos = bookLine.split(";");
                if (campos.length == 3 && campos[0].equalsIgnoreCase(bookSearch)) {
                    linhas.add(nome + ";" + assunto + ";" + paginas);
                    encontrado = true;
                } else {
                    linhas.add(bookLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler ao arquivo: " + e.getMessage());
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
            return;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\anjos\\Estudos-DEV\\" +
                "Logica-de-Programacao-Java\\Escrevendo o README\\Bibliotecaria\\assets\\Livros.txt"))){
            for (String linha : linhas) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }
            System.out.println("Arquivo atualizado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler ao arquivo: " + e.getMessage());
        }
    }

    public static void delete(){
        String escolha;
        do {
            System.out.println("\nQual o registro que você deseja excluir? ");

            read(); // Chamando a classe read para mostrar na tela o livro que ela buscou

            System.out.println("Deseja prosseguir S == Sim ou pesquisar novamente N == Não:");
            escolha = scan.nextLine();
        } while (!escolha.equals("Sim"));

        List<String> linhas = new ArrayList<>();
        boolean encontrado = false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\anjos\\Estudos-DEV\\" +
                "Logica-de-Programacao-Java\\Escrevendo o README\\Bibliotecaria\\assets\\Livros.txt"))){
            while ((bookLine = bufferedReader.readLine()) != null) {
                String[] campos = bookLine.split(";");
                if (campos.length == 3 && campos[0].equalsIgnoreCase(bookSearch)) {
                    encontrado = true;
                } else {
                    linhas.add(bookLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler ao arquivo: " + e.getMessage());
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
            return;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\anjos\\Estudos-DEV\\" +
                "Logica-de-Programacao-Java\\Escrevendo o README\\Bibliotecaria\\assets\\Livros.txt"))){
            for (String linha : linhas) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }
            System.out.println("Arquivo deletado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler ao arquivo: " + e.getMessage());
        }
    }
}