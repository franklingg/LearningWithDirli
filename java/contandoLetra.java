/*                                                                                                                       * Laboratório de Programação 2 - Lab 1                                                                               *                                                                                                                       * @author Franklin Regis de Oliveira - 119210030                                                                        */                                                                                                                                                                                                                                             
import java.util.Scanner;


public class contandoLetra {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); String entryChar = sc.nextLine();
		char countingChar = entryChar.charAt(0);
		int count = 0;
		String phrase = sc.nextLine();
		char letter = ' ';
		for(int i=0;i<phrase.length();i++){
			letter = phrase.charAt(i);
			if(letter == countingChar){count++;}
		}
		System.out.println(count);
	}
}
