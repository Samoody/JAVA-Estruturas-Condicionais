import java.util.Scanner;

public class CalculadoraNota {
    public static void main(String[] args) {
        // *********************************************************
        // Nome: SAMUEL KLEBER VIEIRA SILVA
        // RA: 12123150
        // Data: 03/04/2025
        // *********************************************************

        // Inicializando o Scanner para ler a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar o código do produto e a quantidade comprada
        System.out.print("Digite o código do produto (1 a 30): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        // Declaração de variáveis
        double precoUnitario = 0.0;
        double precoTotal = 0.0;
        double desconto = 0.0;
        double precoFinal = 0.0;

        // Determinar o preço unitário com base no código do produto
        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.0;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.0;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.0;
        } else {
            System.out.println("Código de produto inválido. Código deve ser entre 1 e 30.");
            return;
        }

        // Calcular o preço total da nota
        precoTotal = precoUnitario * quantidade;

        // Determinar o valor do desconto com base no preço total
        if (precoTotal <= 250) {
            desconto = 0.05 * precoTotal;  // 5% de desconto
        } else if (precoTotal > 250 && precoTotal <= 500) {
            desconto = 0.10 * precoTotal;  // 10% de desconto
        } else if (precoTotal > 500) {
            desconto = 0.15 * precoTotal;  // 15% de desconto
        }

        // Calcular o preço final após o desconto
        precoFinal = precoTotal - desconto;

        // Exibir os resultados
        System.out.println("Preço unitário do produto: R$ " + precoUnitario);
        System.out.println("Preço total da nota: R$ " + precoTotal);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Preço final da nota após o desconto: R$ " + precoFinal);

        scanner.close();
    }
}
