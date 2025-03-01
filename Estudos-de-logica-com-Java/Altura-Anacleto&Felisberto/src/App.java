public class App {
    public static void main(String[] args) throws Exception {
        
        double alturaAnacleto  = 150, alturaFelisberto = 110;
        int passoAno = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto = alturaAnacleto + 2;
            alturaFelisberto = alturaFelisberto + 3;
            passoAno += 1;
        }

        System.out.println("Foram necessários " + passoAno + " anos para que Felisberto se tornasse maior que Anacleto.");

    }
}
