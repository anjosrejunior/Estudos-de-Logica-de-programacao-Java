import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");

        int[] vet = new int[50];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(50);
        }

        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        double media = ((double)soma / vet.length);

        System.out.println("Media = " + df.format(media));


        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (int i = 0; i < vet.length; i++) {
            boolean acima = (vet[i] > media + media * (10.0/100.0));
            boolean abaixo = (vet[i] > media - media * (10.0/100.0));

            if (acima == true) {
                acimaDaMedia ++;
            } else if (abaixo == true) {
                abaixoDaMedia ++;
            }
        }

        System.out.println("Quantidade de Notas acima da média = " + acimaDaMedia);
        System.out.println("Quantidade de Notas abaixo da média = " + abaixoDaMedia);


    }
}