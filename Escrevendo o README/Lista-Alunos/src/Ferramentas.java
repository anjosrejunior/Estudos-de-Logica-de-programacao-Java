import java.text.DecimalFormat;
import java.util.Random;

public class Ferramentas {
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("#.##");
    FichaAlunos[] alunos = new FichaAlunos[500];

    public int gerarNumeroDeMatricula() {
        return random.nextInt(1000,2000);
    }

    public String gerarNome() {
        String[] nomes = {
                "Ana", "Bruno", "Carla", "Diego", "Elena", "Felipe", "Gabriela", "Hugo", "Isabela", "João", "Karen",
                "Lucas", "Mariana", "Nuno", "Olga", "Pedro", "Quintino", "Rafaela", "Sofia", "Tiago"
        };
        return nomes[random.nextInt(nomes.length)];
    }

    public String gerarSerie() {
        String[] series = {"1ª série", "2ª série", "3ª série", "4ª série", "5ª série"};
        return series[random.nextInt(series.length)];
    }

    public boolean gerarSexo() {
        // True Masculino - False Feminino
        return random.nextBoolean();
    }

    public int gerarAnoDeNascimento(String serie) {
        int anoDeNascimento;
        switch (serie) {
            case "1ª série":
                anoDeNascimento = 2019;
                break;
            case "2ª série":
                anoDeNascimento = 2018;
                break;
            case "3ª série":
                anoDeNascimento = 2017;
                break;
            case "4ª série":
                anoDeNascimento = 2016;
                break;
            case "5ª série":
                anoDeNascimento = 2015;
                break;
            default:
                anoDeNascimento = 0; // Ou outro valor padrão, caso a série não seja reconhecida
                break;
        }
        return anoDeNascimento;
    }

    public String selecionarTurma(String serie) {
        String[] turmas = {
                "1º ano A", "1º ano B", "1º ano C",  // 0-2
                "2º ano A", "2º ano B", "2º ano C",  // 3-5
                "3º ano A", "3º ano B", "3º ano C",  // 6-8
                "4º ano A", "4º ano B", "4º ano C",  // 9-11
                "5º ano A", "5º ano B", "5º ano C"   // 12-14
        };

        return switch (serie) {
            case "1ª série" -> turmas[random.nextInt(0, 3)];   // 0 a 2
            case "2ª série" -> turmas[random.nextInt(3, 6)];   // 3 a 5
            case "3ª série" -> turmas[random.nextInt(6, 9)];   // 6 a 8
            case "4ª série" -> turmas[random.nextInt(9, 12)];  // 9 a 11
            case "5ª série" -> turmas[random.nextInt(12, 15)]; // 12 a 14
            default -> "Série inválida";
        };
    }

    public double gerarMedia() {
        return random.nextDouble(100.0);
    }

    public boolean determinarAprovado(double media) {
        return media > 60.0;
    }

    public int gerarIdade(int idadeNascimento){
        int idade = random.nextInt(2025 - idadeNascimento, 2025 - idadeNascimento + 2);
        return idade;
    }

    public String selecionarNaturalidade() {
        String[] naturalidades = {"Brasileiro", "Americano", "Chines", "Japones", "Russo"};
        return naturalidades[random.nextInt(naturalidades.length)];
    }

    public void gerarFichaAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            // Gerando previamente para manter a interação com a classe selecionarTurma
            String serieGerada = gerarSerie();
            // Gerando previamente para manter a interação com a classe determinar aprovado
            double mediaGerada = gerarMedia();
            int anoDeNascimentoGerado = gerarAnoDeNascimento(serieGerada);

