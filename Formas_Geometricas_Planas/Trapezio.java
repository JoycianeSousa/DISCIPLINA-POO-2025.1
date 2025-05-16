package br.edu.formasGeometricasPlanas;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public Trapezio() {
		baseMaior = 0;
		baseMenor=0;
		altura=0;
		area = 0;
	} 
	public void recebaBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior; 
	}
    
	public void recebaBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor; 
	}
	
	public void recebaAltura(double altura) {
		this.altura = altura; 
	}
	
	public void calcArea() {
		area = ((baseMaior + baseMenor) * altura)/2;
	}
	
	public void mostrarArea() {
		System.out.println(area);
	}
	public double MostraAreaComRetorno(){
		System.out.println("A Area do Trapezio:"+ area);
		return area;
	}
}
