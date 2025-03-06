import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double salarioMinimo = 1412.00; 
        
        String[] CPF = new String[9];

        int[] dependentes = new int[9];
        
        int[] salarios = new int[9];

        double[] impostoDeRenda = new double[9];

        for (int i = 0; i < 10; i++) {
            
            System.out.print("Qual o seu CPF: ");
            CPF[i] = scan.nextLine();
            System.out.print("Quantos dependentes você tem? ");
            dependentes[i] = scan.nextInt();
            System.out.print("Quantos salários mínimos você ganha por mês? ");
            salarios[i] = scan.nextInt();
            scan.nextLine(); // Limpa o buffer após nextInt()
            System.out.println();

            if (salarios[i] <= 2) {
                impostoDeRenda[i] = 0.0;
            } 
            else if (salarios[i] == 3) {
                impostoDeRenda[i] = (salarioMinimo * salarios[i]) * (5.0/100.0); // Imposto bruto
                impostoDeRenda[i] = impostoDeRenda[i] - (impostoDeRenda[i] * (0.05 * dependentes[i])); // Desconto
            } 
            else if (salarios[i] == 4 || salarios[i] == 5) {
                impostoDeRenda[i] = (salarioMinimo * salarios[i]) * (10.0/100.0); 
                impostoDeRenda[i] = impostoDeRenda[i] - (impostoDeRenda[i] * (0.05 * dependentes[i])); 
            } 
            else if (salarios[i] == 6 || salarios[i] == 7) {
                impostoDeRenda[i] = (salarioMinimo * salarios[i]) * (15.0/100.0); 
                impostoDeRenda[i] = impostoDeRenda[i] - (impostoDeRenda[i] * (0.05 * dependentes[i])); 
            } 
            else if (salarios[i] >= 8) {
                impostoDeRenda[i] = (salarioMinimo * salarios[i]) * (20.0/100.0); 
                impostoDeRenda[i] = impostoDeRenda[i] - (impostoDeRenda[i] * (0.05 * dependentes[i]));
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Contribuinte portador do CPF: " + CPF[i]);
            System.out.println("Com " + dependentes[i] + " dependentes");
            System.out.println("Ganha: R$" + df.format(salarios[i]*salarioMinimo));
            System.out.println("Pagará: R$" + df.format(impostoDeRenda[i]) + " de imposto de renda");
            System.out.println();
        }

        scan.close();
    }
}
