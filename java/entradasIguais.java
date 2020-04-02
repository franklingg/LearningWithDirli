/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class entradasIguais{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 == num2 && num2 == num3){System.out.println(3);}
		else if (num1 == num2 || num1 == num3 || num2 == num3){System.out.println(2);}
		else{System.out.println(0);}
	}
}
