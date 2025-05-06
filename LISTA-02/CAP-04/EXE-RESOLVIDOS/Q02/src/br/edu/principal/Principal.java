package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static int somar(int num1, int num2) {
        int s = 0;
        for (int i = num1 + 1; i < num2; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int s = somar(num1, num2);
        System.out.println("soma = " + s);

        scanner.close();
    }
}
