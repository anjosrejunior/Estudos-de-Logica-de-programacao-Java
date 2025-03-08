import java.util.Random;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Geradores {

    Random random = new Random();

    // Gerando um nome aleatório
    public String gerarNome() {
        // Gerando nomes Aleatórios
        String[] nomes = {
                "Alice", "Bruno", "Clara", "Diego", "Eva",
                "Felipe", "Gabriela", "Hugo", "Isabela", "João",
                "Karla", "Lucas", "Mariana", "Natália", "Otávio"
        };
        return nomes[random.nextInt(nomes.length)];
    }

    // Gerando números de Passagem aleatórios de  0 a 44
    public int gerarNumerodePassagem() {
        int numeros = random.nextInt();
        return numeros = random.nextInt(44);
    }

    // Método para gerar data aleatória
    public LocalDate gerarDataAleatoria() {
        // Definir data inicial e final
        LocalDate dataInicial = LocalDate.of(2000, 1, 1); // 1º de janeiro de 2000
        LocalDate dataFinal = LocalDate.of(2025, 12, 31); // 31 de dezembro de 2025

        // Calcular o número de dias entre as duas datas
        long diasEntreDatas = ChronoUnit.DAYS.between(dataInicial, dataFinal);

        // Gerar um número aleatório de dias dentro do intervalo
        long diasAleatorios = random.nextLong(diasEntreDatas + 1); // +1 para incluir o último dia

        // Adicionar os dias aleatórios à data inicial
        return dataInicial.plusDays(diasAleatorios);
    }

    public String inicio(){
        String inicio;
        return inicio = "Itapeva";
    }

    public String destino(){
        String destino;
        return destino = "Xique-Xique Bahia";
    }

    public int idade(){
        int idade;
        return idade = random.nextInt(18,50);
    }
}