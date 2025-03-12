import java.util.Random;

public class Ferramentas {
    Random random = new Random();
    private String obraEscolhida;
    private String editoraEscolhida;

    FichaLivro[] vet1 = new FichaLivro[500];
    FichaLivro[] vet2 = new FichaLivro[500];
    FichaLivro[] vet3 = new FichaLivro[500];

    public boolean doado(){
        return random.nextBoolean();
    }

    public String nomeDaObra() {
        String[] obras = {"Ciências Exatas", "Ciências Humanas", "Ciências Biomédicas"};
        obraEscolhida = obras[random.nextInt(obras.length)];
        return obraEscolhida;
    }

    public String nomeDoAutor() {
        if (obraEscolhida == null) {
            nomeDaObra(); // Gera a obra se ainda não foi gerada
        }
        if (obraEscolhida.equals("Ciências Exatas")) {
            return "Ebinhaus";
        } else if (obraEscolhida.equals("Ciências Humanas")) {
            return "Foucault";
        } else {
            return "Pasteur";
        }
    }

    public String editora(){
        String[] editoras = {"Nova Livros", "Livros Maneiros", "Livros Bonitos"};
        editoraEscolhida = editoras[random.nextInt(editoras.length)];
        return editoraEscolhida;
    }

    public int numeroDePaginas(){
        return random.nextInt(150,1000+1);
    }

    public void preencherVetores(){
        int codigo = 0;
        // Preenchendo o primeiro vetor (vet1)
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = new FichaLivro(
                    codigo, doado(), nomeDaObra(), nomeDoAutor(), editora(), numeroDePaginas()
            );
            codigo++;
        }

        // Preenchendo o segundo vetor (vet2)
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = new FichaLivro(
                    codigo, doado(), nomeDaObra(), nomeDoAutor(), editora(), numeroDePaginas()
            );
            codigo++;
        }

        // Preenchendo o terceiro vetor (vet3)
        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = new FichaLivro(
                    codigo, doado(), nomeDaObra(), nomeDoAutor(), editora(), numeroDePaginas()
            );
            codigo++;
        }
    }

    public void buscarEPrintarLivroPorCodigo(int codigo) {

        for (FichaLivro livro : vet1) {
            if (livro != null && livro.codigoDeCatalogacao() == codigo) {
                System.out.println("\nLivro encontrado!");
                System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                System.out.println("Doado: " + livro.doado());
                System.out.println("Nome da Obra: " + livro.nomeDaObra());
                System.out.println("Nome do Autor: " + livro.nomeDoAutor());
                System.out.println("Editora: " + livro.editora());
                System.out.println("Número de Páginas: " + livro.numeroDePaginas());
                return;
            }
        }
        for (FichaLivro livro : vet2) {
            if (livro != null && livro.codigoDeCatalogacao() == codigo) {
                System.out.println("\nLivro encontrado!");
                System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                System.out.println("Doado: " + livro.doado());
                System.out.println("Nome da Obra: " + livro.nomeDaObra());
                System.out.println("Nome do Autor: " + livro.nomeDoAutor());
                System.out.println("Editora: " + livro.editora());
                System.out.println("Número de Páginas: " + livro.numeroDePaginas());
                return;
            }
        }
        for (FichaLivro livro : vet3) {
            if (livro != null && livro.codigoDeCatalogacao() == codigo) {
                System.out.println("\nLivro encontrado!");
                System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                System.out.println("Doado: " + livro.doado());
                System.out.println("Nome da Obra: " + livro.nomeDaObra());
                System.out.println("Nome do Autor: " + livro.nomeDoAutor());
                System.out.println("Editora: " + livro.editora());
                System.out.println("Número de Páginas: " + livro.numeroDePaginas());
                return;
            }
        }
        System.out.println("Livro com código " + codigo + " não encontrado.");
    }
}
