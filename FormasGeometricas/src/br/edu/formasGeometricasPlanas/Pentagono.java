package br.edu.formasGeometricasPlanas;

public class Pentagono {
	private double lado;
	private double apotema;
	private double area;
	

	public  Pentagono() {
		lado = 0;
		area = 0;
	}
	public void recebaLado(double lado) {
			this.lado = lado; 
	}
	
	public void calcApotema() {
		apotema = lado / (2 * Math.tan(Math.PI / 5));
	}
	
	public void calcArea() {
		area = (5 * lado * apotema) / 2;
	}
	
	public void mostrarArea() {
		System.out.println(area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println("A rea do Pentagono:"+ area);
		return area;
	}

}
