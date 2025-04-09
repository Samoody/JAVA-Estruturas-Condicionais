/**
 * Autor: SAMUEL KLEBER VIEIRA SILVA
 * RA: 12123150
 * Data: 04/04/2025
 * 
 * Programa que calcula o Índice de Massa Corporal (IMC) de um paciente
 * e exibe sua faixa de risco conforme a tabela de referência.
 */

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o peso do paciente (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura do paciente (m): ");
        double altura = scanner.nextDouble();
        
        // Cálculo do IMC
        double imc = peso / (altura * altura);
        
        // Determinação da faixa de risco
        String faixaRisco;
        if (imc < 20) {
            faixaRisco = "Abaixo do peso";
        } else if (imc < 25) {
            faixaRisco = "Normal";
        } else if (imc < 30) {
            faixaRisco = "Excesso de peso";
        } else if (imc < 35) {
            faixaRisco = "Obesidade";
        } else {
            faixaRisco = "Obesidade mórbida";
        }
        
        // Exibição dos resultados
        System.out.printf("\nPaciente: %s\n", nome);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.printf("Faixa de risco: %s\n", faixaRisco);
        
        scanner.close();
    }
}
