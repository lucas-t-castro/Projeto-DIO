import java.util.Scanner;

public class Exercicio{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = numero.nextInt();
        System.out.print("Digite um numero: ");
        int n2 = numero.nextInt();

        int soma = n1 + n2;

        System.out.print("A soma é: " + (soma));
    }
}