import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vet1 = new int[20];
        int[] vet2 = new int[20];
        Set<Integer> intersecao = new HashSet<>(); // Usando um Set para evitar repetições

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = random.nextInt(20);
            vet2[i] = random.nextInt(20);
        }

        for (int i = 0; i < vet1.length; i++) {
            for (int j = 0; j < vet2.length; j++) {
                if (vet1[i] == vet2[j]) {
                    intersecao.add(vet1[i]); // Adiciona ao Set, que automaticamente remove repetições
                }
            }
        }

        System.out.println("----- Números iguais (interseção) -----");
        for (int num : intersecao) {
            System.out.println(num);
        }
    }
}