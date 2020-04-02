/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class receitasDespesasFiliais{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] input1 = sc.nextLine().split(" ");
		String[] input2 = sc.nextLine().split(" ");
		int profit=0, negativeProfit=0;
	       	Integer receita=0, despesa=0, lucro=0;
		for(int i = 0;i<input1.length;i++){
			receita = Integer.parseInt(input1[i]);
			despesa = Integer.parseInt(input2[i]);
			lucro = receita-despesa;
			if(lucro >=0){profit += lucro;}
			else{negativeProfit += lucro;}
		}
		System.out.println(profit);
		System.out.println(negativeProfit);
	}
}
