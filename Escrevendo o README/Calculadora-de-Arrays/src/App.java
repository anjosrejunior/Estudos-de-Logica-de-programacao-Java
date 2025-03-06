import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        char[] operacoes = {'+', '-', '*', '/'};
        Random random = new Random();

        int[] lista1 = new int[20];
        int[] lista2 = new int[20];
        char[] lista3 = new char[20];
        
        // Preenchendo as listas
        for (int i = 0; i < 20; i++) {
            lista1[i] = random.nextInt(100); // Números entre 0 e 99
            lista2[i] = random.nextInt(100); // Números entre 0 e 99
            lista3[i] = operacoes[random.nextInt(operacoes.length)]; // Sorteando um operador
        }

        for (int i = 0; i < lista3.length; i++) {
            int resultado = 0;
            switch (lista3[i]) {
                case '+':
                    resultado = lista1[i] + lista2[i];
                    break;
                case '-':
                    resultado = lista1[i] - lista2[i];
                    break;
                case '*':
                    resultado = lista1[i] * lista2[i];
                    break;
                case '/':
                    resultado = (lista2[i] != 0) ? lista1[i] / lista2[i] : 0;
                    break;
            }
            System.out.println(lista1[i] + " " + lista3[i] + " " + lista2[i] + " = " + resultado);
        }
    }
        
}
