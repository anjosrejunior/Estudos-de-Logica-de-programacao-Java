import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {
        
        BigInteger soma = BigInteger.ZERO;
        BigInteger multiplo = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            soma = soma.add(multiplo);
            multiplo = multiplo.multiply(BigInteger.TWO);
        }

        System.out.println("Total de grãos: " + soma);
    }
}
