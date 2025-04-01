import java.io.RandomAccessFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    static String bookLine;
    static String bookSearch;
    static Scanner scan = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.##");
    static String arquivo1 = "C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Professor-notas\\assets\\Lista de Alunos.txt";

    public static void read(){
        Map<Integer, Long> indiceRegistro = new HashMap<>();

        try (RandomAccessFile raf = new RandomAccessFile(arquivo1, "r")) {
            long posicao = 0;
            String linha;
            while((linha = raf.readLine()) != null) {
                String[] campos = linha.split(";");
                int numeroRegistro = Integer.parseInt(campos[0]);
                indiceRegistro.put(numeroRegistro, posicao);
                posicao = raf.getFilePointer();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o indice: " + e.getMessage());
        }

        try (RandomAccessFile raf = new RandomAccessFile(arquivo1, "r")) {
            int numeroRegistro = Integer.parseInt(bookSearch);
            Long offset = indiceRegistro.get(numeroRegistro);
            if (offset != null) {
                raf.seek(offset);
                String bookLine = raf.readLine();
                // Processa a linha conforme o exemplo anterior
                String[] campos = bookLine.split(";");
                System.out.println(bookLine);

                double media = Double.parseDouble(campos[6]);
                if (media >= 7.0) {
                    System.out.println("Aluno Aprovado");
                } else if (media >= 5.0) {
                    System.out.println("Aluno Em recuperação");
                } else {
                    System.out.println("Aluno Reprovado sem recuperação");
                }
            } else {
                System.out.println("Registro não encontrado no índice.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }
    }

    public static void readGroup(){
        double num;
        double soma = 0;
        double media;
        int groupNum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Professor-notas\\assets\\Matriz de Notas.txt"))){
            while ((bookLine = bufferedReader.readLine()) != null){
                String[] campos = bookLine.split(";");

                for (int i = 0; i < campos.length; i++) {
                    num = Double.parseDouble(campos[i]);
                    soma += num;
                }
                media = soma / campos.length;
                soma = 0;
                groupNum ++;
                System.out.println("Equipe " + groupNum + " Media : " + df.format(media));
            }
        } catch (Exception e) {
            System.out.println("Erro ao encontrar o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Busca da situação do aluno pelas médias
        bookSearch = "A";
        while (!bookSearch.equals("0")) {
            System.out.print("\nConsulte a ficha do aluno pelo número de chamada: ");
            bookSearch = scan.nextLine();
            read();
        }

        // Leitura das médias por grupo
        System.out.println();
        readGroup();
    }
}