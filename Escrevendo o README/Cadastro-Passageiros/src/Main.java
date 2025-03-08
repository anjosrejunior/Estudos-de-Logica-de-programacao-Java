import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Geradores gerar = new Geradores();
        DecimalFormat df = new DecimalFormat("#.##");
        CadPassageiro[] passageiros = new CadPassageiro[44];

        int poltrona = 1;
        // Preenchendo o array com instâncias do record
        for (int i = 0; i < passageiros.length; i++) {
            passageiros[i] = new CadPassageiro(
                    gerar.gerarNome(),
                    gerar.gerarNumerodePassagem(),
                    gerar.gerarDataAleatoria(),
                    gerar.inicio(),
                    gerar.destino(),
                    poltrona,
                    gerar.idade()
            );
            poltrona += 1; // Incrementa a poltrona para o próximo passageiro
        }

        String resposta;
        System.out.println("Quer saber a lista de passageiros ou media das idades?");
        System.out.println("Lista = Lista de passageiros  - Media = Media das idades dos Passageiros");
        resposta = scan.nextLine();

        if (resposta.equals("Lista")) {
            // Imprimindo as informações de cada passageiro
            for (CadPassageiro p : passageiros) {
                System.out.println("Informações do Passageiro:");
                System.out.println("Nome: " + p.nomeDoPassageiro());
                System.out.println("Número da Passagem: " + p.numeroPassagem());
                System.out.println("Data: " + p.data());
                System.out.println("Início: " + p.inicio());
                System.out.println("Destino: " + p.destino());
                System.out.println("Poltrona: " + p.poltrona());
                System.out.println("Idade: " + p.idade());
                System.out.println("---------------"); // Separador entre passageiros
            }
        }
        if (resposta.equals("Media")) {
            int somaIdades = 0;
            for (CadPassageiro p : passageiros) {
                somaIdades += p.idade();
            }

            double media = (double)somaIdades/ passageiros.length;

            System.out.println("Media das idades: " + df.format(media));

            System.out.println("----- Passageiros com a idade acima da média -----");
            for (CadPassageiro p : passageiros) {
                if (p.idade() >  media) {
                    System.out.println("Passageiro: " + p.nomeDoPassageiro() + " - Idade: " + p.idade());
                }
            }
        }
    }
}