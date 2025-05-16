package br.edu.formasGeometricasPlanas;

public class Circulo {
	private double raio;
	private double area;
	
	public Circulo() {
		raio = 0;
		area = 0;
	} 
	public void ReceberRaio( double pRaio){
		raio= pRaio;
	}
	public void CalcArea(){
		area= Math.PI*(raio * raio);
	}
	public void MostraArea(){
		System.out.println(area);
	}
	public double MostraAreaComRetorno(){
		System.out.println("A Area do Circulo: "+ area);
		return area;
	}
	

}
