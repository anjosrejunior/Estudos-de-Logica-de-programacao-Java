import java.util.Random;

public class Ferramentas {
    Random random = new Random();

    public int gerarNumeroDeMatricula(){
        int numeroDaMatricula = random.nextInt(1000,2000);
        return numeroDaMatricula;
    }

    public String gerarNome() {
        String[] nomes = {
                "Ana", "Bruno", "Carla", "Diego", "Elena", "Felipe", "Gabriela", "Hugo", "Isabela", "João", "Karen",
                "Lucas", "Mariana", "Nuno", "Olga", "Pedro", "Quintino", "Rafaela", "Sofia", "Tiago"
        };
        return nomes[random.nextInt(nomes.length)];
    }

    public String serie(){
        String[] series = {"1ª série", "2ª série", "3ª série", "4ª série", "5ª série"};
        return series[random.nextInt(series.length)];
    }

    public boolean sexo(){
        // True Masculino - False Feminino
        boolean sexo = random.nextBoolean();
        return sexo;
    }

    public int anoDeNascimento(){
        int anoInicial = 2019;
        int anoAtual = 2025;
        int anoDeNascimento;
    }
}
