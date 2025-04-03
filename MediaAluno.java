import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // *********************************************************
        // Nome: SAMUEL KLEBER VIEIRA SILVA
        // RA: 12123150
        // Data: 03/04/2025
        // *********************************************************

        // Inicializando o Scanner para ler a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calculando a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibindo a média
        System.out.println("A média aritmética do aluno é: " + media);

        // Definindo as mensagens com base na média
        if (media >= 6.0) {
            System.out.println("Parabéns! O aluno foi aprovado.");
        } else {
            System.out.println("O aluno ficou para exame.");
            // Calculando a nota necessária para aprovação
            double notaExame = 12.0 - media;  // Para atingir a média 6.0
            System.out.println("O aluno precisa tirar " + notaExame + " no exame para ser aprovado.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
