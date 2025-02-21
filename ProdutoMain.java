import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {
        InputsUser inputsUser = new InputsUser();
        int produtosPraCadastrar = inputsUser.obterQuantidade();

        ArrayList<Produtos> listaProdutos = new ArrayList<>(); // Criando o array para armazenar produtos

        for (int i = 0; i < produtosPraCadastrar; i++) {
            System.out.println("\n Cadastro do Produto " + (i + 1));

            String nome = inputsUser.NomeProduto();
            String tipo = inputsUser.TipoProduto();
            double preco = inputsUser.PrecoProduto();
            boolean liquido = tipo.equalsIgnoreCase("LIQUIDO");

            double quantidadeProdutos;
            if (liquido) {
                quantidadeProdutos = Double.parseDouble(inputsUser.LitrosProduto());
            } else {
                quantidadeProdutos = Double.parseDouble(inputsUser.KilosProduto());
            }

            Produtos produto;
            if (liquido) {
                produto = new Liquidos(nome, tipo, preco, quantidadeProdutos);
            } else {
                produto = new Kilos(nome, tipo, preco, quantidadeProdutos);
            }

            listaProdutos.add(produto); // Adicionando à lista
        }

        // Exibir todos os produtos cadastrados no final
        System.out.println("\n===== Lista de Produtos Cadastrados =====");
        for (Produtos p : listaProdutos) {
            p.imprimir();
        }
    }
}
