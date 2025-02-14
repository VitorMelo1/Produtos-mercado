

public class Produtos {
    String nomeProduto;
    String tipoProduto;
    double precoProduto;

    double litrosProduto;
    // Construtor da classe Produtos
    public Produtos(String nomeProduto, String tipoProduto, double precoProduto,int litrosProduto) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
        this.litrosProduto = litrosProduto;
    }

    // Método para imprimir os dados do produto
    public void imprimir() {
        System.out.println("************************************");
        System.out.println("Produto Cadastrado com sucesso!");
        System.out.println("Nome do produto:" + nomeProduto);
        System.out.println("Tipo do produto:" + tipoProduto);
        System.out.println("Preço do produto:" + precoProduto);

    }

}
