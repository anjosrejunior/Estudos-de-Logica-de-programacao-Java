import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Diga qual o código:  ");
        int codigo = scan.nextInt();


        switch (codigo){
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2,3,4:
                System.out.println("Alimento perecível");
                break;
            case 5,6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene Pessoal");
                break;
            case 8,9,10,11,12,13,14,15:
                System.out.println("Limpeza e uténsilios domésticos");
                break;
            default:
                System.out.println("Invalido meu nobre");
        }
        scan.close();
    }
}
