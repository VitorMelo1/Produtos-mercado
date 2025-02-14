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
            String tipoProduto = tipo.toUpperCase();
            double preco = inputsUser.PrecoProduto();


            boolean liquido = tipoProduto.equals("LIQUIDO");
            double litrosProdutos;

            if (liquido) {
                litrosProdutos = Double.parseDouble(inputsUser.LitrosProduto());
            } else {
                litrosProdutos = Double.parseDouble(inputsUser.KilosProduto());
            }

            Produtos produto;
            if (liquido) {
                produto = new Liquidos(nome, tipo, preco, (int) litrosProdutos);
            } else {
                produto = new Kilos(nome, tipo, preco, (int) litrosProdutos);
            }

            listaProdutos.add(produto); 
        }


        System.out.println("\n===== Lista de Produtos Cadastrados =====");
        for (Produtos p : listaProdutos) {
            p.imprimir();
        }
    }
}
