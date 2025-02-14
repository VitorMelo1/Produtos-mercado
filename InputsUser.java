import java.util.Scanner;

public class InputsUser {
    private Scanner scanner;

    public InputsUser() {
        scanner = new Scanner(System.in);
    }

    public int obterQuantidade() {
        System.out.print("Seja bem-vindo à parte de cadastramento de produtos no seu mercado\nQuantos produtos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // ✅ Consumir a quebra de linha pendente
        return quantidade;
    }

    public String NomeProduto() {
        System.out.print("\nDigite o nome do produto: ");
        return scanner.nextLine(); // ✅ Agora lê corretamente o nome
    }

    public double PrecoProduto() {
        System.out.print("\nDigite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 
        return preco;
    }

    public String TipoProduto() {
        System.out.print("\nDigite o tipo do produto (ex: Líquido, Grão, Outro): ");
        return scanner.nextLine(); 
    }

    public int quantidadeProdutos() {
        System.out.print("\nDigite a quantidade de produtos: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        return quantidade;
    }

    public String LitrosProduto() {
        System.out.print("\nDigite a quantidade de litros: ");
        return scanner.nextLine(); 
    }

    public String KilosProduto() {
        System.out.print("\nDigite a quantidade de quilos: ");
        return scanner.nextLine(); 
    }
}
