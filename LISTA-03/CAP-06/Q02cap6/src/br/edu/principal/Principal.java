package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        final int TAMANHO = 10;
        double[] preco = new double[TAMANHO];
        int[] qtd = new int[TAMANHO];

        double totGeral = 0.0;
        double totVend;
        double comissao;
        int maiorQtd;
        int indiceMaior;

    
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite a quantidade vendida do objeto " + (i + 1) + ": ");
            qtd[i] = scanner.nextInt();

            System.out.print("Digite o preço unitário do objeto " + (i + 1) + ": ");
            preco[i] = scanner.nextDouble();
        }

        System.out.println("\nRelatório de vendas:");
        System.out.println("Objeto | Quantidade | Preço Unitário | Total");

       
        for (int i = 0; i < TAMANHO; i++) {
            totVend = qtd[i] * preco[i];
            totGeral += totVend;
            System.out.printf("  %2d    |    %3d     |    R$%.2f     | R$%.2f\n", (i + 1), qtd[i], preco[i], totVend);
        }

       
        comissao = totGeral * 0.05;

        System.out.printf("\nTotal geral das vendas: R$%.2f\n", totGeral);
        System.out.printf("Comissão do vendedor (5%%): R$%.2f\n", comissao);

       
        maiorQtd = qtd[0];
        indiceMaior = 0;

        for (int i = 1; i < TAMANHO; i++) {
            if (qtd[i] > maiorQtd) {
                maiorQtd = qtd[i];
                indiceMaior = i;
            }
        }

        System.out.printf("\nObjeto mais vendido: R$%.2f (posição %d no vetor)\n",
                preco[indiceMaior], indiceMaior);


	}

}
