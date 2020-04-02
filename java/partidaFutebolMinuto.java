/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class partidaFutebolMinuto{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int golCasa = 0, golConv = 0, faltaCasa = 0, faltaConv = 0;
		while(!(input[1].equals("FIM"))){
			input = sc.nextLine().split(" ");
			if(input[1].equals("GOL")){
				if(input[2].equals("CASA")){golCasa++;}
				else{golConv++;}
			} else if(input[1].equals("FALTA")){
				if(input[2].equals("CASA")){faltaCasa++;}
				else{faltaConv++;}
			}
		}
		System.out.println(golCasa + " GOL CASA");
		System.out.println(golConv + " GOL CONVIDADO");
		System.out.println(faltaCasa + " FALTA CASA");
		System.out.println(faltaConv + " FALTA CONVIDADO");
	}
}
