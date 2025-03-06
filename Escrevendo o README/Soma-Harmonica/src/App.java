public class App {
    public static void main(String[] args) throws Exception {

        int n = 4;
        double h = 0;
        
        for (int i = 1; i <= n; i++) {
            h = h + (1.0/i);
        }

        System.out.println("O valor de H : " + h);
    }
}
