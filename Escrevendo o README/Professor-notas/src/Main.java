import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    static String bookLine;
    static String bookSearch;
    static Scanner scan = new Scanner(System.in);

    public static void read(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Professor-notas\\assets\\Lista de Alunos.txt"))){
            while ((bookLine = bufferedReader.readLine()) != null) {
                String[] campos = bookLine.split(";");
                if (campos[0].equals(bookSearch)) {
                    System.out.println(bookLine);

                    double media = Double.parseDouble(campos[6]);
                    if (media >= 7.0) {
                        System.out.println("Aluno Aprovado");
                    } else if (media >= 5.0) {
                        System.out.println("Aluno Em recuperação");
                    } else {
                        System.out.println("Aluno Reprovado sem recuperação");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao encontrar o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        bookSearch = "A";
        while (!bookSearch.equals("0")) {
            System.out.print("\nConsulte a ficha do aluno pelo número de chamada: ");
            bookSearch = scan.nextLine();
            read();
        }
    }
}