

public class Produtos {
    String nomeProduto;
    String tipoProduto;
    double precoProduto;
    double quantidadeProduto;
    double litrosProduto;

    public Produtos(String nomeProduto, String tipoProduto, double precoProduto,int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }


    public void imprimir() {
        System.out.println("************************************");
        System.out.println("Produto Cadastrado com sucesso!");
        System.out.println("Nome do produto:" + nomeProduto);
        System.out.println("Tipo do produto:" + tipoProduto);
        System.out.println("Preço do produto:" + precoProduto);
        System.out.println("Quantidade desse mesmo produto: " + quantidadeProduto);
    }

}
