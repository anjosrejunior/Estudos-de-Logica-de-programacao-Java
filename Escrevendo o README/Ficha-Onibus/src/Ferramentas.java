import java.util.Random;
import java.util.Scanner;

public class Ferramentas {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    FichaOnibus[] onibus = new FichaOnibus[20];

    public String proprietario(){
        String[] nomes = {"Jorge", "Sebastião", "Carlos", "Roberto",
                "Fernando", "Marcos", "André", "Paulo", "Ricardo", "Luiz"};
        return nomes[random.nextInt(nomes.length)];
    }

    public String combustivel(){
        String[] combustiveis = { "Álcool", "Diesel", "Gasolina" };
        return combustiveis[random.nextInt(combustiveis.length)];
    }

    public String modelo() {
        String[] modelos = {
                "Marcopolo G7", "Volare W9", "Mercedes-Benz OF-1721",
                "Comil Campione", "Caio Apache VIP", "Busscar Vissta Buss",
                "Neobus Spectrum", "Mascarello Roma", "Agrale MA 15.0",
                "Irizar i6", "Scania K310", "Volvo B270F", "MAN Lion's Coach",
                "BYD D9W", "Trolleybus Solaris"
        };
        return modelos[random.nextInt(modelos.length)];
    }

    public String cor() {
        String[] cores = { "Branco", "Cinza", "Azul", "Amarelo" };
        return cores[random.nextInt(cores.length)];
    }

    public int numeroChassir(){
        int numeroChassir;
        return numeroChassir = random.nextInt(10000);
    }

    public int ano() {
        // Definindo a faixa de anos de 2000 a 2023 (pode ser ajustado conforme necessário)
        int anoInicial = 1900;
        int anoFinal = 2023;
        return random.nextInt((anoFinal - anoInicial) + 1) + anoInicial;
    }

    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";

    public String placa() {
        StringBuilder sb = new StringBuilder();

        // Adiciona 4 letras maiúsculas aleatórias
        for (int i = 0; i < 4; i++) {
            sb.append(LETRAS.charAt(random.nextInt(LETRAS.length())));
        }

        // Adiciona 3 números aleatórios
        for (int i = 0; i < 3; i++) {
            sb.append(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
        }

        return sb.toString();
    }

    public void gerarFichas() {
        for (int i = 0; i < onibus.length; i++) { // Percorre o vetor corretamente
            onibus[i] = new FichaOnibus( // Atualiza a posição correta do vetor
                    proprietario(),
                    combustivel(),
                    modelo(),
                    cor(),
                    numeroChassir(),
                    ano(),
                    placa()
            );
        }
    }

    public void imprimirCarrosOitentaDiesel() {
        boolean encontrado = false;

        for (FichaOnibus f : onibus) {
            boolean carro80Diesel = (f.ano() >= 1980 && f.combustivel().equals("Diesel"));
            if (carro80Diesel) {
                System.out.println("Proprietário: " + f.proprietario());
                System.out.println("Ano do Carro: " + f.ano());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum proprietário encontrado");
        }
    }

    public void listarPlacasEspecificas() {
        boolean encontrou = false;

        for (FichaOnibus f : onibus) {
            String placa = f.placa();

            if (placa.charAt(0) == 'A' &&
                    (placa.endsWith("O") || placa.endsWith("2") || placa.endsWith("4") || placa.endsWith("7"))) {

                System.out.println("Proprietário: " + f.proprietario());
                System.out.println("Placa: " + placa);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum veículo com as características especificadas foi encontrado.");
        }
    }

    public void listarModeloECorVogalEPar(){
        for (FichaOnibus f: onibus) {
            String placa = f.placa(); // Ex.: "ABC1234"
            // Verifica se a segunda letra (índice 1) é uma vogal
            char segundaLetra = Character.toUpperCase(placa.charAt(1));
            boolean temVogal = (segundaLetra == 'A' || segundaLetra == 'E' ||
                    segundaLetra == 'I' || segundaLetra == 'O' ||
                    segundaLetra == 'U');

            // Extrai os números (últimos 3 caracteres) e calcula a soma
            String numeros = placa.substring(4); // Pega "123" de "ABCD123"
            int soma = 0;
            for (char c : numeros.toCharArray()) {
                soma += Character.getNumericValue(c); // Converte cada dígito em int e soma
            }

            // Verifica se tem vogal na segunda posição e se a soma é par
            if (temVogal && soma % 2 == 0) {
                System.out.println("Placa: " + placa +
                        ", Modelo: " + f.modelo() +
                        ", Cor: " + f.cor());
            }
        }
    }

    public void listarCarrosPorChassirSemZero(int chassir){
        for (int i = 0; i < onibus.length; i++){
            String placa = onibus[i].placa(); // Ex.: "ABC1234"
            // Extrai os números (últimos 3 caracteres) e calcula a soma
            String numeros = placa.substring(4);// Pega "123" de "ABCD123"
            boolean semZero = (numeros.contains("0"));
            if (onibus[i].numeroChassi() == chassir && !semZero) {
                System.out.println("\nÔnibus encontrado!");
                System.out.println("Proprietário: " + onibus[i].proprietario());
                System.out.println("Chassir: " + onibus[i].numeroChassi());
                System.out.println("Modelo: " + onibus[i].modelo());
                System.out.println("Placa: " + onibus[i].placa());

                System.out.print("Edite o Proprietário: ");
                String novoProprietario = scan.nextLine();

                // Atualizando o ônibus no vetor vetOnibus
                onibus[i] = new FichaOnibus(
                        novoProprietario,
                        onibus[i].combustivel(),
                        onibus[i].modelo(),
                        onibus[i].cor(),
                        onibus[i].numeroChassi(),
                        onibus[i].ano(),
                        onibus[i].placa()
                );
                System.out.println("Ônibus atualizado com sucesso!");
                return;
            } else if (onibus[i].numeroChassi() == chassir && semZero) {
                System.out.println("Chassir econtrado, porém condição sem zero inválida");
            }
        }
    }

    public void listarChassir(){
        for (FichaOnibus f : onibus) {
            System.out.println("Proprietário: " + f.proprietario());
            System.out.println("Ano do Carro: " + f.ano());
            System.out.println("Número do Chassir: " + f.numeroChassi());
            System.out.println("Placa: " + f.placa());
        }
    }
}