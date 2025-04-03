import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        // *********************************************************
        // Nome: SAMUEL KLEBER VIEIRA SILVA
        // RA: 12123150
        // Data: 03/04/2025
        // *********************************************************

        // Inicializando o Scanner para ler a entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        double salario, salarioReajustado;

        // Solicitar o salário
        System.out.print("Digite o salário: R$ ");
        salario = scanner.nextDouble();

        // Calcular o reajuste com base nas condições fornecidas
        if (salario < 500) {
            salarioReajustado = salario + (salario * 0.15);  // 15% de reajuste
        } else if (salario >= 500 && salario <= 1000) {
            salarioReajustado = salario + (salario * 0.10);  // 10% de reajuste
        } else {
            salarioReajustado = salario + (salario * 0.05);  // 5% de reajuste
        }

        // Exibir o salário reajustado
        System.out.println("Salário reajustado: R$ " + salarioReajustado);

        scanner.close();
    }
}
