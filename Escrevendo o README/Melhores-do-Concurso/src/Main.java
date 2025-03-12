import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");

        String[] nomes = new String[200];
        double[] notas = new double[200];
        String[] listaNomes = {"José", "Maria","João"};

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = listaNomes[random.nextInt(listaNomes.length)];
            notas[i] = random.nextDouble(100.0);
        }

        System.out.println("----- Notas Acima de 70 pontos -----");
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] > 70.0) {
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Nota: " + df.format(notas[i]));
            }
        }
    }
}