import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Ferramentas tools = new Ferramentas();
        tools.gerarFichas(); // Iniciar a Classe que gera as fichas aleatórias

        System.out.println("Todos os proprietários com carros dos anos 80 em frente movidos a Diesel");
        tools.imprimirCarrosOitentaDiesel();

        System.out.println("\nLista de placas que começam com A e terminam com 0,2,4 e 7");
        tools.listarPlacasEspecificas();

        System.out.println("\nLista de carros com a Vogal como primeira letra e a soma Par");
        tools.listarModeloECorVogalEPar();

        tools.listarChassir();

        System.out.println("\nLista de carros por Chassir sem zero na placa");
        System.out.print("Qual é o chassir: ");
        int chassir = scan.nextInt();
        tools.listarCarrosPorChassirSemZero(chassir);

    }
}