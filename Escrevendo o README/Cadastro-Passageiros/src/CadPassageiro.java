import java.time.LocalDate;

public record CadPassageiro(
        String nomeDoPassageiro,
        int numeroPassagem,
        LocalDate data,
        String inicio,
        String destino,
        int poltrona,
        int idade
) { }
