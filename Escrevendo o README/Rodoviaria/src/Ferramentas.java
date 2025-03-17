import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Random;

public class Ferramentas {
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("#.##");
    Onibus[] linhaOnibus = new Onibus[10];
    Passageiros[] passageiros = new Passageiros[44];

    public String gerarDe(){
        String de = "Acre";
        return de;
    }

    public String gerarPara(){
        String para = "Xique-Xique-Bahia";
        return para;
    }
    
    public String gerarHorarioEDataSaida(){
        // Intervalos
        int anoMin = 2020;
        int anoMax = 2025;
        int horaMin = 0;
        int horaMax = 23;
        int minutoMin = 0;
        int minutoMax = 59;

        // Gerando valores aleatórios
        int ano = anoMin + random.nextInt(anoMax - anoMin + 1);
        int mes = random.nextInt(12) + 1; // 1 a 12
        YearMonth yearMonth = YearMonth.of(ano, mes);
        int diaMax = yearMonth.lengthOfMonth(); // Dias reais do mês (considera ano bissexto)
        int dia = 1 + random.nextInt(diaMax); // 1 até o último dia do mês
        int hora = horaMin + random.nextInt(horaMax - horaMin + 1);
        int minuto = minutoMin + random.nextInt(minutoMax - minutoMin + 1);

        // Criando a data e hora
        LocalDateTime dataHoraAleatoria = LocalDateTime.of(ano, mes, dia, hora, minuto);

        // Formatando a saída
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataHoraAleatoria.format(formatter);
        return dataFormatada;
    }

    public double gerarDistancia(){
        double distancia = random.nextDouble(100 + 1); // Ate 100 km de viagem
        return distancia;
    }

    public boolean gerarOcupado(){
        boolean ocupado = random.nextBoolean();
        return ocupado;
    }

    public int gerarNumeroPassagem(){
        int numeroPassagem = random.nextInt(100);
        return numeroPassagem;
    }

    public String gerarNomePassageiro(){
        String[] nomes = {
                "Ana", "Bruno", "Carla", "Diego", "Elena", "Felipe", "Gabriela", "Hugo", "Isabela", "João", "Karen",
                "Lucas", "Mariana", "Nuno", "Olga", "Pedro", "Quintino", "Rafaela", "Sofia", "Tiago"
        };
        return nomes[random.nextInt(nomes.length)];
    }

    public boolean gerarSexoPassageiro(){
        boolean sexo = random.nextBoolean();
        return sexo;
    }

    private Passageiros[] gerarPassageiros() {
        Random random = new Random();
        int numeroDePassageiros = random.nextInt(45); // Até 44 passageiros
        Passageiros[] passageiros = new Passageiros[numeroDePassageiros];
        for (int i = 0; i < numeroDePassageiros; i++) {
            passageiros[i] = new Passageiros(
                    gerarNumeroPassagem(),
                    gerarNomePassageiro(),
                    gerarSexoPassageiro()
            );
        }
        return passageiros;
    }

    public void gerarLinhaDeOnibus() {
        for (int i = 0; i < linhaOnibus.length; i++) {
            linhaOnibus[i] = new Onibus(
                    i + 1,
                    gerarDe(),
                    gerarPara(),
                    gerarHorarioEDataSaida(),
                    gerarDistancia(),
                    44, // Total de poltronas fixo
                    gerarPassageiros()
            );
        }
    }

    public void buscarLinhaPorNumero(int numeroLinha){
        System.out.println("\nÔnibus Linha " + numeroLinha);
        System.out.println("Horário e data de Saída: " + linhaOnibus[numeroLinha - 1].horarioEDataSaida());
        System.out.println("Distância percorridade de " + linhaOnibus[numeroLinha - 1].de() + " para " +
                linhaOnibus[numeroLinha - 1].para() + " é de " + df.format(linhaOnibus[numeroLinha - 1].distancia()));
        System.out.println("--------------------------------------------");
    }

    public void listarLinhasLotadas(){
        for (Onibus o : linhaOnibus){
            if (o.passageiros() == null) {
                System.out.println("Linha Não está lotada");
            } else {
                System.out.println("Linha "+ o.numeroDaLinha() +" lotada");
            }
        }
        System.out.println("--------------------------------------------");
    }

