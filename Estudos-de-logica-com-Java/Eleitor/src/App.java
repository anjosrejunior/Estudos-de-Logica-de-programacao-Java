import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("----- Testador de estado eleitoral -----");
        System.out.print("Diga sua Idade: ");
        idade = scan.nextInt();

        boolean naoVotante = (idade < 16);
        boolean eleitorObrigatorio = (idade >= 18 && idade <= 65);
        boolean eleitorFacultativo = ((idade >= 16 && idade <= 17) || idade > 65);

        if (naoVotante) {
           System.out.println("Você é um eleitor não votante!"); 
        }
        else if (eleitorObrigatorio) {
            System.out.println("Você é um eleitor obrigatório!");
        }
        else if (eleitorFacultativo) {
            System.out.println("Você é um eleitor facultativo!");
        }

        scan.close();
    }
}
