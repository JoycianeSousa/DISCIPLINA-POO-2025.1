package br.edu.formasGeometricasPlanas;

public class Losango {
	private double DiagonalMaior;
	private double DiagonalMenor;
	private double area;
	
	public Losango() {
		DiagonalMaior = 0;
		DiagonalMenor=0;
		area = 0;
	} 
	public void ReceberDiagonalMaior( double pDiagonalMaior){
		DiagonalMaior=pDiagonalMaior;
	}
	public void ReceberDiagonalMenor( double pDiagonalMenor){
		DiagonalMenor=pDiagonalMenor;
		
	}
	public void CalcArea(){
		area= (DiagonalMaior * DiagonalMenor)/2;
	}
	public void MostraArea(){
		System.out.println(area);
	}
	public double MostraAreaComRetorno(){
		System.out.println(" A area do Losango: "+ area);
		return area;
	}

}