    public void tempoEstimadoDeChegada(int numeroLinha){
        System.out.println("Ônibus Linha: " + numeroLinha);
        System.out.println("Horário e data de Saída: " + linhaOnibus[numeroLinha - 1].horarioEDataSaida());
        System.out.println("Distância percorridade de " + linhaOnibus[numeroLinha - 1].de() + " para " +
                linhaOnibus[numeroLinha - 1].para() + " é de " + df.format(linhaOnibus[numeroLinha - 1].distancia()) + "KM");
        System.out.println("O tempo estimado de chegada viajando a 60KM/H é de: " +
                df.format((linhaOnibus[numeroLinha - 1].distancia() / 60.0) * 60.0) + " Minutos");
        System.out.println("--------------------------------------------");
    }

    public void perOcupacaoOnibus(int linha) {
        // Procurar o ônibus com o número da linha fornecido
        Onibus onibus = null;
        for (Onibus o : linhaOnibus) {
            if (o != null && o.numeroDaLinha() == linha) {
                onibus = o;
                break;
            }
        }

        // Verificar se o ônibus foi encontrado
        if (onibus == null) {
            System.out.println("Ônibus com a linha " + linha + " não encontrado.");
            return;
        }

        // Número total de poltronas (fixo como 44, conforme seu código original)
        int totalPoltronas = onibus.totalPoltronas();

        // Número de passageiros (tamanho do array de passageiros)
        int numeroPassageiros = onibus.passageiros().length;

        // Calcular poltronas livres
        int poltronasLivres = totalPoltronas - numeroPassageiros;

        // Calcular a porcentagem de ocupação
        double porcentagemOcupacao = (double) numeroPassageiros / totalPoltronas * 100;

        // Exibir os resultados
        System.out.println("Ônibus da linha " + linha + ":");
        System.out.println("Total de poltronas: " + totalPoltronas);
        System.out.println("Número de passageiros: " + numeroPassageiros);
        System.out.println("Poltronas livres: " + poltronasLivres);
        System.out.printf("Porcentagem de ocupação: %.2f%%\n", porcentagemOcupacao);
    }

    public void calcularPorcentagemSexo(int linha) {
        // Procurar o ônibus com o número da linha fornecido
        Onibus onibus = null;
        for (Onibus o : linhaOnibus) {
            if (o != null && o.numeroDaLinha() == linha) {
                onibus = o;
                break;
            }
        }

        // Verificar se o ônibus foi encontrado
        if (onibus == null) {
            System.out.println("Ônibus com a linha " + linha + " não encontrado.");
            return;
        }

        // Contar passageiros por sexo
        int totalPassageiros = onibus.passageiros().length;
        int masculinos = 0;
        int femininos = 0;

        for (Passageiros p : onibus.passageiros()) {
            if (p.sexo()) { // true = Masculino
                masculinos++;
            } else { // false = Feminino
                femininos++;
            }
        }

        // Calcular porcentagens
        double porcentagemMasculinos = (double) masculinos / totalPassageiros * 100;
        double porcentagemFemininos = (double) femininos / totalPassageiros * 100;

        // Exibir os resultados
        System.out.println("Ônibus da linha " + linha + ":");
        System.out.println("  Total de passageiros: " + totalPassageiros);
        System.out.printf("  Porcentagem de passageiros masculinos: %.2f%%\n", porcentagemMasculinos);
        System.out.printf("  Porcentagem de passageiros femininos: %.2f%%\n", porcentagemFemininos);
    }

    public void janelasECorredoresOcupados(){
        for (Onibus o : linhaOnibus) {
            // Contadores para cada ônibus
            int somaPar = 0;
            int somaImpar = 0;

            // Obtém o array de passageiros do ônibus atual
            Passageiros[] passageiros = o.passageiros();

            // Conta passageiros em índices pares (corredor) e ímpares (janela)
            for (int i = 0; i < passageiros.length; i++) {
                if (i % 2 == 0) { // Assentos de corredor (índices pares)
                    somaPar++;
                } else { // Assentos de janela (índices ímpares)
                    somaImpar++;
                }
            }

            // Calcula o número total de passageiros (não poltronas)
            int totalPassageiros = o.passageiros().length;

            // Calcula as porcentagens com base no número real de passageiros
            double percentPar = totalPassageiros > 0 ? ((double) somaPar / totalPassageiros) * 100.0 : 0.0;
            double percentImpar = totalPassageiros > 0 ? ((double) somaImpar / totalPassageiros) * 100.0 : 0.0;

            // Exibe os resultados
            System.out.println("Ônibus Linha: " + o.numeroDaLinha());
            System.out.println("Número de passageiros em assentos de corredor: " + somaPar);
            System.out.printf("Porcentagem de ocupação dos assentos de corredor: %.2f%%\n", percentPar);
            System.out.println("Número de passageiros em assentos de janela: " + somaImpar);
            System.out.printf("Porcentagem de ocupação dos assentos de janela: %.2f%%\n", percentImpar);
        }
    }
}