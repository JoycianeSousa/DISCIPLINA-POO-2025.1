package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
   

  
    System.out.print("DIGITE O PESO DA PESSOA EM QUILOS (kg): ");
    double pesoQuilos = Scanner.nextDouble();

    
    double pesoGramas = pesoQuilos * 1000;

    
    System.out.println("O PESO EM GRAMAS É: " + String.format("%.0f", pesoGramas) + " g");

   
    Scanner.close();
}

{

}
}