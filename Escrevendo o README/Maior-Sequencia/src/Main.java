import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Cria um array de 4 elementos (ou mais, se desejar)
        int[] vet = {0,1,2,0,1,2,3,4};

        // Variáveis para rastrear a sequência atual e a maior sequência
        int sequencia = 1;
        int maiorSequencia = 1;

        // Verifica a maior sequência crescente
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > vet[i - 1]) {
                sequencia += 1; // Incrementa se o número atual é maior que o anterior
            } else {
                if (sequencia > maiorSequencia) {
                    maiorSequencia = sequencia; // Atualiza a maior sequência, se necessário
                }
                sequencia = 1; // Reinicia a sequência atual
            }
        }

        // Verifica a última sequência após o loop caso o ultimo número não passe pelo else if
        if (sequencia > maiorSequencia) {
            maiorSequencia = sequencia;
        }

        System.out.println("O tamanho da maior sequência consecutiva crescente é: " + maiorSequencia);
    }
}