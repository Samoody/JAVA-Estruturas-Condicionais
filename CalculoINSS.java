/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que calcula o desconto do INSS baseado no salário informado pelo usuário,
 * seguindo a tabela de alíquotas vigente.
 */

import java.util.Scanner;

public class CalculoINSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();
        
        // Definição do teto do INSS
        double tetoINSS = 6433.57;
        if (salario > tetoINSS) {
            salario = tetoINSS;
        }
        
        // Cálculo do desconto conforme a tabela
        double desconto;
        if (salario <= 1100) {
            desconto = salario * 0.075;
        } else if (salario <= 2203.48) {
            desconto = salario * 0.09;
        } else if (salario <= 3305.22) {
            desconto = salario * 0.12;
        } else {
            desconto = salario * 0.14;
        }
        
        // Exibição dos resultados
        System.out.printf("\nSalário informado: R$ %.2f\n", salario);
        System.out.printf("Desconto do INSS: R$ %.2f\n", desconto);
        
        scanner.close();
    }
}
