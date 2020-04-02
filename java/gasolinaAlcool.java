/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class gasolinaAlcool{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double alcool = sc.nextDouble();
		double gasolina = sc.nextDouble();
		double litros = sc.nextDouble();
		if(alcool < 0.7 * gasolina){System.out.println(litros*alcool);}
		else{System.out.println(litros*gasolina);}
	}
}
