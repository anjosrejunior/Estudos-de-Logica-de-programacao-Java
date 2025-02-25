import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double r = 0, v;

        System.out.print("Diga o valor de R: ");
        r = scan.nextDouble();

        v = (4/3) * Math.PI * Math.cbrt(r);

        System.out.println("Volume da esfera = " + v);

        scan.close();
    }
}
