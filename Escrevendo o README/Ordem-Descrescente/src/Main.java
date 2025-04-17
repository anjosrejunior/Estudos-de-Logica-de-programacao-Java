public class Main {
    public static void main(String[] args) {
        int[] arrayDescrescente = {6,8,3};

        int troca;
        for (int i = 0; i < arrayDescrescente.length; i++) {
            for (int j = 0; j < arrayDescrescente.length; j++) {
                if (arrayDescrescente[i] > arrayDescrescente[j]) {
                    troca = arrayDescrescente[i];
                    arrayDescrescente[i] = arrayDescrescente[j];
                    arrayDescrescente[j] = troca;
                }
            }
        }

        for (int num : arrayDescrescente) {
            System.out.println(num);
        }
    }
}