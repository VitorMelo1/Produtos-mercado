import java.util.Locale;
import java.util.Scanner;

public class InputsUser {
    private Scanner scanner;

    public InputsUser() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }

    // Obter a quantidade de produtos
    public int obterQuantidade() {
        System.out.print(
                "Seja bem-vindo à parte de cadastramento de produtos no seu mercado\nQuantos produtos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        return quantidade;
    }

    // Obter os dados do produto
    public String NomeProduto() {
        System.out.print("\nDigite o nome do produto: ");
        return scanner.nextLine();
    }

    // Obter o preço do produto
    public double PrecoProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        return scanner.nextDouble();
    }

    // Obter o tipo do produto
    public String TipoProduto() {
        System.out.print("\nDigite o tipo do produto (ex: Líquido, Grão, Outro): ");
        return scanner.nextLine();
    }

    // Obter a quantidade de litros
    public String LitrosProduto() {
        System.out.print("\nDigite a quantidade de litros: ");
        return scanner.nextLine();
    }

    // Obter a quantidade de quilos
    public String KilosProduto() {
        System.out.print("\nDigite a quantidade de quilos: ");
        return scanner.nextLine();
    }
}