import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int produto, codigo;
        double preco = 0, precofinal = 0;

        System.out.println("----------------Qual o produto que você comprar?----------------");
        
        System.out.println("1 Batata = $ 2,30");
        System.out.println("2 Cenoura = $ 3,20");
        System.out.println("3 Gengibre = $ 10,00");


        System.out.print("Escreva Agora o código do produto = ");
        produto = scan.nextInt();

        if (produto == 1) {
            preco = 2.30;
        }
        else if (produto == 2){
            preco = 3.20;
        }
        else if (produto == 3) {
            preco = 10.00;
        }

        System.out.println("--------------------Qual o método de pagamento--------------------");

        System.out.println("1 A vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2 A vista no cartão de crédito, recebe 5% de desconto");
        System.out.println("3 Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4 Em três vezes, preço normal de etiqueta mais juros de 10%");
        
        System.out.print("Escreva Agora o código do pagamento = ");
        codigo = scan.nextInt();

        switch (codigo) {
            case 1:
                precofinal = preco - (0.10*preco);
                break;
        
            case 2: 
                precofinal = preco - (0.5*preco);
                break;

            case 3: 

                break;

            case 4: 
                precofinal = preco + (0.10*preco);
                break;

            default:
                break;
        }
        System.out.println("Preco final = " + precofinal);

        scan.close();
    }
}
