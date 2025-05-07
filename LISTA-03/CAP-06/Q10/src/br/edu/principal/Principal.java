package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String gabarito = scanner.nextLine();
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            String respostas = scanner.nextLine();
            int nota = 0;
            for (int j = 0; j < 8; j++) {
                if (respostas.charAt(j) == gabarito.charAt(j)) nota++;
            }
            System.out.println(nota);
            if (nota >= 6) aprovados++;
        }

        System.out.println(aprovados * 10 + "%");
	}
}
