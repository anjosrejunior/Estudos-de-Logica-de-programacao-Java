import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static String nomeIndice = "C:\\Users\\anjos\\Estudos-DEV\\Logica-de-Programacao-Java\\Escrevendo o README\\Indice-Funcionarios\\assets\\CadFuncIndice.txt";

    public static void gerarIndices(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeIndice))){
             
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}