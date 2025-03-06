import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        int moradores = 10, // Quantidade de moradores do prédio
        usoA = 0, // Variável que guarda a quantidade de uso do elevador A
        usoB = 0, // Variável que guarda a quantidade de uso do elevador B
        usoC = 0, // Variável que guarda a quantidade de uso do elevador C
        maisPeriodoM = 0, // Quantidade de periodos M do mais usado
        maisPeriodoV = 0, // Quantidade de periodos V do mais usado
        maisPeriodoN = 0, // Quantidade de periodos N do mais usado
        usoM = 0, // O uso total durante o período Matutino
        usoV = 0, // O uso total durante o período vespertino
        usoN = 0, // O uso total durante o período noturno
        elevMaisUsadoPA = 0, // Uso total do elevador A dentro do periodo mais usado
        elevMaisUsadoPB = 0, // Uso total do elevador B dentro do periodo mais usado
        elevMaisUsadoPC = 0, // Uso total do elevador C dentro do periodo mais usado
        periodoMaisUsadoCont = 0, // Periodo mais usado a conta do numero total de periodos
        periodoMenosUsadoCont = 0, // Periodo menos usado a conta do numero total de periodos
        usosMedio = 0;

        double percentMaisUsado, // A porcentagem representante do período mais usado
        percentMenosUsado, // A porcentagem representante do período menos usado
        difPerMaisMenosPer, // A diferença de porcentagem entre o período mais e menos usado
        percentMedio; // Porcentagem de uso do elevador de médio uso
        
        String[] elevador = new String[moradores];
        String[] periodo = new String[moradores];

        String maisUsado, // Elevador mais usado
        maiorPeriodoME, // Maior período de uso do maior elvador
        periodoMaisUsado, // Periodo mais usado do elevador
        elevMaisUsadop; // Elavador mais usado do periodo mais usado

        for (int i = 0; i < moradores; i++) {
            System.out.print("Qual elevador você utiliza com mais frequência? ");
            elevador[i] = scan.nextLine();

            System.out.print("Em que período você mais utiliza este elevador? ");
            periodo[i] = scan.nextLine();

            // Contador de uso por elevador
            if (elevador[i].equals("A")) {
                usoA += 1;
            }
            else if (elevador[i].equals("B")) {
                usoB += 1;
            }
            else if (elevador[i].equals("C")) {
                usoC += 1;
            }

            // Contador de usos por período
            if (periodo[i].equals("M")) {
                usoM += 1; 
            }
            else if (periodo[i].equals("V")) {
                usoV += 1;
            }
            else if (periodo[i].equals("N")) {
                usoN += 1;
            }

            System.out.println();
        }

        // Parte 1 Qual é o elevador mais freqüentado e em que período se concentra o maior fluxo;

        // Qual o elevador mais usado 
        if (usoA > usoB && usoA > usoC) {
            maisUsado = "A";
        }
        else if (usoB > usoC) {
            maisUsado = "B";
        }
        else {
            maisUsado = "C";
        }

        /* O periodo mais usado do elevador mais usado. Aqui é feita a conta de 
        quantas vezes as pessoas usam o elevador mais usado em casa período
        */
        for (int i = 0; i < moradores; i++) {
            boolean maisUsadonoPeriodo = (elevador[i].equals(maisUsado));
            if (maisUsadonoPeriodo) {
                if (periodo[i].equals("M")) {
                    maisPeriodoM += 1;
                }
                else if (periodo[i].equals("V")) {
                    maisPeriodoV += 1;
                }
                else if (periodo[i].equals("N")) {
                    maisPeriodoN += 1;
                }
            }
        }

        /* O periodo mais usado do elevador mais usado. 
        Aqui é decidido através de quem é mais usado convertendo para String
        */
        if (maisPeriodoM > maisPeriodoN && maisPeriodoM > maisPeriodoV) {
            maiorPeriodoME = "M";
        }
        else if (maisPeriodoN > maisPeriodoV) {
            maiorPeriodoME = "V";
        }
        else {
            maiorPeriodoME = "N";
        }

        // Parte 1 Qual é o elevador mais frequentado e em que período se concentra o maior fluxo;

        // Parte 2 ---------------------------------------

        // Qual o periodo mais usado de todos
        if (usoM > usoV && usoM > usoN) {
            periodoMaisUsado = "M";
        }
        else if (usoV > usoN) {
            periodoMaisUsado = "V";
        }
        else {
            periodoMaisUsado = "N";
        }

        // O elevador mais usado e qual periodo ele é mais usado
        for (int i = 0; i < moradores; i++) {
            boolean maiorPeriododoElevador = (periodo[i].equals(periodoMaisUsado));
            if (maiorPeriododoElevador) {
                if (elevador[i].equals("A")) {
                    elevMaisUsadoPA += 1;
                }
                else if (elevador[i].equals("B")) {
                    elevMaisUsadoPB += 1;
                }
                else if (elevador[i].equals("C")) {
                    elevMaisUsadoPC += 1;
                }
            }
        }

        // Qual o elevador mais usado de do periodo mais usado
        if (elevMaisUsadoPA > elevMaisUsadoPB && elevMaisUsadoPA > elevMaisUsadoPC) {
            elevMaisUsadop = "A";
        }
        else if (elevMaisUsadoPB > elevMaisUsadoPC) {
            elevMaisUsadop = "B";
        }
        else {
            elevMaisUsadop = "C";
        }

        // Parte 2 ---------------------------------------

        // Parte 3 ---------------------------------------

        if (usoM > usoN && usoN > usoV) {
            periodoMaisUsadoCont = usoM;
        }
        else if (usoN > usoV) {
            periodoMaisUsadoCont = usoN;
        }
        else {
            periodoMaisUsadoCont = usoV;
        }

        if (usoM < usoN && usoN < usoV) {
            periodoMenosUsadoCont = usoM;
        }
        else if (usoN < usoV) {
            periodoMenosUsadoCont = usoN;
        }
        else {
            periodoMenosUsadoCont = usoV;
        }

        percentMaisUsado = ((double)periodoMaisUsadoCont/(usoM+usoN+usoV)) * 100.0;
        percentMenosUsado = ((double)periodoMenosUsadoCont/(usoM+usoN+usoV)) * 100.0;
        difPerMaisMenosPer = Math.abs(percentMaisUsado - percentMenosUsado);

        // Parte 3 ---------------------------------------

        // Parte 4 ---------------------------------------

        // Determina o elevador médio por comparação direta
        if ((usoA > usoB && usoA < usoC) || (usoA < usoB && usoA > usoC)) {
            usosMedio = usoA;
        } else if ((usoB > usoA && usoB < usoC) || (usoB < usoA && usoB > usoC)) {
            usosMedio = usoB;
        } else {
            usosMedio = usoC;
        }

        percentMedio = ((double)usosMedio/(usoA+usoB+usoC)) * 100.0;

        // Parte 4 ---------------------------------------

        System.out.println("O elevador mais frequentado é o: " + maisUsado + ". Sendo o maior periodo de uso o periodo: " + maiorPeriodoME);
        System.out.println("O período mais usado de todos é o: " + periodoMaisUsado + ". O elevador mais usado do periodo mais usado é: " + elevMaisUsadop);
        System.out.println("a diferença percentual entre o período mais usado e menos usado corresponde á: " + df.format(difPerMaisMenosPer) + "%.");
        System.out.println("A porcentagem dos serviços prestados pelo elevador médio é: " + df.format(percentMedio) + "%.");

        scan.close();
    }
}
