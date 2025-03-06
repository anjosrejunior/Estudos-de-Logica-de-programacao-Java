import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);

        double celsius;

        System.out.println("----- Tabela Fahrenheit para Celsius -----");

        System.out.println();

        for (int i = 50; i <= 150; i++) {
            celsius = 5.0/9.0 * (i - 32.0);
            System.out.println(nf.format(i) + "F° || " + nf.format(celsius) + "C°");
        }

        scan.close();
    }
}
