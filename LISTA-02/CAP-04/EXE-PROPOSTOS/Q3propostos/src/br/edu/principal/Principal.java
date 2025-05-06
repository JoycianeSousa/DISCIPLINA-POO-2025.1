package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        
        if (numero1 < numero2) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero2 < numero1) {
            System.out.println("O menor número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

	}

}
