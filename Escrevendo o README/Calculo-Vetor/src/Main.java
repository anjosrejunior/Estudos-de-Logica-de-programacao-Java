import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Calculos calc = new Calculos();

        int[] vet = new int[30];
        int[] vetCalc = new int[30];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(30);
        }

        System.out.println("----- Os números Antes da mudança -----");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Number "+ (i+1) + " : " + vet[i]);
        }
        System.out.println("----- Os números Antes da mudança -----");


        for (int i = 0; i < vet.length; i++) {
            if (calc.isPar(vet[i])) {
                vetCalc[i] = vet[i] * 2;
            }
            if (calc.isImpar(vet[i])) {
                vetCalc[i] = vet[i] * 3;
            }
        }

        System.out.println("----- Os números agora -----");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Number "+ (i+1) + " : " + vetCalc[i]);
        }
        System.out.println("----- Os números agora -----");

    }
}