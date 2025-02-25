import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double tanque = 20, combustivel = 5, abastecer;
        String resposta;

        System.out.println("-------Posto de Gasolina-------");

        System.out.println("Esse foi o seu consumo de hoje = " + (tanque-combustivel));
        System.out.println("Você ainda tem: " + combustivel + " litros de combustivel, cada litro equivale a 10 KM de autonomia");
        System.out.println("Sua autonomia e de " + (combustivel*10) + "KM");
        System.out.println();

        System.out.print("Quer abastecer? Sim/Não: ");
        resposta = scan.nextLine();
        System.out.println();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.print("Quantos Litros = ");
            abastecer = scan.nextDouble();
    
            while (abastecer > (tanque-combustivel)) {
                System.out.println("Nao foi possível abastecer você ainda tem " + combustivel + " litros de combustivel");
                System.out.println("O Maximo que voce pode abastecer e" + (combustivel-tanque));
                abastecer = 0;
                
                System.out.println("Ainda quer abastecer? ");
                scan.nextLine();
                resposta = scan.nextLine();

                if (resposta == "Sim") {
                    System.out.print("Quantos Litros = ");
                    abastecer = scan.nextDouble();
                }
                else {
                    break;
                }
            }
            
            System.out.println("Otimo agora voce tem: " + (abastecer + combustivel) + " Litros no tanque");
        }
        else {
            System.out.println("Ok fica para próxima agradecemos sua visita");
        }

        scan.close();
    }
}
