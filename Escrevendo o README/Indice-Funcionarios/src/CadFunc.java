import java.time.LocalDate;

public record CadFunc(
        String nome,
        String endereco,
        int cpf,
        int telefone,
        String bairro,
        int cep,
        LocalDate anoAdmissao,
        LocalDate anoDemissao,
        String estadoCivil,
        int numeroDependentes,
        double salarioBase,
        String cargo,
        String setor
) { }
