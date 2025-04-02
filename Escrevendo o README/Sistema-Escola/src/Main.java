import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    static String bookline;
    static String bookSearch;
    static String arquivoMatriculas = "C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Sistema-Escola\\assets\\matriculas.txt";
    static String arquivoCursos = "C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Sistema-Escola\\assets\\cursos.txt";
    static Scanner scan = new Scanner(System.in);

    public static void listarALunos(){
        try (BufferedReader bf = new BufferedReader(new FileReader(arquivoMatriculas))) {
            // Engenharia Civil
            System.out.println("Alunos matriculados no curso de Engenharia Civil -");
            while ((bookline = bf.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[1].equals("Engenharia Civil")) {
                    System.out.println(campos[0]);
                }
            }

            // Reinicia a leitura do arquivo
            bf.close();

            BufferedReader bf1 = new BufferedReader(new FileReader(arquivoMatriculas));
            // Medicina
            System.out.println("\nAlunos matriculados no curso de Medicina -");
            while ((bookline = bf1.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[1].equals("Medicina")) {
                    System.out.println(campos[0]);
                }
            }

            // Reinicia a leitura do arquivoMatriculas
            bf.close();

            BufferedReader bf2 = new BufferedReader(new FileReader(arquivoMatriculas));
            // Direito
            System.out.println("\nAlunos matriculados no curso de Direito -");
            while ((bookline = bf2.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[1].equals("Direito")) {
                    System.out.println(campos[0]);
                }
            }

            // Reinicia a leitura do arquivo
            bf.close();

            BufferedReader bf3 = new BufferedReader(new FileReader(arquivoMatriculas));
            // Psicologia
            System.out.println("\nAlunos matriculados no curso de Psicologia -");
            while ((bookline = bf3.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[1].equals("Psicologia")) {
                    System.out.println(campos[0]);
                }
            }

            // Reinicia a leitura do arquivo
            bf.close();

            BufferedReader bf4 = new BufferedReader(new FileReader(arquivoMatriculas));
            // Ciência da Computação
            System.out.println("\nAlunos matriculados no curso de Ciência da Computação -");
            while ((bookline = bf4.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[1].equals("Ciência da Computação")) {
                    System.out.println(campos[0]);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar no arquivo: " + e.getMessage());
        }
    }

    public static void listarAlunosHomens(){
        try (BufferedReader bf = new BufferedReader(new FileReader(arquivoMatriculas))){
            System.out.println("Alunos do sexo masculino -");
            while ((bookline = bf.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[3].equals("1")) {
                    System.out.println("Aluno: " + campos[0] + ", matriculado no curso: " + campos[2]);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar no arquivo: " + e.getMessage());
        }
    }

    public static void listarCursos(String pesquisa){
        try (BufferedReader bf = new BufferedReader(new FileReader(arquivoCursos))){
            while ((bookline = bf.readLine()) != null) {
                String[] campos = bookline.split(";");
                if (campos[0].equals(pesquisa)) {
                    System.out.println("O código corresponde ao curso : " + campos[1]);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        listarALunos();
        System.out.println();
        listarAlunosHomens();
        System.out.print("\nAgora consulte o curso pelo código dele: ");
        bookSearch = scan.nextLine();
        listarCursos(bookSearch);
    }
}