import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int diaNascimento,mesNascimento,anoNascimento;
        int diaAtual = 23, mesAtual = 2, anoAtual = 2025;
        int dias = 0, meses = 0, anos = 0;

        
        System.out.print("Dia de nascimento: ");
        diaNascimento = scan.nextInt();
        
        System.out.print("Mes de nascimento: ");
        mesNascimento = scan.nextInt();
        
        System.out.print("Ano de nascimento: ");
        anoNascimento = scan.nextInt();

        //Calculadora de anos
        if (mesAtual == mesNascimento && diaAtual >= diaNascimento) {
            anos = anoAtual - anoNascimento;
        }
        else {
            anos = (anoAtual - anoNascimento) - 1;
        }

        //Calculadora de meses
        meses = anos*12 + (12 - mesNascimento) + mesAtual;

        int contador = anoNascimento;
        //Calculadora de dias
        int[] contAnos = new int[anoAtual];
        for (int i = (anoNascimento - 2000); i <= (anoAtual-2000); i++) {
            contAnos[i] = contador;
            contador += 1;
        }
        // Bascsicamente os dias são colocados dentro de um array para serem verificados um a um, se são ou não bissextos
        int ano = 0;
        boolean bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
        for (int i = (anoNascimento-2000); i <= (anoAtual - 2000); i++) {
            ano = contAnos[i];
            if (bissexto == false) {
                dias = dias + 365;
            }
            else {
                dias = dias + 366;
            }
        }

        System.out.println("Você está vivo á " + anos + " anos ou " + meses + " mêses ou " + dias + " dias");
        
        scan.close();
    }
}
