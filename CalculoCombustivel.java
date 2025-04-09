/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que calcula o valor a ser pago por um cliente ao abastecer
 * no posto de combustíveis, considerando descontos por tipo e quantidade.
 */

import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definição dos preços por litro
        final double PRECO_GASOLINA = 6.40;
        final double PRECO_ALCOOL = 4.60;
        
        // Entrada de dados
        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();
        
        double precoLitro, desconto;
        
        // Determinação do preço e desconto
        if (tipoCombustivel == 'A') {
            precoLitro = PRECO_ALCOOL;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipoCombustivel == 'G') {
            precoLitro = PRECO_GASOLINA;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }
        
        // Cálculo do valor final
        double valorBruto = litros * precoLitro;
        double valorDesconto = valorBruto * desconto;
        double valorFinal = valorBruto - valorDesconto;
        
        // Exibição dos resultados
        System.out.printf("\nValor sem desconto: R$ %.2f\n", valorBruto);
        System.out.printf("Desconto aplicado: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);
        
        scanner.close();
    }
}
