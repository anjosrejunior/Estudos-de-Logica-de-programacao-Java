import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 123, invertido = 0;

        while (numero > 0) {
            //Puxa o ultimo numero e coloca na variável ultimoDigito
            int ultimoDigito = numero % 10;

            //Coloca o ultimoDigito dentro da variável invertido
            invertido = invertido * 10 + ultimoDigito;

            numero = numero / 10;
        } 

        System.out.println("Número invertido: " + invertido);

        scan.close();
    }
}