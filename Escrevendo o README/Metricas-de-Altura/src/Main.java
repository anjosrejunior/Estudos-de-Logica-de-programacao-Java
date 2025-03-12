import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat dfMedia = new DecimalFormat("#.##");
        DecimalFormat dfAll = new DecimalFormat("#.#####");

        // Preenchendo o vetor com alturas e somando as alturas
        double[] alturas = new double[50];
        double somaAlturas = 0;
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = 1.50 + (random.nextDouble() * (2.00 - 1.50)); // Gera entre 1.50 e 2.00
            somaAlturas += alturas[i];
        }

        // Calculando a média das alturas
        double mediaAlturas = somaAlturas / alturas.length;

        // Calculando o quadrado das diferenças e somando os resultados
        double[] quadradoAlturas = new double[alturas.length];
        double somaQuadrados = 0;
        for (int i = 0; i < alturas.length; i++) {
            quadradoAlturas[i] = Math.pow(alturas[i] - mediaAlturas, 2);
            somaQuadrados += quadradoAlturas[i];
        }

        // Calculando a variância
        double variancia = somaQuadrados / alturas.length;

        // Calculando o desvio padrão
        double desvioPadrao = Math.sqrt(variancia);

        // Contar frequência das alturas
        Map<Double, Integer> contagem = new HashMap<>();
        int maxFrequencia = 0;
        for (double altura : alturas) {
            int freq = contagem.getOrDefault(altura, 0) + 1;
            contagem.put(altura, freq);
            maxFrequencia = Math.max(maxFrequencia, freq);
        }

        // Encontrar a(s) moda(s)
        List<Double> modas = new ArrayList<>();
        for (var entry : contagem.entrySet()) {
            if (entry.getValue() == maxFrequencia) {
                modas.add(entry.getKey());
            }
        }

        // Encontrando a mediana do Array, como aqui o número é par, vai ser apenas esta operação
        Arrays.sort(alturas);
        double mediana = (alturas[alturas.length / 2 - 1] + alturas[alturas.length / 2]) / 2;

        // Exibindo os resultados
        System.out.println("Média das alturas: " + dfMedia.format(mediaAlturas));
        System.out.println("Variância: " + dfAll.format(variancia));
        System.out.println("Desvio padrão das alturas: " + dfAll.format(desvioPadrao));
        System.out.println("Moda(s): " + modas);
        System.out.println("Mediana: " + dfAll.format(mediana));
    }
}