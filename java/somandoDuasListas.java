/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class somandoDuasListas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] nums1 = new int[numbers], nums2 = new int[numbers];
		int input=0;

		for(int i=0; i<numbers;i++){
			input = sc.nextInt();
			nums1[i] = input;
		}
		for(int i=0;i<numbers;i++){
			input = sc.nextInt();
			nums2[i] = input;
		}
		for(int i=0;i<numbers;i++){
			System.out.println(nums1[i] + nums2[i]);
		}
	}
}
