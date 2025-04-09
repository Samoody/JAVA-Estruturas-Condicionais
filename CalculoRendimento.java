/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que calcula o rendimento de um depósito ao longo de três meses,
 * considerando uma taxa de juros mensal fornecida pelo usuário.
 */

import java.util.Scanner;

public class CalculoRendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o valor do depósito: R$ ");
        double deposito = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJuros = scanner.nextDouble() / 100; // Convertendo para decimal
        
        // Cálculo do rendimento para cada mês
        for (int mes = 1; mes <= 3; mes++) {
            double rendimento = deposito * taxaJuros;
            deposito += rendimento;
            
            // Exibição dos resultados
            System.out.printf("\nApós %d mês(es):\n", mes);
            System.out.printf("Rendimento: R$ %.2f\n", rendimento);
            System.out.printf("Valor total: R$ %.2f\n", deposito);
        }
        
        scanner.close();
    }
}
