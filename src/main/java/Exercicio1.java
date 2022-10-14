import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

//        1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
//        (switch-case)
//
//        1 – Adição
//        2 – Subtração
//        3 – Multiplicação
//        4 – Divisão

        Scanner entrada = new Scanner(System.in);

        System.out.println("O que você deseja ? ");
        System.out.println(" Digite 1 se deseja somar;");
        System.out.println(" Digite 2 se deseja subtrair;");
        System.out.println(" Digite 3 se deseja multiplicar;");
        System.out.println(" Digite 4 se deseja dividir.");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = entrada.nextDouble();

        switch (opcao) {
            case 1:
                double soma = primeiroValor + segundoValor;
                System.out.println("A soma dos valores é: " + soma);
                break;
            case 2:
                double subtracao = primeiroValor - segundoValor;
                System.out.println("A subtração dos valores é: " + subtracao);
                break;
            case 3:
                double multiplicacao = primeiroValor * segundoValor;
                System.out.println("A multiplicação dos valores é: " + multiplicacao);
                break;
            case 4:
                double divisao = primeiroValor / segundoValor;
                System.out.println("A soma dos valores é: " + divisao);
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}
