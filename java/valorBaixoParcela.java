/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class valorBaixoParcela{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inicial = sc.nextInt(), total = sc.nextInt(), parcelas = sc.nextInt();
		int valorParc = (total - inicial) / parcelas;
		if(valorParc >= 1000){System.out.println("ALTO (" + valorParc + ")");}
		else{System.out.println("BAIXO (" + valorParc + ")");}
	}
}
