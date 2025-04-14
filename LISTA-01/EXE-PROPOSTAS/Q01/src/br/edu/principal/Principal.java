package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    
     System.out.print("Digite o primeiro numero: ");
     double n1= Scanner.nextInt();
   
     System.out.print("Digite o segundo numero:");
     double n2 = Scanner.nextInt();
     
     System.out.print("Digite o primeiro numero: ");
     double n3= Scanner.nextInt();
     
     System.out.print("Digite o primeiro numero: ");
     double n4= Scanner.nextInt();
      
     System.out.println("O resultado da adicao: " + (n1 + n2 + n3 + n4) );
     
     Scanner.close();
	}

}
