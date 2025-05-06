package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int totalJogadores = 5 * 11;
        int jogadoresMenores18 = 0;
        int jogadoresAcima80kg = 0;
        double somaAlturas = 0;

        for (int time = 1; time <= 5; time++) {
            int somaIdadesTime = 0;
            System.out.println("=== Time " + time + " ===");

            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.printf("Jogador %d - Idade: ", jogador);
                int idade = scanner.nextInt();

                System.out.printf("Jogador %d - Peso (kg): ", jogador);
                double peso = scanner.nextDouble();

                System.out.printf("Jogador %d - Altura (m): ", jogador);
                double altura = scanner.nextDouble();

                if (idade < 18) {
                    jogadoresMenores18++;
                }

                if (peso > 80) {
                    jogadoresAcima80kg++;
                }

                somaIdadesTime += idade;
                somaAlturas += altura;
            }

            double mediaIdadeTime = somaIdadesTime / 11.0;
            System.out.printf("Média de idade do Time %d: %.2f anos%n%n", time, mediaIdadeTime);
        }

        double mediaAlturaGeral = somaAlturas / totalJogadores;
        double porcentagemAcima80kg = (jogadoresAcima80kg * 100.0) / totalJogadores;

        System.out.println("==== RESULTADOS FINAIS ====");
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores18);
        System.out.printf("Média de altura de todos os jogadores: %.2f metros%n", mediaAlturaGeral);
        System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%%n", porcentagemAcima80kg);
        

	}

}
