import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        int nascimentos  = 10, // Variável que conta o número de nascimentos
        somaPrematuro = 0, // A soma de prematuros nascidos
        diasNaIncubadora = 0, // O total de dias que uma criança passou na incubadora
        somaPrematurosM = 0, // A soma de todos os meninos prematuros
        somaPrematurosF = 0, // A soma de todas as meninas prematuras
        somaDiasNaIncubadora = 0, // Soma de todos os dias que o total de criaças prematuras passaram na incubadora
        maiorTempoIncubadora = 0; // O número de dias que uma criança mais passo na incubadora
        
        double perPrematuros = 0, perPrematurosM = 0, perPrematurosF = 0, mediaDeTempo = 0;

        String sexo = "A";

        System.out.println("---- Sistema da Maternidade ----");

        while (!sexo.equalsIgnoreCase("X")) {
            
            System.out.print("Qual o sexo da criança: ");
            sexo = scan.nextLine();

            if (sexo.equalsIgnoreCase("X")) {
                break;
            }

            System.out.print("Quantos dias a criança passou na incubadora? ");
            diasNaIncubadora = scan.nextInt();

            scan.nextLine(); // Limpando o buffer

            if (maiorTempoIncubadora < diasNaIncubadora) {
               maiorTempoIncubadora = diasNaIncubadora; 
            }
            if (sexo.equals("M")) {
                somaPrematurosM += 1;
            }
            if (sexo.equals("F")) {
                somaPrematurosF += 1;
            }

            somaDiasNaIncubadora += diasNaIncubadora;
            somaPrematuro += 1;

            System.out.println();
        }

        mediaDeTempo = (int)somaDiasNaIncubadora/somaPrematuro;

        perPrematuros = ((double)somaPrematuro/nascimentos) * 100.0;
        perPrematurosM = ((double)somaPrematurosM/nascimentos) * 100.0;
        perPrematurosF = ((double)somaPrematurosF/nascimentos) * 100.0;

        System.out.println();
        System.out.println("Foi um total de " + nascimentos + " nascimentos");
        System.out.println("A porcentagem de prematuros foi: " + df.format(perPrematuros) + "%");
        System.out.println("A porcentagem de meninos prematuros foi: " + df.format(perPrematurosM) + "%");
        System.out.println("A porcentagem de meninas prematuros foi: " + df.format(perPrematurosF) + "%");
        System.out.println("A media de dias de permanência das criaças na incubadora foi: " + df.format(mediaDeTempo));
        System.out.println("O maior numero de dias que uma criança recém nascida passou na incubadora foi: " + maiorTempoIncubadora);

        scan.close();
    }
}
