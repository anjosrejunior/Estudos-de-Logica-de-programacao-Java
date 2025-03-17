public record Onibus(
        int numeroDaLinha,
        String de,
        String para,
        String horarioEDataSaida,
        double distancia,
        int totalPoltronas,
        Passageiros[] passageiros
) { }