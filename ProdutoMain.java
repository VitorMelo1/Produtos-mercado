public class ProdutoMain {
    public static void main(String[] args) {
        InputsUser inputsUser = new InputsUser();
        int produtosPraCadastrar = inputsUser.obterQuantidade();

        for (int i = 0; i < produtosPraCadastrar; i++) {
            System.out.println("\n Cadastro do Produto " + (i + 1));


            String nome = inputsUser.NomeProduto();
            String tipo = inputsUser.TipoProduto();
            String tipoProduto = tipo.toUpperCase();
            double preco = inputsUser.PrecoProduto();

            boolean liquido = tipoProduto.equals("LIQUIDO");
            double quantidadeProdutos;


            if (liquido) {
                quantidadeProdutos = Double.parseDouble(inputsUser.LitrosProduto()); 
            } else {
                quantidadeProdutos = Double.parseDouble(inputsUser.KilosProduto()); 
            }
            Produtos produto;
            if (liquido) {
                produto = new Liquidos(nome, tipo, preco, (int) quantidadeProdutos);
            } else {
                produto = new Kilos(nome, tipo, preco, (int) quantidadeProdutos);
            }


            produto.imprimir();
        }
    }
}
