import java.util.Random;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] sexo = new String[50];

        double[] alturas = new double[50];

        double somaAlturaF, mediaAlturaF, percentM, percentF;

        int qtMulheres, qtHomens;

        Random random = new Random();

        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < 50; i++) {
            sexo[i] = random.nextBoolean() ? "M" : "F";

            alturas[i] = 1.50 + (2.00 - 1.50) * random.nextDouble();
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (int i = 0; i < 50; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }

        somaAlturaF = 0;
        qtMulheres = 0;
        qtHomens = 0;
        for (int i = 0; i < 50; i++) {
            if (sexo[i].equals("F")) {
                somaAlturaF = somaAlturaF + alturas[i];
                qtMulheres += 1; 
            }
            else if (sexo[i].equals("M")) {
                qtHomens += 1;
            }
        }

        mediaAlturaF = somaAlturaF / (double)qtMulheres;
        percentM = (qtHomens/50.0) * 100.0;
        percentF = 100.0 - percentM;

        System.out.println("Está é a maior altura: " + df.format(maiorAltura));
        System.out.println("Está é a menor altura: " + df.format(menorAltura));
        System.out.println("Esta é a média de altura das mulheres: " + df.format(mediaAlturaF));
        System.out.println("Esta é a quantidade de Homens: " + df.format(qtHomens));
        System.out.println("Os homens correspondem á: " + df.format(percentM) + "%");
        System.out.println("As mulheres correspondem á: " + df.format(percentF) + "%");

    }
}
