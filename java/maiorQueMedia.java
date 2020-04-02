/**
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;


public class maiorQueMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		String[] nums = palavra.split(" ");
		int sum = 0;
		for (String number: nums) {
			Integer n = Integer.parseInt(number);
			sum += n;
		}
		float media = sum / nums.length;
		
		String acima = new String(""); 
		for (int i=0; i<nums.length; i++) {
			Integer n = Integer.parseInt(nums[i]);
			if (n > media){
				acima += nums[i] + ' '; 
			}
		}
		System.out.println(acima);
	}
}
