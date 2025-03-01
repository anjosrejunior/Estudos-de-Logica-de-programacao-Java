import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        double[] lista1 = new double[20];
        double[] lista2 = new double[20];
        double[] lista3 = new double[20];
        
        // Preenchendo as listas
        for (int i = 0; i < 20; i++) {
            lista1[i] = random.nextDouble(10.0); // Números entre 0 e 99
            lista2[i] = random.nextDouble(10.0); // Números entre 0 e 99
        }

        for (int i = 0; i < lista3.length; i++) {
            System.out.println(lista1[i] + lista2[i]);
        }


    }
}
