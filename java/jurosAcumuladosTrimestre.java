/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class jurosAcumuladosTrimestre{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		double infl = 0;
		for(int i=0;i<3;i++){
			infl = sc.nextDouble();
			valor *= (1+infl);
		}
		int cont = 0, valor2 =0;
		while(true){
			valor2 = (int) Math.round(valor);
			if((Math.abs(valor-valor2))> 0.0000001){
				valor *= 10;
				cont++;
			} else {
				break;
			}
		}
		valor = valor2 / (Math.pow(10.0,cont));
		System.out.println(valor);
	}
}
