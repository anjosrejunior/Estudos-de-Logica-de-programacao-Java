public class App {
    public static void main(String[] args) throws Exception {
        double x = 1.0, y = 1.0, H = 0;

        while (x <= 99) {
            H = H + ((double)x / y);
            x += 2.0;
            y += 1.0;
        }

        System.out.println("O valor de H é: " + H);
    }
}
