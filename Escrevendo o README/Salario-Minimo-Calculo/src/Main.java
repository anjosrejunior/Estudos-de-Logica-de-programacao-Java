import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double SALARIO_MINIMO = 1293.20;

        System.out.print("Qual o seu salário mensal: ");
        double salario = input.nextDouble();

        double result = salario / SALARIO_MINIMO;

        System.out.println("Você vai receber " + result + " salários por mês.");
    }
}