public class App {
    public static void main(String[] args) {
        
        int b = 1;

        double h = 0;

        for (int i = 0; i < 10; i++) {
            h += Math.pow(-1, i) * ((double) 1 / Math.pow(b,3));
            b += 2;
        }

        System.out.println("O valor de H é: " + h);
    }
}
