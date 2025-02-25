import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int base, expoente, potencia;

        System.out.print("Diga qual a Base: ");
        base = scan.nextInt();

        System.out.print("Diga qual o expoente: ");
        expoente = scan.nextInt();

        potencia = base;
        for (int i = 0; i < expoente; i++) {
            potencia = potencia * base;
        }

        System.out.println("O resultação da exponenciação é: " + potencia);

        scan.close();
    }
}
