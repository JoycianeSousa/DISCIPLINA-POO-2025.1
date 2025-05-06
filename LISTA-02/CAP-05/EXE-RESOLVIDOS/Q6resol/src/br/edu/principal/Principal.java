package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        final double SALARIO_MINIMO = 450.00;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Funcionário %d:%n", i);

            System.out.print("Código do funcionário: ");
            String codigo = scanner.next();

            
            char turno;
            do {
                System.out.print("Turno (M - matutino, V - vespertino, N - noturno): ");
                turno = scanner.next().toUpperCase().charAt(0);
            } while (turno != 'M' && turno != 'V' && turno != 'N');

            
            char categoria;
            do {
                System.out.print("Categoria (O - operário, G - gerente): ");
                categoria = scanner.next().toUpperCase().charAt(0);
            } while (categoria != 'O' && categoria != 'G');

            
            System.out.print("Número de horas trabalhadas no mês: ");
            int horasTrabalhadas = scanner.nextInt();

            
            double valorHora = 0;
            if (categoria == 'G') {
                valorHora = (turno == 'N') ? 0.18 * SALARIO_MINIMO : 0.15 * SALARIO_MINIMO;
            } else { 
                valorHora = (turno == 'N') ? 0.13 * SALARIO_MINIMO : 0.10 * SALARIO_MINIMO;
            }

            
            double salarioInicial = horasTrabalhadas * valorHora;

            
            double auxilio;
            if (salarioInicial <= 300) {
                auxilio = 0.20 * salarioInicial;
            } else if (salarioInicial <= 600) {
                auxilio = 0.15 * salarioInicial;
            } else {
                auxilio = 0.05 * salarioInicial;
            }

            
            System.out.println("----- RESUMO DO FUNCIONÁRIO -----");
            System.out.println("Código: " + codigo);
            System.out.printf("Valor da hora trabalhada: R$ %.2f%n", valorHora);
            System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
            System.out.printf("Auxílio alimentação: R$ %.2f%n", auxilio);
            System.out.printf("Salário final: R$ %.2f%n", salarioInicial + auxilio);
            System.out.println("---------------------------------\n");
        }

	}

}
