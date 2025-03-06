public class App {
    public static void main(String[] args) throws Exception {
        
        double x = 1.0, y = 1.0, H = 0;

        int a = 1, b = 1;

        while (x <= 10) {
            H = H - (x / y);
            x += 1.0;
            y = a * b;
            a += 1;
            b += 1;
        }

        System.out.println("O valor de H é: " + H);
    }
}
