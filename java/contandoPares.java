/* 
 *  Laboratório de Programação 2 - Lab 1
 * 
 *  @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class contandoPares{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int count = 0;
		Long number = Long.valueOf(0);
		for(int i = 0; i<input.length;i++){
			if(input[i].equals("")){continue;}
			number = Long.parseLong(input[i]);
			if(number % 2 == 0){count += 1;}
		}
		System.out.println(count);
	}
}
