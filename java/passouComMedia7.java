/**
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class passouComMedia7 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	float nota1 = sc.nextFloat();
	float nota2 = sc.nextFloat();
	
	float media = (nota1 + nota2) / 2;

	if (media >= 7.0){
		System.out.println("pass: True!");
	}
	else{
		System.out.println("pass: False!");
	}
	}
}
