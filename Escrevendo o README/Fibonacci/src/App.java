import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int fibonacci, a = 0, b = 1;

        System.out.print(a + ", ");
        System.out.print(b + ", ");

        for (int i = 0; i < 10; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
            System.out.print(fibonacci + ", ");
        }

        scan.close();
    }
}
