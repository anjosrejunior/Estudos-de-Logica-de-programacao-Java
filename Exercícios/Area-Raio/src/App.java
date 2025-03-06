import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o raio do circulo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("Esta é a area do circulo que você forneceu o raio: " + String.format("%.2f",area));

        scan.close();
    }
}
