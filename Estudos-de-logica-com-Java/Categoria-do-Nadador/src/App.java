import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Diga qual o código:  ");
        int codigo = scan.nextInt();


        if (codigo >= 5 && codigo <= 7) {
            System.out.println("Infantil A");
        }
        else if (codigo >= 8 && codigo <= 10) {
            System.out.println("Infantil B");
        }
        else if (codigo >= 11 && codigo <= 13) {
            System.out.println("Juvenil A");
        }
        else if (codigo >= 14 && codigo <= 17) {
            System.out.println("Juvenil B");
        }
        else if (codigo >= 18) {
            System.out.println("adulto");
        }

        scan.close();
    }
}