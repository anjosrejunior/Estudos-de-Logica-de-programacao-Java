import java.util.Random;
import java.util.Scanner;

public class Ferramentas {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    private String obraEscolhida;
    private String editoraEscolhida;

    FichaLivro[] vet1 = new FichaLivro[20];
    FichaLivro[] vet2 = new FichaLivro[20];
    FichaLivro[] vet3 = new FichaLivro[20];

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

    public void buscarEPrintarLivroPorAreaENome(int area, String nome) {
        if (area == 1) {
            for (FichaLivro livro : vet1) {
                if (livro != null && livro.nomeDaObra().equals(nome)) {
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
        }
        if (area == 2) {
            for (FichaLivro livro : vet2) {
                if (livro != null && livro.nomeDaObra().equals(nome)) {
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
        }
        if (area == 3) {
            for (FichaLivro livro : vet3) {
                if (livro != null && livro.nomeDaObra().equals(nome)) {
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
        }
        System.out.println("Livro não encontrado.");
    }
    public void livrosDoados(int area){
        if (area == 1) {
            for (FichaLivro livro : vet1) {
                if (livro != null && livro.doado() == true) {
                    System.out.println("\nLivro encontrado!");
                    System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                    System.out.println("Doado: " + livro.doado());
                    System.out.println("Nome da Obra: " + livro.nomeDaObra());
                }
            }
        } else if (area == 2) {
            for (FichaLivro livro : vet2) {
                if (livro != null && livro.doado() == true) {
                    System.out.println("\nLivro encontrado!");
                    System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                    System.out.println("Doado: " + livro.doado());
                    System.out.println("Nome da Obra: " + livro.nomeDaObra());
                }
            }
        } else if (area == 3) {
            for (FichaLivro livro : vet3) {
                if (livro != null && livro.doado() == true) {
                    System.out.println("\nLivro encontrado!");
                    System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                    System.out.println("Doado: " + livro.doado());
                    System.out.println("Nome da Obra: " + livro.nomeDaObra());
                }
            }
        }
    }
    public void livrosCompradosEntreCemETrezentasPag(int area){
        if (area == 1) {
            for (FichaLivro livro : vet1) {
                if (livro != null && livro.doado() == true && livro.numeroDePaginas() >= 100 && livro.numeroDePaginas() <= 300) {
                    System.out.println("\nLivro encontrado!");
                    System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                    System.out.println("Doado: " + livro.doado());
                    System.out.println("Nome da Obra: " + livro.nomeDaObra());
                }
            }
        } else if (area == 2) {
            for (FichaLivro livro : vet2) {
                if (livro != null && livro.doado() == true && livro.numeroDePaginas() >= 100 && livro.numeroDePaginas() <= 300) {
                    System.out.println("\nLivro encontrado!");
                    System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                    System.out.println("Doado: " + livro.doado());
                    System.out.println("Nome da Obra: " + livro.nomeDaObra());
                    System.out.println("Número de Páginas: " + livro.numeroDePaginas());
                }
            }
        } else if (area == 3) {
            for (FichaLivro livro : vet3) {
                if (livro != null && livro.doado() == true && livro.numeroDePaginas() >= 100 && livro.numeroDePaginas() <= 300) {
                    System.out.println("\nLivro encontrado!");
                    System.out.println("Código de Catalogação: " + livro.codigoDeCatalogacao());
                    System.out.println("Doado: " + livro.doado());
                    System.out.println("Nome da Obra: " + livro.nomeDaObra());
                    System.out.println("Número de Páginas: " + livro.numeroDePaginas());
                }
            }
        }
    }
    public void buscarEAlterarFicha(int codigo){
        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] != null && vet1[i].codigoDeCatalogacao() == codigo) {
                System.out.println("\nLivro encontrado na Área 1!");
                System.out.println("Código de Catalogação: " + vet1[i].codigoDeCatalogacao());

                System.out.print("Edite o status de Doado (true/false): ");
                boolean novoDoado = scan.nextBoolean();
                scan.nextLine(); // Consumir a quebra de linha

                System.out.print("Edite o Nome da Obra: ");
                String novoNome = scan.nextLine();

                System.out.print("Edite o Nome do Autor: ");
                String novoAutor = scan.nextLine();

                System.out.print("Edite a Editora: ");
                String novaEditora = scan.nextLine();

                System.out.print("Edite o Número de Páginas: ");
                int novoNumeroPaginas = scan.nextInt();

                // Atualizando o livro no vetor vet1
                vet1[i] = new FichaLivro(
                        vet1[i].codigoDeCatalogacao(),
                        novoDoado,
                        novoNome,
                        novoAutor,
                        novaEditora,
                        novoNumeroPaginas
                );

                System.out.println("\nLivro atualizado com sucesso na Área 1:");
                System.out.println(vet1[i]);
            }
        }

        for (int i = 0; i < vet2.length; i++) {
            if (vet2[i] != null && vet2[i].codigoDeCatalogacao() == codigo) {
                System.out.println("\nLivro encontrado na Área 2!");
                System.out.println("Código de Catalogação: " + vet2[i].codigoDeCatalogacao());

                System.out.print("Edite o status de Doado (true/false): ");
                boolean novoDoado = scan.nextBoolean();
                scan.nextLine(); // Consumir a quebra de linha

                System.out.print("Edite o Nome da Obra: ");
                String novoNome = scan.nextLine();

                System.out.print("Edite o Nome do Autor: ");
                String novoAutor = scan.nextLine();

                System.out.print("Edite a Editora: ");
                String novaEditora = scan.nextLine();

                System.out.print("Edite o Número de Páginas: ");
                int novoNumeroPaginas = scan.nextInt();

                // Atualizando o livro no vetor vet2
                vet2[i] = new FichaLivro(
                        vet2[i].codigoDeCatalogacao(),
                        novoDoado,
                        novoNome,
                        novoAutor,
                        novaEditora,
                        novoNumeroPaginas
                );

                System.out.println("\nLivro atualizado com sucesso na Área 2:");
                System.out.println(vet2[i]);
            }
        }

        for (int i = 0; i < vet3.length; i++) {
            if (vet3[i] != null && vet3[i].codigoDeCatalogacao() == codigo) {
                System.out.println("\nLivro encontrado na Área 3!");
                System.out.println("Código de Catalogação: " + vet3[i].codigoDeCatalogacao());

                System.out.print("Edite o status de Doado (true/false): ");
                boolean novoDoado = scan.nextBoolean();
                scan.nextLine(); // Consumir a quebra de linha

                System.out.print("Edite o Nome da Obra: ");
                String novoNome = scan.nextLine();

                System.out.print("Edite o Nome do Autor: ");
                String novoAutor = scan.nextLine();

                System.out.print("Edite a Editora: ");
                String novaEditora = scan.nextLine();

                System.out.print("Edite o Número de Páginas: ");
                int novoNumeroPaginas = scan.nextInt();

                // Atualizando o livro no vetor vet3
                vet3[i] = new FichaLivro(
                        vet3[i].codigoDeCatalogacao(),
                        novoDoado,
                        novoNome,
                        novoAutor,
                        novaEditora,
                        novoNumeroPaginas
                );

                System.out.println("\nLivro atualizado com sucesso na Área 3:");
                System.out.println(vet3[i]);
            }
        }
    }
    public void removerLivro(int codigo){
        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] != null && vet1[i].codigoDeCatalogacao() == codigo) {
                vet1[i] = null;
                System.out.println("Livro removido com sucesso da Área 1!");
                break; // Sai do loop após encontrar e excluir o livro
            }
        }
    }
}
