public class Main {
    public static void main(String[] args) {

        String[] nome = new String[50];
        double[] preco = new double[50];
        double[] custo = new double[50];

        for (int i = 0; i < 10; i++) {
            nome[i] = "Macarrão";
            preco[i] = 10.0;
            custo[i] = 7.0;
        }

        for (int i = 10; i < 30; i++) {
            nome[i] = "Arroz";
            preco[i] =  20.0;
            custo[i] = 19.0;
        }

        for (int i = 30; i < 50; i++) {
            nome[i] = "Feijão";
            preco[i] =  7.0;
            custo[i] = 3.0;
        }


        System.out.println("----- Lucro abaixo de 10% -----");
        for (int i = 0; i < nome.length; i++) {
            if ((preco[i] - custo[i]) / custo[i] * 100 < 10) {
                System.out.println("Nome do produto: " + nome[i]);
                System.out.println("Preço do produto: " + preco[i]);
                System.out.println("Custo do produto: " + custo[i]);
                System.out.println("-------------------------------");
            }
        }

        System.out.println("----- Lucro entre de 10% e 30% -----");
        for (int i = 0; i < nome.length; i++) {
            if ((preco[i] - custo[i]) / custo[i] * 100 <= 10 || (preco[i] - custo[i]) / custo[i] * 100 >= 30) {
                System.out.println("Nome do produto: " + nome[i]);
                System.out.println("Preço do produto: " + preco[i]);
                System.out.println("Custo do produto: " + custo[i]);
                System.out.println("-------------------------------");
            }
        }

        System.out.println("----- Lucro acima de 30% -----");
        for (int i = 0; i < nome.length; i++) {
            if ((preco[i] - custo[i]) / custo[i] * 100 > 30) {
                System.out.println("Nome do produto: " + nome[i]);
                System.out.println("Preço do produto: " + preco[i]);
                System.out.println("Custo do produto: " + custo[i]);
                System.out.println("-------------------------------");
            }
        }
    }
}