import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        double valordaprestacao, total;
        
        System.out.print("Qual o valor da prestacoes? ");
        valordaprestacao = scan.nextDouble();

        total = valordaprestacao + (10.0/100.0) * valordaprestacao;

        System.out.println("O valor que você tem a pagar com juros = R$" + total);

        total = total - (10.0/100.0) * total;

        System.out.println("O valor que você tem a pagar com o desconto = R$" + total);

        System.out.println("O comerciante teve R$" + (total - valordaprestacao) + " de prejuízo");

        scan.close();
    }
}
