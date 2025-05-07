package br.edu.principal;
import java.util.Arrays;
public class Principal {
		    public static void main(String[] args) {
		    	int[] x = {6, 8, 1, 10, 3};
		        int[] y = {20, 0, 7, 2, 5};

		        Arrays.sort(x);
		        Arrays.sort(y);

		        int[] resultado = new int[10];
		        System.arraycopy(x, 0, resultado, 0, 5);
		        System.arraycopy(y, 0, resultado, 5, 5);

		        Arrays.sort(resultado);

		        System.out.println(Arrays.toString(resultado));
	}

}
