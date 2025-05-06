package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, res;
		
		System.out.println("sequencia de fibonacci ( 8 primeiros numeros):  ");
		System.out.print(num1 + "");
		System.out.print(num2 + "");
		
		for (int cont = 3; cont <= 8; cont++);
			res = num1+ num2;
			System.out.print( res + " ");
			num1 = num2;
			num2 = num1;
	
	}

}
