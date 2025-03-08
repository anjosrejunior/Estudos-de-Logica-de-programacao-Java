import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        CadEstoque[] estoque = new CadEstoque[500];

        int codigo = 0;
        int randomBaixa = random.nextInt(500);
        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = new CadEstoque(
                    "sofa",
                    500.00,
                    randomBaixa,
                    codigo
            );
            codigo ++;
        }

        int maiorBaixa = 0;
        int indiceDoProduto = 0;
        for (int i = 0; i < estoque.length; i++) {
            if (maiorBaixa < estoque[i].baixa()) {
                maiorBaixa = estoque[i].baixa();
                indiceDoProduto = i;
            }
        }

        System.out.println("Produto com Maior baixa: " + estoque[indiceDoProduto].nome());
        System.out.println("Número de baixas: " + estoque[indiceDoProduto].baixa());

    }
}
