package br.edu.formasGeometricasPlanas;

public class Triangulo {
	
	private double base;
	private double altura;
	private double area;
	
	public Triangulo() {
		base = 0;
		altura = 0;
		area = 0;
	} 
	public void ReceberBase( double pBase){
		base= pBase;
	}
	public void ReceberAltura( double pAltura){
		altura= pAltura;
	}
	public void CalcArea(){
		area= (base * altura) /2;
	}
	public void MostraArea(){
		System.out.println(area);
	}
	public double MostraAreaComRetorno(){
		System.out.println("A area do Triangulo:"+ area);
		return area;
	}
	

}
