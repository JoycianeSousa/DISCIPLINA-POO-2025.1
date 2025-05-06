package br.edu.principal;
import java.util.Scanner;
public class Principal {

	
  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int seg;
		        System.out.print("Digite o número de segundos: ");
		        seg = scanner.nextInt();

		        transformacao(seg);

		        scanner.close();
		    }

		    public static void transformacao(int segundos) {
		        int h = segundos / 3600;
		        int r = segundos % 3600;
		        int m = r / 60;
		        int s = r % 60;

		        System.out.println("Horas: " + h);
		        System.out.println("Minutos: " + m);
		        System.out.println("Segundos: " + s);
		    }
		}
		