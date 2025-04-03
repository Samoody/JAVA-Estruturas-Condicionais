import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        // *********************************************************
        // Nome: SAMUEL KLEBER VIEIRA SILVA
        // RA: 12123150
        // Data: 03/04/2025
        // *********************************************************

        // Inicializando o Scanner para ler a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar os três primeiros números (em ordem crescente)
        System.out.print("Digite o primeiro número (menor): ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número (maior que o segundo): ");
        int numero3 = scanner.nextInt();

        // Solicitar o quarto número (pode ser qualquer valor)
        System.out.print("Digite o quarto número (em qualquer ordem): ");
        int numero4 = scanner.nextInt();

        // Colocando os quatro números em ordem decrescente
        int[] numeros = {numero1, numero2, numero3, numero4};
        
        // Ordenando o array em ordem decrescente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Exibindo os números em ordem decrescente
        System.out.print("Os números em ordem decrescente são: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Fechando o scanner
        scanner.close();
    }
}
