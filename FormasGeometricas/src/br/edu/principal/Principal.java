package br.edu.principal;

import br.edu.formasGeometricasPlanas.*;


public class Principal {

	public static void main(String[] args) {
		Triangulo fg1 = new Triangulo();
		fg1.ReceberBase(10);
		fg1.ReceberAltura(6);
		fg1.CalcArea();
		fg1.MostraArea();
		double recebaArea = fg1.MostraAreaComRetorno();
		System.out.println("");
		
		
		Quadrado  fg2 = new Quadrado();
		fg2.ReceberLado(8);
		fg2.CalcArea();
		fg2.MostraArea();
		recebaArea = fg2.MostraAreaComRetorno();
		System.out.println("");
		
		
		Circulo  fg3 = new Circulo();
		fg3.ReceberRaio(8);
		fg3.CalcArea();
		fg3.MostraArea();
		recebaArea = fg3.MostraAreaComRetorno();
		System.out.println("");
		
		
		Trapezio fg4 = new Trapezio();
		fg4.recebaBaseMaior(8.6);
		fg4.recebaBaseMenor(5);
		fg4.recebaAltura(6);
		fg4.calcArea();
		fg4.mostrarArea();
		recebaArea = fg4.MostraAreaComRetorno();
		System.out.println("");
		
		
		Retangulo fg5 = new Retangulo();
		fg5.ReceberBase(6);
		fg5.ReceberAltura(2);
		fg5.CalcArea();
		fg5.MostraArea();
		recebaArea = fg5.MostraAreaComRetorno();
		System.out.println("");
		
		
		Losango fg6 = new Losango();
		fg6.ReceberDiagonalMaior(7);
		fg6.ReceberDiagonalMenor(6);
		fg6.CalcArea();
		fg6.MostraArea();
		recebaArea = fg6.MostraAreaComRetorno();
		System.out.println("");
		
		
		Paralelograma fg7 = new Paralelograma();
		fg7.ReceberAltura(10);
		fg7.ReceberBase(8);
		fg7.CalcArea();
		fg7.MostraArea();
		recebaArea = fg7.MostraAreaComRetorno();
		System.out.println("");
		
		
		Pentagono fg8 = new Pentagono();
		fg8.recebaLado(8);
		fg8.calcApotema();
		fg8.calcArea();
		fg8.mostrarArea();
		recebaArea = fg8.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Hexagono fg9 = new Hexagono();
		fg9.recebaLado(2);
		fg9.calcArea();
		fg9.mostrarArea();
		recebaArea = fg9.mostrarAreaComRetorno();
		System.out.println("");
	}

}
