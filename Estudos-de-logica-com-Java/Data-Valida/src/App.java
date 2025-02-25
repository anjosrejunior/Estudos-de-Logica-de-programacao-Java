import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int dia = 0, mes = 0, ano = 0;

        System.out.print("Diga o dia: ");
        dia = scan.nextInt();
        System.out.print("Diga o mes: ");
        mes = scan.nextInt();
        System.out.print("Diga o ano: ");
        ano = scan.nextInt();

        boolean anoValido = (ano >= 1 || ano <= 2025);// Verifica se o ano é valido
        boolean mesValido = (mes >= 1 || mes <= 12); // Verifica se o mes e valido
        boolean diaValido30 = (dia >= 1 && dia <= 30); // Verifica se o dia esta entre 1 e 30
        boolean mesValido30 = (mes == 4 || mes == 6 || mes == 9 || mes == 11); // Meses com dia 30 = Abril, Junho, Setembro, Novembro
        boolean mesValido31 = (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12); // Meses com dia 31 = Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro
        boolean diaValido31 = (dia >= 1 && dia <= 31); // Verifica se o dia esta entre 1 e 31
        boolean mesFevValido = (mes == 2); // Verifica se o mes e fevereiro
        boolean diaValidofev = (dia >= 1 && dia <= 28); // Verifica se o dia esta entre 1 e 28
        boolean bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0); // Verifica se o ano e bissexto
        boolean diaValidoFevBi = (dia >= 1 && dia <= 29);// Verifica se o dia esta entre 1 e 29

        if (anoValido) {
            System.out.println("O Ano é válido");

            if (mesValido) {
                System.out.println("O Mes é valido");

                if (diaValido30 && mesValido30) {
                    System.out.println("Hoje pode ser dia 30");  
                }
                else if (diaValido31 && mesValido31) {
                    System.out.println("Hoje pode ser dia 31");
                }
                else  if (mesFevValido && diaValidofev) {
                    System.out.println("Sim hoje pode ser fevereiro ate o dia 28");
                }
                else if (mesFevValido && bissexto && diaValidoFevBi) {
                    System.out.println("Hoje é fevereiro em um ano bissexto");
                }

            } else {
                System.out.println("Mes inválido portanto data inválida");
            }
        } else {
            System.out.println("Ano inválido portanto data inválida");
        }
        
        scan.close();
    }
}
