package br.edu.formasGeometricasPlanas;

public class Retangulo {

	private double base;
	private double altura;
	private double area;
	
	public Retangulo() {
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
		area = base * altura;
	}
	public void MostraArea(){
		System.out.println(area);
	}
	public double MostraAreaComRetorno(){
		System.out.println("A area do Retangulo:" + area);
		return area;
	}
	
	

}
