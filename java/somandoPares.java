/* 
 *  Laboratório de Programação 2 - Lab 1
 * 
 *  @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class somandoPares{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int count = 0;
		Integer number = 0;
		for(int i = 0; i<input.length;i++){
			number = Integer.parseInt(input[i]);
			if(number % 2 == 0){count += number;}
		}
		System.out.println(count);
	}
}
