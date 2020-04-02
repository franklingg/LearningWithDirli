/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class drebito{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		sc.nextLine();
		String payment = sc.nextLine();
		if(payment.equals("debito")){System.out.println(valor + " REAIS NO DEBITO");}
		else{
			String input = sc.nextLine();
			char isParcel = input.charAt(0);
			if(isParcel == 's'){
				int number = sc.nextInt();
				double parcel = valor / number;
				System.out.println(number + " PARCELAS DE " + parcel + " REAIS");
			}
			else{System.out.println(valor + " REAIS NO CREDITO (DIRETO)");}
		}
	}
}
