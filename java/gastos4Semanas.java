/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class gastos4Semanas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = 0, menor = 10000000, maior = -10000000;
		Integer dia = 0;
		for(int i=0; i<4;i++){
			String[] semana = sc.nextLine().split(" ");
			for(int j=0; j<7; j++){
				dia  = Integer.parseInt(semana[j]);
				total += dia;
				if(dia > maior){maior = dia;}
				if(dia < menor){menor = dia;}
			}
			System.out.println(total + " " + menor + " " + maior);
			total = 0; maior=-100000000; menor = 10000000;
		}
	}
}
