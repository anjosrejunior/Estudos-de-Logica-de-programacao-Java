import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadMethod read = new ReadMethod();
        Scanner scan = new Scanner(System.in);

        System.out.print("Me diga qual assunto você quer buscar? :  ");
        String assunto = scan.nextLine();

        read.sortRead(assunto);
    }
}