            alunos[i] = new FichaAlunos(
                    gerarNumeroDeMatricula(),
                    gerarNome(),
                    serieGerada,
                    gerarSexo(),
                    anoDeNascimentoGerado,
                    selecionarTurma(serieGerada),
                    mediaGerada,
                    determinarAprovado(mediaGerada),
                    gerarIdade(anoDeNascimentoGerado),
                    selecionarNaturalidade()
            );
        }
    }

    // Porcentagem de alunos aprovados por turma
    public void perAlunosAprovadosPorTurma(){
        int a1 = 0, b1 = 0, c1 = 0;
        int a2 = 0, b2 = 0, c2 = 0;
        int a3 = 0, b3 = 0, c3 = 0;
        int a4 = 0, b4 = 0, c4 = 0;
        int a5 = 0, b5 = 0, c5 = 0;

        // Conta a quantidade de alunos por turma
        for (FichaAlunos f: alunos) {
            switch (f.turma()) {
                case "1º ano A" -> a1 ++;
                case "1º ano B" -> b1 ++;
                case "1º ano C" -> c1 ++;
                case "2º ano A" -> a2 ++;
                case "2º ano B" -> b2 ++;
                case "2º ano C" -> c2 ++;
                case "3º ano A" -> a3 ++;
                case "3º ano B" -> b3 ++;
                case "3º ano C" -> c3 ++;
                case "4º ano A" -> a4 ++;
                case "4º ano B" -> b4 ++;
                case "4º ano C" -> c4 ++;
                case "5º ano A" -> a5 ++;
                case "5º ano B" -> b5 ++;
                case "5º ano C" -> c5 ++;
                default -> System.out.println("Turma não reconhecida: " + f.turma());
            }
        }

        int a1Ap = 0, b1Ap = 0, c1Ap = 0;
        int a2Ap = 0, b2Ap = 0, c2Ap = 0;
        int a3Ap = 0, b3Ap = 0, c3Ap = 0;
        int a4Ap = 0, b4Ap = 0, c4Ap = 0;
        int a5Ap = 0, b5Ap = 0, c5Ap = 0;

        // Conta a quantidade de alunos aprovados por turma
        for (FichaAlunos f : alunos) {
            switch (f.turma()) {
                case "1º ano A" -> { if (f.aprovado()) a1Ap++; }
                case "1º ano B" -> { if (f.aprovado()) b1Ap++; }
                case "1º ano C" -> { if (f.aprovado()) c1Ap++; }
                case "2º ano A" -> { if (f.aprovado()) a2Ap++; }
                case "2º ano B" -> { if (f.aprovado()) b2Ap++; }
                case "2º ano C" -> { if (f.aprovado()) c2Ap++; }
                case "3º ano A" -> { if (f.aprovado()) a3Ap++; }
                case "3º ano B" -> { if (f.aprovado()) b3Ap++; }
                case "3º ano C" -> { if (f.aprovado()) c3Ap++; }
                case "4º ano A" -> { if (f.aprovado()) a4Ap++; }
                case "4º ano B" -> { if (f.aprovado()) b4Ap++; }
                case "4º ano C" -> { if (f.aprovado()) c4Ap++; }
                case "5º ano A" -> { if (f.aprovado()) a5Ap++; }
                case "5º ano B" -> { if (f.aprovado()) b5Ap++; }
                case "5º ano C" -> { if (f.aprovado()) c5Ap++; }
                default -> System.out.println("Turma não reconhecida: " + f.turma());
            }
        }

        // Cálculo da porcentagem de aprovados por turma (direto)
        double percA1 = (double) a1Ap / a1 * 100;
        double percB1 = (double) b1Ap / b1 * 100;
        double percC1 = (double) c1Ap / c1 * 100;

        double percA2 = (double) a2Ap / a2 * 100;
        double percB2 = (double) b2Ap / b2 * 100;
        double percC2 = (double) c2Ap / c2 * 100;

        double percA3 = (double) a3Ap / a3 * 100;
        double percB3 = (double) b3Ap / b3 * 100;
        double percC3 = (double) c3Ap / c3 * 100;

        double percA4 = (double) a4Ap / a4 * 100;
        double percB4 = (double) b4Ap / b4 * 100;
        double percC4 = (double) c4Ap / c4 * 100;

        double percA5 = (double) a5Ap / a5 * 100;
        double percB5 = (double) b5Ap / b5 * 100;
        double percC5 = (double) c5Ap / c5 * 100;

        // Impressão dos resultados
        System.out.println("Porcentagem de aprovados:");
        System.out.println("1º ano A: " + df.format(percA1) + "%");
        System.out.println("1º ano B: " + df.format(percB1) + "%");
        System.out.println("1º ano C: " + df.format(percC1) + "%");
        System.out.println("2º ano A: " + df.format(percA2) + "%");
        System.out.println("2º ano B: " + df.format(percB2) + "%");
        System.out.println("2º ano C: " + df.format(percC2) + "%");
        System.out.println("3º ano A: " + df.format(percA3) + "%");
        System.out.println("3º ano B: " + df.format(percB3) + "%");
        System.out.println("3º ano C: " + df.format(percC3) + "%");
        System.out.println("4º ano A: " + df.format(percA4) + "%");
        System.out.println("4º ano B: " + df.format(percB4) + "%");
        System.out.println("4º ano C: " + df.format(percC4) + "%");
        System.out.println("5º ano A: " + df.format(percA5) + "%");
        System.out.println("5º ano B: " + df.format(percB5) + "%");
        System.out.println("------------------------------------");

        // Cálculo da porcentagem de aprovados por série
        double totalAprovados1 = a1Ap + b1Ap + c1Ap;
        double totalAlunos1 = a1 + b1 + c1;
        double percSerie1 = (double) totalAprovados1 / totalAlunos1 * 100;

        double totalAprovados2 = a2Ap + b2Ap + c2Ap;
        double totalAlunos2 = a2 + b2 + c2;
        double percSerie2 = (double) totalAprovados2 / totalAlunos2 * 100;

        double totalAprovados3 = a3Ap + b3Ap + c3Ap;
        double totalAlunos3 = a3 + b3 + c3;
        double percSerie3 = (double) totalAprovados3 / totalAlunos3 * 100;

        double totalAprovados4 = a4Ap + b4Ap + c4Ap;
        double totalAlunos4 = a4 + b4 + c4;
        double percSerie4 = (double) totalAprovados4 / totalAlunos4 * 100;

        double totalAprovados5 = a5Ap + b5Ap + c5Ap;
        double totalAlunos5 = a5 + b5 + c5;
        double percSerie5 = (double) totalAprovados5 / totalAlunos5 * 100;

        System.out.println("Porcentagem de aprovados por série:");
        System.out.println("1º ano: " + df.format(percSerie1) + "%");
        System.out.println("2º ano: " + df.format(percSerie2) + "%");
        System.out.println("3º ano: " + df.format(percSerie3) + "%");
        System.out.println("4º ano: " + df.format(percSerie4) + "%");
        System.out.println("5º ano: " + df.format(percSerie5) + "%");
    }

    // Porcentaagem de alunos do sexo masculino e feminino por turma
    public void perAlunosMFTurma(){
        int a1 = 0, b1 = 0, c1 = 0;
        int a2 = 0, b2 = 0, c2 = 0;
        int a3 = 0, b3 = 0, c3 = 0;
        int a4 = 0, b4 = 0, c4 = 0;
        int a5 = 0, b5 = 0, c5 = 0;

        int a1M = 0, b1M = 0, c1M = 0;
        int a2M = 0, b2M = 0, c2M = 0;
        int a3M = 0, b3M = 0, c3M = 0;
        int a4M = 0, b4M = 0, c4M = 0;
        int a5M = 0, b5M = 0, c5M = 0;

        // Conta a quantidade de alunos por turma
        for (FichaAlunos f: alunos) {
            switch (f.turma()) {
                case "1º ano A" -> a1 ++;
                case "1º ano B" -> b1 ++;
                case "1º ano C" -> c1 ++;
                case "2º ano A" -> a2 ++;
                case "2º ano B" -> b2 ++;
                case "2º ano C" -> c2 ++;
                case "3º ano A" -> a3 ++;
                case "3º ano B" -> b3 ++;
                case "3º ano C" -> c3 ++;
                case "4º ano A" -> a4 ++;
                case "4º ano B" -> b4 ++;
                case "4º ano C" -> c4 ++;
                case "5º ano A" -> a5 ++;
                case "5º ano B" -> b5 ++;
                case "5º ano C" -> c5 ++;
                default -> System.out.println("Turma não reconhecida: " + f.turma());
            }
        }

        // Calcular os alunos do sexo masculino e feminino
        for (FichaAlunos f : alunos) {
            switch (f.turma()) {
                case "1º ano A" -> { if (f.sexo()) a1M++; }
                case "1º ano B" -> { if (f.sexo()) b1M++; }
                case "1º ano C" -> { if (f.sexo()) c1M++; }
                case "2º ano A" -> { if (f.sexo()) a2M++; }
                case "2º ano B" -> { if (f.sexo()) b2M++; }
                case "2º ano C" -> { if (f.sexo()) c2M++; }
                case "3º ano A" -> { if (f.sexo()) a3M++; }
                case "3º ano B" -> { if (f.sexo()) b3M++; }
                case "3º ano C" -> { if (f.sexo()) c3M++; }
                case "4º ano A" -> { if (f.sexo()) a4M++; }
                case "4º ano B" -> { if (f.sexo()) b4M++; }
                case "4º ano C" -> { if (f.sexo()) c4M++; }
                case "5º ano A" -> { if (f.sexo()) a5M++; }
                case "5º ano B" -> { if (f.sexo()) b5M++; }
                case "5º ano C" -> { if (f.sexo()) c5M++; }
                default -> System.out.println("Turma não reconhecida: " + f.turma());
            }
        }

        // Cálculo do número de alunas do sexo feminino por turma
        int a1F = a1 - a1M, b1F = b1 - b1M, c1F = c1 - c1M;
        int a2F = a2 - a2M, b2F = b2 - b2M, c2F = c2 - c2M;
        int a3F = a3 - a3M, b3F = b3 - b3M, c3F = c3 - c3M;
        int a4F = a4 - a4M, b4F = b4 - b4M, c4F = c4 - c4M;
        int a5F = a5 - a5M, b5F = b5 - b5M, c5F = c5 - c5M;

        // Cálculo da porcentagem de alunos do sexo masculino por turma (direto)
        double perMA1 = (double) a1M / a1 * 100;
        double perMB1 = (double) b1M / b1 * 100;
        double perMC1 = (double) c1M / c1 * 100;

        double perMA2 = (double) a2M / a2 * 100;
        double perMB2 = (double) b2M / b2 * 100;
        double perMC2 = (double) c2M / c2 * 100;

        double perMA3 = (double) a3M / a3 * 100;
        double perMB3 = (double) b3M / b3 * 100;
        double perMC3 = (double) c3M / c3 * 100;

        double perMA4 = (double) a4M / a4 * 100;
        double perMB4 = (double) b4M / b4 * 100;
        double perMC4 = (double) c4M / c4 * 100;

        double perMA5 = (double) a5M / a5 * 100;
        double perMB5 = (double) b5M / b5 * 100;
        double perMC5 = (double) c5M / c5 * 100;

        // Cálculo da porcentagem de alunos do sexo feminino por turma (direto)
        double perFA1 = (double) a1F / a1 * 100;
        double perFB1 = (double) b1F / b1 * 100;
        double perFC1 = (double) c1F / c1 * 100;

        double perFA2 = (double) a2F / a2 * 100;
        double perFB2 = (double) b2F / b2 * 100;
        double perFC2 = (double) c2F / c2 * 100;

        double perFA3 = (double) a3F / a3 * 100;
        double perFB3 = (double) b3F / b3 * 100;
        double perFC3 = (double) c3F / c3 * 100;

        double perFA4 = (double) a4F / a4 * 100;
        double perFB4 = (double) b4F / b4 * 100;
        double perFC4 = (double) c4F / c4 * 100;

        double perFA5 = (double) a5F / a5 * 100;
        double perFB5 = (double) b5F / b5 * 100;
        double perFC5 = (double) c5F / c5 * 100;

        // Formatação da porcentagem
        DecimalFormat df = new DecimalFormat("0.00");

        // Impressão dos resultados
        System.out.println("\nPorcentagem de alunos do sexo masculino por turma:");
        System.out.println("1º ano A: " + df.format(perMA1) + "%");
        System.out.println("1º ano B: " + df.format(perMB1) + "%");
        System.out.println("1º ano C: " + df.format(perMC1) + "%");
        System.out.println("2º ano A: " + df.format(perMA2) + "%");
        System.out.println("2º ano B: " + df.format(perMB2) + "%");
        System.out.println("2º ano C: " + df.format(perMC2) + "%");
        System.out.println("3º ano A: " + df.format(perMA3) + "%");
        System.out.println("3º ano B: " + df.format(perMB3) + "%");
        System.out.println("3º ano C: " + df.format(perMC3) + "%");
        System.out.println("4º ano A: " + df.format(perMA4) + "%");
        System.out.println("4º ano B: " + df.format(perMB4) + "%");
        System.out.println("4º ano C: " + df.format(perMC4) + "%");
        System.out.println("5º ano A: " + df.format(perMA5) + "%");
        System.out.println("5º ano B: " + df.format(perMB5) + "%");
        System.out.println("5º ano C: " + df.format(perMC5) + "%");
        System.out.println("------------------------------------");

        System.out.println("Porcentagem de alunos do sexo feminino por turma:");
        System.out.println("1º ano A: " + df.format(perFA1) + "%");
        System.out.println("1º ano B: " + df.format(perFB1) + "%");
        System.out.println("1º ano C: " + df.format(perFC1) + "%");
        System.out.println("2º ano A: " + df.format(perFA2) + "%");
        System.out.println("2º ano B: " + df.format(perFB2) + "%");
        System.out.println("2º ano C: " + df.format(perFC2) + "%");
        System.out.println("3º ano A: " + df.format(perFA3) + "%");
        System.out.println("3º ano B: " + df.format(perFB3) + "%");
        System.out.println("3º ano C: " + df.format(perFC3) + "%");
        System.out.println("4º ano A: " + df.format(perFA4) + "%");
        System.out.println("4º ano B: " + df.format(perFB4) + "%");
        System.out.println("4º ano C: " + df.format(perFC4) + "%");
        System.out.println("5º ano A: " + df.format(perFA5) + "%");
        System.out.println("5º ano B: " + df.format(perFB5) + "%");
        System.out.println("5º ano C: " + df.format(perFC5) + "%");
        System.out.println("------------------------------------");

        // Cálculo da porcentagem de alunos do sexo masculino por série
        double totalMasculino1 = a1M + b1M + c1M;
        double totalAlunos1 = a1 + b1 + c1;
        double percSerieM1 = (double) totalMasculino1 / totalAlunos1 * 100;

        double totalMasculino2 = a2M + b2M + c2M;
        double totalAlunos2 = a2 + b2 + c2;
        double percSerieM2 = (double) totalMasculino2 / totalAlunos2 * 100;

        double totalMasculino3 = a3M + b3M + c3M;
        double totalAlunos3 = a3 + b3 + c3;
        double percSerieM3 = (double) totalMasculino3 / totalAlunos3 * 100;

        double totalMasculino4 = a4M + b4M + c4M;
        double totalAlunos4 = a4 + b4 + c4;
        double percSerieM4 = (double) totalMasculino4 / totalAlunos4 * 100;

        double totalMasculino5 = a5M + b5M + c5M;
        double totalAlunos5 = a5 + b5 + c5;
        double percSerieM5 = (double) totalMasculino5 / totalAlunos5 * 100;

        // Cálculo da porcentagem de alunos do sexo feminino por série
        double totalFeminino1 = a1F + b1F + c1F;
        double totalAlunos1F = a1 + b1 + c1;
        double percSerieF1 = (double) totalFeminino1 / totalAlunos1F * 100;

        double totalFeminino2 = a2F + b2F + c2F;
        double totalAlunos2F = a2 + b2 + c2;
        double percSerieF2 = (double) totalFeminino2 / totalAlunos2F * 100;

        double totalFeminino3 = a3F + b3F + c3F;
        double totalAlunos3F = a3 + b3 + c3;
        double percSerieF3 = (double) totalFeminino3 / totalAlunos3F * 100;

        double totalFeminino4 = a4F + b4F + c4F;
        double totalAlunos4F = a4 + b4 + c4;
        double percSerieF4 = (double) totalFeminino4 / totalAlunos4F * 100;

        double totalFeminino5 = a5F + b5F + c5F;
        double totalAlunos5F = a5 + b5 + c5;
        double percSerieF5 = (double) totalFeminino5 / totalAlunos5F * 100;

        // Impressão dos resultados
        System.out.println("Porcentagem de alunos do sexo masculino por série:");
        System.out.println("1º ano: " + df.format(percSerieM1) + "%");
        System.out.println("2º ano: " + df.format(percSerieM2) + "%");
        System.out.println("3º ano: " + df.format(percSerieM3) + "%");
        System.out.println("4º ano: " + df.format(percSerieM4) + "%");
        System.out.println("5º ano: " + df.format(percSerieM5) + "%");
        System.out.println("------------------------------------");

        System.out.println("Porcentagem de alunos do sexo feminino por série:");
        System.out.println("1º ano: " + df.format(percSerieF1) + "%");
        System.out.println("2º ano: " + df.format(percSerieF2) + "%");
        System.out.println("3º ano: " + df.format(percSerieF3) + "%");
        System.out.println("4º ano: " + df.format(percSerieF4) + "%");
        System.out.println("5º ano: " + df.format(percSerieF5) + "%");
    }

    public void mediaIdadesPorSerie() {
        double somaIdadeSerie1 = 0, somaIdadeSerie2 = 0, somaIdadeSerie3 = 0, somaIdadeSerie4 = 0, somaIdadeSerie5 = 0;
        int somaAluno1 = 0, somaAluno2 = 0, somaAluno3 = 0, somaAluno4 = 0, somaAluno5 = 0;

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("1ª série")) {
                somaIdadeSerie1 += f.idade();
                somaAluno1++;
            } else if (f.serie().equals("2ª série")) {
                somaIdadeSerie2 += f.idade();
                somaAluno2++;
            } else if (f.serie().equals("3ª série")) {
                somaIdadeSerie3 += f.idade();
                somaAluno3++;
            } else if (f.serie().equals("4ª série")) {
                somaIdadeSerie4 += f.idade();
                somaAluno4++;
            } else if (f.serie().equals("5ª série")) {
                somaIdadeSerie5 += f.idade();
                somaAluno5++;
            } else {
                System.out.println("Serie não reconhecida: " + f.serie());
            }
        }

        double mediaAlunos1 = somaIdadeSerie1 / somaAluno1;
        double mediaAlunos2 = somaIdadeSerie2 / somaAluno2;
        double mediaAlunos3 = somaIdadeSerie3 / somaAluno3;
        double mediaAlunos4 = somaIdadeSerie4 / somaAluno4;
        double mediaAlunos5 = somaIdadeSerie5 / somaAluno5;

        // Impressão dos resultados
        System.out.println("\nMédia de idade por série:");
        System.out.println("1ª série: " + df.format(mediaAlunos1) + " anos");
        System.out.println("2ª série: " + df.format(mediaAlunos2) + " anos");
        System.out.println("3ª série: " + df.format(mediaAlunos3) + " anos");
        System.out.println("4ª série: " + df.format(mediaAlunos4) + " anos");
        System.out.println("5ª série: " + df.format(mediaAlunos5) + " anos");
    }

    public void listarAlunos(){
        for (FichaAlunos f :alunos) {
            System.out.println("Número de Matrícula: " + f.numeroMatricula());
            System.out.println("Nome: " + f.nome());
            System.out.println("Série: " + f.serie());
            System.out.println("Sexo: " + (f.sexo() ? "Masculino" : "Feminino")); // Ou outra representação de sexo
            System.out.println("Ano de Nascimento: " + f.anoDeNascimento());
            System.out.println("Turma: " + f.turma());
            System.out.println("Média: " + f.media());
            System.out.println("Aprovado: " + (f.aprovado() ? "Sim" : "Não"));
            System.out.println("Idade: " + f.idade());
            System.out.println("Naturalidade: " + f.naturalidade());
            System.out.println("------------------------------------");
        }
    }

    public void perEstrangeiros() {
        int somaEstrangeiros = 0;
        for (FichaAlunos f: alunos){
            if (f.naturalidade() != null && f.naturalidade() != "Brasileiro") {
                somaEstrangeiros ++;
            }
        }

        double perEstrangeiros = ((double)somaEstrangeiros/ alunos.length) * 100.0;

        System.out.printf("\nA porcentagem de estrangeiros é %.2f%%\n", perEstrangeiros);
    }

    public void perAlunosAtrasados() {
        int somaRa1 = 0, somaRb1 = 0, somaRc1 = 0;
        int somaRa2 = 0, somaRb2 = 0, somaRc2 = 0;
        int somaRa3 = 0, somaRb3 = 0, somaRc3 = 0;
        int somaRa4 = 0, somaRb4 = 0, somaRc4 = 0;
        int somaRa5 = 0, somaRb5 = 0, somaRc5 = 0;

        for (FichaAlunos f : alunos) {
            switch (f.turma()) {
                case "1º ano A" -> { if (f.media() < 60.0) somaRa1++; }
                case "1º ano B" -> { if (f.media() < 60.0) somaRb1++; }
                case "1º ano C" -> { if (f.media() < 60.0) somaRc1++; }

                case "2º ano A" -> { if (f.media() < 60.0) somaRa2++; }
                case "2º ano B" -> { if (f.media() < 60.0) somaRb2++; }
                case "2º ano C" -> { if (f.media() < 60.0) somaRc2++; }

                case "3º ano A" -> { if (f.media() < 60.0) somaRa3++; }
                case "3º ano B" -> { if (f.media() < 60.0) somaRb3++; }
                case "3º ano C" -> { if (f.media() < 60.0) somaRc3++; }

                case "4º ano A" -> { if (f.media() < 60.0) somaRa4++; }
                case "4º ano B" -> { if (f.media() < 60.0) somaRb4++; }
                case "4º ano C" -> { if (f.media() < 60.0) somaRc4++; }

                case "5º ano A" -> { if (f.media() < 60.0) somaRa5++; }
                case "5º ano B" -> { if (f.media() < 60.0) somaRb5++; }
                case "5º ano C" -> { if (f.media() < 60.0) somaRc5++; }

                default -> System.out.println("Turma não reconhecida: " + f.turma());
            }
        }

        int a1 = 0, b1 = 0, c1 = 0;
        int a2 = 0, b2 = 0, c2 = 0;
        int a3 = 0, b3 = 0, c3 = 0;
        int a4 = 0, b4 = 0, c4 = 0;
        int a5 = 0, b5 = 0, c5 = 0;

        // Conta a quantidade de alunos por turma
        for (FichaAlunos f : alunos) {
            switch (f.turma()) {
                case "1º ano A" -> a1++;
                case "1º ano B" -> b1++;
                case "1º ano C" -> c1++;
                case "2º ano A" -> a2++;
                case "2º ano B" -> b2++;
                case "2º ano C" -> c2++;
                case "3º ano A" -> a3++;
                case "3º ano B" -> b3++;
                case "3º ano C" -> c3++;
                case "4º ano A" -> a4++;
                case "4º ano B" -> b4++;
                case "4º ano C" -> c4++;
                case "5º ano A" -> a5++;
                case "5º ano B" -> b5++;
                case "5º ano C" -> c5++;
                default -> System.out.println("Turma não reconhecida: " + f.turma());
            }
        }
        double mediaRa1 = (double) somaRa1 / a1 * 100;
        double mediaRb1 = (double) somaRb1 / b1 * 100;
        double mediaRc1 = (double) somaRc1 / c1 * 100;

        double mediaRa2 = (double) somaRa2 / a2 * 100;
        double mediaRb2 = (double) somaRb2 / b2 * 100;
        double mediaRc2 = (double) somaRc2 / c2 * 100;

        double mediaRa3 = (double) somaRa3 / a3 * 100;
        double mediaRb3 = (double) somaRb3 / b3 * 100;
        double mediaRc3 = (double) somaRc3 / c3 * 100;

        double mediaRa4 = (double) somaRa4 / a4 * 100;
        double mediaRb4 = (double) somaRb4 / b4 * 100;
        double mediaRc4 = (double) somaRc4 / c4 * 100;

        double mediaRa5 = (double) somaRa5 / a5 * 100;
        double mediaRb5 = (double) somaRb5 / b5 * 100;
        double mediaRc5 = (double) somaRc5 / c5 * 100;

        System.out.println("\nPorcentagem por turma dos alunos Reprovados");

        System.out.printf("Média de reprovados 1º ano A: %.2f%%\n", mediaRa1);
        System.out.printf("Média de reprovados 1º ano B: %.2f%%\n", mediaRb1);
        System.out.printf("Média de reprovados 1º ano C: %.2f%%\n", mediaRc1);

        System.out.printf("Média de reprovados 2º ano A: %.2f%%\n", mediaRa2);
        System.out.printf("Média de reprovados 2º ano B: %.2f%%\n", mediaRb2);
        System.out.printf("Média de reprovados 2º ano C: %.2f%%\n", mediaRc2);

        System.out.printf("Média de reprovados 3º ano A: %.2f%%\n", mediaRa3);
        System.out.printf("Média de reprovados 3º ano B: %.2f%%\n", mediaRb3);
        System.out.printf("Média de reprovados 3º ano C: %.2f%%\n", mediaRc3);

        System.out.printf("Média de reprovados 4º ano A: %.2f%%\n", mediaRa4);
        System.out.printf("Média de reprovados 4º ano B: %.2f%%\n", mediaRb4);
        System.out.printf("Média de reprovados 4º ano C: %.2f%%\n", mediaRc4);

        System.out.printf("Média de reprovados 5º ano A: %.2f%%\n", mediaRa5);
        System.out.printf("Média de reprovados 5º ano B: %.2f%%\n", mediaRb5);
        System.out.printf("Média de reprovados 5º ano C: %.2f%%\n", mediaRc5);
        System.out.println("------------------------------------");
    }

    public void cincoMelhoresDaTurma(){
        double[] maioresTurma = new double[5];

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("1ª série") && f.media() > maioresTurma[0]) {
                maioresTurma[0] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("1ª série") && f.media() > maioresTurma[1] && f.media() != maioresTurma[0]) {
                maioresTurma[1] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("1ª série") && f.media() > maioresTurma[2] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1]) {
                maioresTurma[2] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("1ª série") && f.media() > maioresTurma[3] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2]) {
                maioresTurma[3] = f.media();
            }
        }
        for (FichaAlunos f : alunos) {
            if (f.serie().equals("1ª série") && f.media() > maioresTurma[4] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2] && f.media() != maioresTurma[3]) {
                maioresTurma[4] = f.media();
            }
        }

        System.out.println("Maiores Alunos da primeira série: ");
        for (int i = 0; i < maioresTurma.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + maioresTurma[i]);
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("2ª série") && f.media() > maioresTurma[0]) {
                maioresTurma[0] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("2ª série") && f.media() > maioresTurma[1] && f.media() != maioresTurma[0]) {
                maioresTurma[1] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("2ª série") && f.media() > maioresTurma[2] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1]) {
                maioresTurma[2] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("2ª série") && f.media() > maioresTurma[3] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2]) {
                maioresTurma[3] = f.media();
            }
        }
        for (FichaAlunos f : alunos) {
            if (f.serie().equals("2ª série") && f.media() > maioresTurma[4] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2] && f.media() != maioresTurma[3]) {
                maioresTurma[4] = f.media();
            }
        }

        System.out.println("\nMaiores Alunos da segunda série: ");
        for (int i = 0; i < maioresTurma.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + maioresTurma[i]);
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("3ª série") && f.media() > maioresTurma[0]) {
                maioresTurma[0] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("3ª série") && f.media() > maioresTurma[1] && f.media() != maioresTurma[0]) {
                maioresTurma[1] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("3ª série") && f.media() > maioresTurma[2] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1]) {
                maioresTurma[2] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("3ª série") && f.media() > maioresTurma[3] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2]) {
                maioresTurma[3] = f.media();
            }
        }
        for (FichaAlunos f : alunos) {
            if (f.serie().equals("3ª série") && f.media() > maioresTurma[4] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2] && f.media() != maioresTurma[3]) {
                maioresTurma[4] = f.media();
            }
        }

        System.out.println("\nMaiores Alunos da terceira série: ");
        for (int i = 0; i < maioresTurma.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + maioresTurma[i]);
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("4ª série") && f.media() > maioresTurma[0]) {
                maioresTurma[0] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("4ª série") && f.media() > maioresTurma[1] && f.media() != maioresTurma[0]) {
                maioresTurma[1] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("4ª série") && f.media() > maioresTurma[2] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1]) {
                maioresTurma[2] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("4ª série") && f.media() > maioresTurma[3] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2]) {
                maioresTurma[3] = f.media();
            }
        }
        for (FichaAlunos f : alunos) {
            if (f.serie().equals("4ª série") && f.media() > maioresTurma[4] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2] && f.media() != maioresTurma[3]) {
                maioresTurma[4] = f.media();
            }
        }

        System.out.println("\nMaiores Alunos da quarta série: ");
        for (int i = 0; i < maioresTurma.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + maioresTurma[i]);
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("5ª série") && f.media() > maioresTurma[0]) {
                maioresTurma[0] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("5ª série") && f.media() > maioresTurma[1] && f.media() != maioresTurma[0]) {
                maioresTurma[1] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("5ª série") && f.media() > maioresTurma[2] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1]) {
                maioresTurma[2] = f.media();
            }
        }

        for (FichaAlunos f : alunos) {
            if (f.serie().equals("5ª série") && f.media() > maioresTurma[3] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2]) {
                maioresTurma[3] = f.media();
            }
        }
        for (FichaAlunos f : alunos) {
            if (f.serie().equals("5ª série") && f.media() > maioresTurma[4] && f.media() != maioresTurma[0]
                    && f.media() != maioresTurma[1] && f.media() != maioresTurma[2] && f.media() != maioresTurma[3]) {
                maioresTurma[4] = f.media();
            }
        }

        System.out.println("\nMaiores Alunos da quinta série: ");
        for (int i = 0; i < maioresTurma.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + maioresTurma[i]);
        }

    }
}