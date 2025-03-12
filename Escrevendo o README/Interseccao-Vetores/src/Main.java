import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] vet1 = {1, 2, 3, 4, 5, 5, 6, 2, 3, 4, 5, 5, 6, 7, 8, 9, 0, 10, 11, 12};
        int[] vet2 = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 5, 6, 7, 8, 16, 17, 18};
        Set<Integer> intersecao = new HashSet<>(); // Usando um Set para evitar repetições

        for (int i = 0; i < vet1.length; i++) {
            intersecao.add(vet1[i]); // Adiciona ao Set, que automaticamente remove repetições
        }
        for (int i = 0; i < vet1.length; i++) {
            intersecao.add(vet2[i]); // Adiciona ao Set, que automaticamente remove repetições
        }

        System.out.println("----- Números iguais (interseção) -----");
        for (int num : intersecao) {
            System.out.println(num);
        }
    }
}