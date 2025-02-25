import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
       
        DecimalFormat df = new DecimalFormat("0.00");

        double peso, altura, IMC;

        System.out.println("-----Medidor de IMC-----");

        System.out.print("Diga seu Peso: ");
        peso = scan.nextDouble();

        System.out.print("Diga sua Altura: ");
        altura = scan.nextDouble();

        IMC = peso / Math.pow(altura,2);

        System.out.println("O seu IMC é " + df.format(IMC));

        if (IMC < 18.5) {
            System.out.println("Condição: Abaixo do Peso");
        }
        else if (IMC >= 18.5 && IMC <= 25 ) {
            System.out.println("Condição: Peso Normal");
        }
        else if (IMC >= 25 && IMC <= 30) {
            System.out.println("Condição: Acima do Peso");
        }
        else if (IMC > 30) {
            System.out.println("Condição: Obeso!!");
        }

        scan.close();
    }
}
