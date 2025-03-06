public class App {
    public static void main(String[] args) {
        int[] a = {2, 5, 2, 5, 2, 5, 2, 5, 2, 5};
        int[] b = {500, 450, 400, 350, 300, 250, 200, 150, 100, 50};

        double h = 0;

        for (int i = 0; i < 10; i++) {
            h += Math.pow(-1, i) * ((double) a[i] / b[i]);
        }

        System.out.println("O valor de H é: " + h);
    }
}
