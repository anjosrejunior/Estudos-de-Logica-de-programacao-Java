import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int codigo = 1, funcionarios = 0, porte = 0;
    
        int MP = 0, // Auxiliar da variável maiorPequeno, que guarda o valor de funcionarios da maior Pequena empresa
        CP = 0, // Auxiliar que guarda o código da maior empresa de pequeno porte
        MM = 0, // Auxiliar da variável maiorMedio, que guarda o valor de funcionarios da maior Media empresa
        CM = 0, // Auxiliar que guarda o código da maior empresa de medio porte
        MG = 0, // Auxiliar da variável maiorGrande, que guarda o valor de funcionarios da maior Grande empresa
        CG = 0; // Auxiliar que guarda o código da maior empresa de Grande porte

        System.out.println("---- Lista de empresas ----");

        while (codigo != 0) {
            System.out.println();
            System.out.print("Qual o código da empresa? ");
            codigo = scan.nextInt();

            if (codigo == 0) {
                break; // Sai do loop se o código for 0
            }

            System.out.print("Qual o número de funcionários da empresa? ");
            funcionarios = scan.nextInt();

            System.out.println("1 - Pequeno / 2 - Medio / 3 - Grande ");
            System.out.print("Qual o porte da empresa? ");
            porte = scan.nextInt();

            // As variáveis booleanas são recalculadas aqui, dentro do loop
            boolean maiorPequeno = (porte == 1 && funcionarios > MP);
            boolean maiorMedio = (porte == 2 && funcionarios > MM);
            boolean maiorGrande = (porte == 3 && funcionarios > MG);

            if (maiorPequeno) {
                CP = codigo;
                MP = funcionarios;
            } else if (maiorMedio) {
                CM = codigo;
                MM = funcionarios;
            } else if (maiorGrande) {
                CG = codigo;
                MG = funcionarios;
            }
        }

        System.out.println("A maior empresa de pequeno porte é portadora do código: " + CP + " ,possuindo " + MP + " funcionários no total." );
        System.out.println();
        System.out.println("A maior empresa de medio porte é portadora do código: " + CM + " ,possuindo " + MM + " funcionários no total." );
        System.out.println();
        System.out.println("A maior empresa de grande porte é portadora do código: " + CG + " ,possuindo " + MG + " funcionários no total." );

        scan.close();
    }
}
