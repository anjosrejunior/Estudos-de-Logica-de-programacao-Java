import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMethod {

    public static void sortRead(String assuntoBuscado) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Listar Livros\\assets\\Lista de Livros.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.contains(assuntoBuscado)) {
                    System.out.println(linha);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro encontrado na chamada do arquivo: " + e.getMessage());
        }
    }
}
