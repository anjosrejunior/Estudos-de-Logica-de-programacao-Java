import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
    
        double alturaH = 1.70 , alturaM = 1.70, pesoidealH,pesoidealM;

        System.out.println("Escreva sua altura Homem: ");


        System.out.println("Escreva sua altura Mulher: ");

        pesoidealH = (72.7*alturaH) - 58.0;
        pesoidealM = (61.1*alturaM) - 44.7;

        System.out.println("Peso ideal do Homem: " + pesoidealH);
        System.out.println("Peso ideal da Mulher: " + pesoidealM);
    }
}
