/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;

public class gastosBolsaMonitoria{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Double sobra = 1200.00;
		String[] input = new String[1000];
		Double custo = 0.0, custoMax = 0.0;

		Integer diaAnterior = 0;
		int maxDias = 0, dias = 0;

		String evento = " ";
		while (sobra > 0){
			input = sc.nextLine().replaceAll(",",".").split(" ");
			
			dias = Integer.parseInt(input[0]) - diaAnterior-1;
			if(dias > maxDias){maxDias = dias;}
			diaAnterior = Integer.parseInt(input[0]);
				
			custo = sobra - Double.parseDouble(input[input.length-1]);
			if(custo > custoMax){
				custoMax = custo;
				evento = String.join(" ", Arrays.copyOfRange(input, 1, input.length-1));
			}
			sobra = Double.parseDouble(input[input.length-1]);
		}
		String custoMaxStr = String.format("%.2f",custoMax);
		custoMaxStr = custoMaxStr.replaceAll(Pattern.quote ("."),",");
		System.out.println("MAIOR: " + evento + " " + custoMaxStr);
		System.out.println("DIAS: " + maxDias);

		
	}
}
