import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        String sexo, corOlhos, corCabelos;
        int idade = 0, 
        maiorIdade = 0, // Maior idade de todas
        somaGeral = 0,
        somaH = 0, // Soma das idades dos homens entre 18 e 35 anos
        somaF = 0; // Soma das idades das mulheres entre 18 e 35 anos que tem olhos verdes e cabelos loiros
        
        double perM, // Porcentagem de homens que estão entre 18 e 35 anos
        perF; // Porcentagem de homens que estão entre 18 e 35 anos

        System.out.println("---- Pesquisa sobre características físicas ----");

        while (idade != -1) {
            System.out.print("Qual a idade? ");
            idade = scan.nextInt();

            if (idade == -1) {
                break;
            }

            scan.nextLine(); // Limpeza do buffer

            System.out.print("Qual o sexo? ");
            sexo = scan.nextLine();

            System.out.println("Qual a cor dos olhos? ");
            System.out.print("('A' - azuis, 'V' - verdes ou 'C'- castanhos) : ");
            corOlhos = scan.nextLine();

            System.out.println("Qual a cor dos cabelos? ");
            System.out.print("('L' - loiros, 'C' - castanhos ou 'P'- pretos) : ");
            corCabelos = scan.nextLine();

            boolean homemAdulto = (sexo.equals("M") && idade >= 18 && idade <= 35);
            boolean mulheresVL = (sexo.equals("F") && idade >= 18 && idade <= 35 && corOlhos.equals("V") && corCabelos.equals("L"));

            if (maiorIdade < idade) {
                maiorIdade = idade;
            }
            if (homemAdulto) {
                somaH += 1;
            }
            if (mulheresVL) {
                somaF += 1;
            }

            somaGeral += 1;

            System.out.println();
        }
        
        perM = ((double)somaH/somaGeral) * 100.0;
        perF = ((double)somaF/somaGeral) * 100.0;

        System.out.println();
        System.out.println("A maior idade entre os habitantes é: " + maiorIdade);
        System.out.println("A porcentagem de homens entre os 18 e 35 anos de idade é: " + df.format((double)perM) + "%");
        System.out.println("A porcentagem de mulher entre os 18 e 35 anos de idade com olhos verdes e cabelos loiros é: " + df.format((double)perF) + "%");

        scan.close();
    }
}
