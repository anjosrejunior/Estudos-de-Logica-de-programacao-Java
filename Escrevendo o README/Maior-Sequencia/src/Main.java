import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(50);
        }

        int numberVet = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (numberVet < vet[i]) {
                System.out.println(vet[i]);
            }
            numberVet = vet[i];
        }
    }
}