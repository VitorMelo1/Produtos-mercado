

public class Produtos {
    String nomeProduto;
    String tipoProduto;
    double precoProduto;
    double quantidadeProduto;
    double litrosProduto;
    // Construtor da classe Produtos
    public Produtos(String nomeProduto, String tipoProduto, double precoProduto,int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    // Método para imprimir os dados do produto
    public void imprimir() {
        System.out.println("************************************");
        System.out.println("Produto Cadastrado com sucesso!");
        System.out.println("Nome do produto:" + nomeProduto);
        System.out.println("Tipo do produto:" + tipoProduto);
        System.out.println("Preço do produto:" + precoProduto);
        System.out.println("Quantidade desse mesmo produto: " + quantidadeProduto);
    }

}
