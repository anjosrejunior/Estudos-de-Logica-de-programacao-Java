public class App {
    public static void main(String[] args) throws Exception {
        
        int nascimento = 04, ano = 25, idade = 25;

        idade = ano - nascimento; 

        System.out.println("Essa é sua idade: " + idade);

        if (idade >= 16) {
            System.out.println("Você pode votar");
        }
    }
}
