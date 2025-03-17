import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ferramentas tools = new Ferramentas();
        Scanner scan = new Scanner(System.in);
        tools.gerarLinhaDeOnibus();
        int auxiliarnumber;

        System.out.println("\nConsulte o horário de saída e a distância percorrida por um ônibus.");
        System.out.print("Digite o número da linha: ");
        auxiliarnumber = scan.nextInt();
        tools.buscarLinhaPorNumero(auxiliarnumber);

        System.out.println("\nListar linhas lotadas");
        tools.listarLinhasLotadas();

        System.out.println("\nTempo estimado de chegada do ônibus");
        System.out.print("Digte o número da linha: ");
        auxiliarnumber = scan.nextInt();
        tools.tempoEstimadoDeChegada(auxiliarnumber);

        System.out.println("\nPorcentagem de cadeiras ocupadas e desocupadas");
        System.out.print("Digte o número da linha: ");
        auxiliarnumber = scan.nextInt();
        tools.perOcupacaoOnibus(auxiliarnumber);

        System.out.println("\nListar sexos:");
        System.out.print("Digte o número da linha: ");
        auxiliarnumber = scan.nextInt();
        tools.calcularPorcentagemSexo(auxiliarnumber);

        System.out.println("\nListar Poltronas janelas e corredores ocupados:");
        tools.janelasECorredoresOcupados();
    }
}