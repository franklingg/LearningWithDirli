/*
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class termosProgressaoAritmetica{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int termoInicial = sc.nextInt();
		int razao = sc.nextInt();
		int termos = sc.nextInt();
		for(int i=0; i<termos;i++){
			int valor = termoInicial + razao*i;
			if(i==termos-1){System.out.print(valor);}
			else{System.out.print(valor + " ");}
		
		}
	}
}
