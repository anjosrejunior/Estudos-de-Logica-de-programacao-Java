import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        String nota; // Nota dada pelo participante

        int lugares = 10, // Quantidade total de lugares no cinema
        idade, // Idade do Participante
        qtOtimo = 0, // Quantidade de respostas Ótimo
        qtBom = 0, // Quantidade de respostas Bom
        qtRegular = 0, // Quantidade de respostas Regular
        qtPessimo = 0, // Quantidade de respostas Pessimo
        somaIdadeRuim = 0, // Soma da idade das pessoas que responderam Ruim
        somaNotaRuim = 0, // Soma de pessoas que responderam a nota como ruim 
        maiorIdadeOtimo = 0, // A maior idade atribuída ao ótimo
        maiorIdadePessimo = 0, // A maior idade atribuida ao péssimo
        difIdadeOP = 0; // A diferença entre a maior idade que respondeu otimo e pessimo

        double percentBom = 0, // Porcentagem de notas Boas
        percentRegular = 0, // Porcentagem de notas Regulares
        percentPessimo = 0, // A porcentagem de pessoas que responderam péssimo
        difPercentBR = 0, // A diferença percentual entre a Nota Bom e Regular
        mediaIdadesRuim = 0; // A media das idades de pessoas que responderam Ruim 

        System.out.println("---- Queremos saber sua opnião sobre nosso cinema ----");

        for (int i = 0; i < lugares; i++) {

            System.out.print("Qual sua idade: ");
            idade = scan.nextInt();

            scan.nextLine(); // limpando buffer

            System.out.print("Qual sua nota: ");
            nota = scan.nextLine();

            if (nota.equals("A")) {
                qtOtimo += 1;
                if (maiorIdadeOtimo < idade) {
                    maiorIdadeOtimo = idade;
                }
            } 
            else if (nota.equals("B")) {
                qtBom += 1;
            } 
            else if (nota.equals("C")) {
                qtRegular += 1;
            } 
            else if (nota.equals("D")) {
                somaIdadeRuim = somaIdadeRuim + idade;
                somaNotaRuim += 1;
            } 
            else if (nota.equals("E")) {
                qtPessimo += 1;
                if (maiorIdadePessimo < idade) {
                    maiorIdadePessimo = idade;
                }
            } 
            else {
            }

            System.out.println();
        }

        percentBom = ((double)qtBom/lugares) * 100.0;
        percentRegular = ((double)qtRegular/lugares) * 100.0;
        difPercentBR = Math.abs(percentBom - percentRegular);
        percentPessimo = ((double)qtPessimo/lugares) * 100.0;
        difIdadeOP = Math.abs(maiorIdadeOtimo - maiorIdadePessimo);

        System.out.println("A quantidade de respostas Ótimo: " + qtOtimo + ".");
        System.out.println("Bom equivale à " + df.format(percentBom) + "% das notas e regular equivale à " + df.format(percentRegular) + "% das notas, a diferença percentual entre os dois é de " + df.format(difPercentBR) + "%.");
                
        if (somaNotaRuim == 0) {
            System.out.println("Nenhuma pessoa respondeu 'ruim'.");
        } else {
            mediaIdadesRuim = ((double) somaIdadeRuim / somaNotaRuim);
            System.out.println("A media da idade das pessoas que responderam ruim: " + df.format(mediaIdadesRuim));
        }

        System.out.println("A porcentagem de pessoas que respondeu péssimo foi: " + df.format(percentPessimo) + "%. Sendo a maior idade: " + maiorIdadePessimo);
        System.out.println("A diferença de idade e entre a maior idade que respondeu ótimo e a maior idade que respondeu péssimo: " + difIdadeOP);
        
        scan.close();
    }
}
