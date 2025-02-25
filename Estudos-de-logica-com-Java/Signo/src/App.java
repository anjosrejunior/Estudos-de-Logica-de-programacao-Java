import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int dia, mes;

        System.out.print("Qual dia você nasceu: ");
        dia = scan.nextInt();
        System.out.print("Qual mês você nasceu: ");
        mes = scan.nextInt();

        boolean Peixes = (mes == 2 && dia >= 20 && dia <= 29) || (mes == 3 && dia >= 1 && dia <= 20); 
        boolean Aquario = (mes == 1 && dia >= 21 && dia <= 31) || (mes == 2 && dia >= 1 && dia <= 19);
        boolean Capricornio = (mes == 12 && dia >= 22 && dia <= 31) || (mes == 1 && dia >= 20 && dia <= 31);
        boolean Aries = (mes == 3 && dia >= 21 && dia <= 31) || (mes == 4 && dia >= 1 && dia <= 20);
        boolean Touro = (mes == 4 && dia >= 21 && dia <= 30) || (mes == 5 && dia >= 1 && dia <= 20);
        boolean Gemeos = (mes == 5 && dia >= 21 && dia <= 31) || (mes == 6 && dia >= 1 && dia <= 20);
        boolean Cancer = (mes == 6 && dia >= 21 && dia <= 30) || (mes == 7 && dia >= 1 && dia <= 22);
        boolean Leao = (mes == 7 && dia >= 23 && dia <= 31) || (mes == 8 && dia >= 1 && dia <= 22);
        boolean Virgem = (mes == 8 && dia >= 23 && dia <= 31) || (mes == 9 && dia >= 1 && dia <= 22);
        boolean Libra = (mes == 9 && dia >= 23 && dia <= 30) || (mes == 10 && dia >= 1 && dia <= 22);
        boolean Escorpiao = (mes == 10 && dia >= 23 && dia <= 31) || (mes == 11 && dia >= 1 && dia <= 21);
        boolean Sagitario = (mes == 11 && dia >= 22 && dia <= 30) || (mes == 12 && dia >= 1 && dia <= 21);
        
        if (Aries) {
            System.out.println("Seu signo é Áries.");
        } else if (Touro) {
            System.out.println("Seu signo é Touro.");
        } else if (Gemeos) {
            System.out.println("Seu signo é Gêmeos.");
        } else if (Cancer) {
            System.out.println("Seu signo é Câncer.");
        } else if (Leao) {
            System.out.println("Seu signo é Leão.");
        } else if (Virgem) {
            System.out.println("Seu signo é Virgem.");
        } else if (Libra) {
            System.out.println("Seu signo é Libra.");
        } else if (Escorpiao) {
            System.out.println("Seu signo é Escorpião.");
        } else if (Sagitario) {
            System.out.println("Seu signo é Sagitário.");
        } else if (Capricornio) {
            System.out.println("Seu signo é Capricórnio.");
        } else if (Aquario) {
            System.out.println("Seu signo é Aquário.");
        } else if (Peixes) {
            System.out.println("Seu signo é Peixes.");
        } else {
            System.out.println("Signo não encontrado.");
        }

        scan.close();
    }
}
