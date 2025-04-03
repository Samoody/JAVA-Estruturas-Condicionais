import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        // Cabeçalho
        System.out.println("*********************************************************");
        System.out.println("Nome: SAMUEL KLEBER VIEIRA SILVA");
        System.out.println("RA: 12123150");
        System.out.println("Data: 03/04/2025");
        System.out.println("*********************************************************");

        Scanner scanner = new Scanner(System.in);

        // Solicitar um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se o número é positivo ou negativo
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número " + numero + " é zero.");
        }

        scanner.close();
    }
}
