package br.edu.formasGeometricasPlanas;

public class Quadrado {
	
	private double lado;
	private double area;
	
	public Quadrado() {
	lado = 0;
	area = 0;
	} 
	public void ReceberLado( double pLado){
		lado= pLado;
	}
	public void CalcArea(){
		area= (lado * lado);
	}
	public void MostraArea(){
		System.out.println(area);
	}
	public double MostraAreaComRetorno(){
		System.out.println("A area do Quadrado:" + area);
		return area;
	}
	

}
