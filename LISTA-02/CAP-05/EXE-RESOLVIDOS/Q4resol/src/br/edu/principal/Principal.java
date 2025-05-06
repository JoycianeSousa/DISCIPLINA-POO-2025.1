package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
	

			        int codCidade, numVeiculos, numAcidentes;
			        int maiorIndice = 0, menorIndice = 0;
			        int cidadeMaior = 0, cidadeMenor = 0;

			        int somaVeiculos = 0;
			        int somaAcidentesMenos2000 = 0;
			        int contCidadesMenos2000 = 0;

			        for (int i = 1; i <= 5; i++) {
			            System.out.printf("Cidade %d:%n", i);

			            System.out.print("Código da cidade: ");
			            codCidade = Scanner.nextInt();

			            System.out.print("Número de veículos de passeio: ");
			            numVeiculos = Scanner.nextInt();

			            System.out.print("Número de acidentes com vítimas: ");
			            numAcidentes = Scanner.nextInt();

			           
			            somaVeiculos += numVeiculos;

			            if (i == 1) {
			                maiorIndice = numAcidentes;
			                menorIndice = numAcidentes;
			                cidadeMaior = codCidade;
			                cidadeMenor = codCidade;
			            } else {
			                if (numAcidentes > maiorIndice) {
			                    maiorIndice = numAcidentes;
			                    cidadeMaior = codCidade;
			                }
			                if (numAcidentes < menorIndice) {
			                    menorIndice = numAcidentes;
			                    cidadeMenor = codCidade;
			                }
			            }

			            
			            if (numVeiculos < 2000) {
			                somaAcidentesMenos2000 += numAcidentes;
			                contCidadesMenos2000++;
			            }

			            System.out.println();
			        }

			        double mediaVeiculos = somaVeiculos / 5.0;
			        double mediaAcidentes = contCidadesMenos2000 > 0
			                ? somaAcidentesMenos2000 / (double) contCidadesMenos2000
			                : 0.0;

			        System.out.printf("Maior índice de acidentes: %d (Cidade %d)%n", maiorIndice, cidadeMaior);
			        System.out.printf("Menor índice de acidentes: %d (Cidade %d)%n", menorIndice, cidadeMenor);
			        System.out.printf("Média de veículos nas 5 cidades: %.2f%n", mediaVeiculos);
			        if (contCidadesMenos2000 > 0) {
			            System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos: %.2f%n", mediaAcidentes);
			        } else {
			            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
			        }
		
	}

}
