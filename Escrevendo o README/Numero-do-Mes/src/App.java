import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numeroMes;

        System.out.println("-----Identifique o mes pelo numero!-----");
        System.out.println();
        System.out.print("Diga o numero do mes: ");
        numeroMes = scan.nextInt();

        switch (numeroMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Maio");
                break;

            case 6:
                System.out.println("Junho");
                break;

            case 7:
                System.out.println("Julho");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Setembro");
                break;
            
            case 10:
                System.out.println("Novembro");
                break;

            case 12:
                System.out.println("Dezembro");
                break;

            default:
                System.out.println("Mês inválio!");
                break;
        }

        scan.close();
    }
}
