/**                                                                                                                      * Laboratório de Programação 2 - Lab 1                                                                                  *                                                                                                                       * @author Franklin Regis de Oliveira - 119210030                                                                        */  

import java.util.Scanner;


public class calculadoraComOpcao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sign = sc.nextLine();
		double result = 0;	
		if (sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*")) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
	
			if (sign.equals("/") && n2 == 0) {
				System.out.println("ERRO");
			} else {
				if (sign.equals("+")) { result = n1 + n2;}
				else if (sign.equals("-")) { result = n1 - n2;}
				else if (sign.equals("*")) { result = n1 * n2;}
				else {result = n1 / n2; }
				System.out.println("RESULTADO: " + result);
			}
		} else {
			System.out.println("ENTRADA INVALIDA");
		}
	}
}
