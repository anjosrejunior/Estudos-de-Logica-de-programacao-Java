import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int x, y, calculo = 0;
        String operacao;

        System.out.print("Digite o número 1 = ");
        x = scan.nextInt();
        System.out.print("Digite o número 2 = ");
        y = scan.nextInt();


        System.out.print("Escolha a operação: ");
        scan.nextLine();
        operacao = scan.nextLine();

        switch (operacao) {
            case "+":
                calculo = x + y;
                break;
        
            case "-":
                calculo = x - y;
                break;

            case "*":
                calculo = x * y;
                break;

            case "/":
                calculo = x / y;
                break;

            default:
                break;
        }

        System.out.println("Segura essa lapada de calculo = " + calculo);

        scan.close();
    }
}
