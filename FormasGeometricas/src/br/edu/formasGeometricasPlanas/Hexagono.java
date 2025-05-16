package br.edu.formasGeometricasPlanas;

public class Hexagono {
		private double lado = 0;
		private double area = 0;
	
	public void recebaLado(double lado) {
		this.lado = lado; 
	}
	
	public void calcArea() {
		area = (3 * Math.sqrt(3) * lado * lado) / 2;
	}
	
	public void mostrarArea () {
		System.out.println(area);
	}

	public double mostrarAreaComRetorno () {
		System.out.println("A Area do Hexagono: "+ area);
		return area;
	}
}
