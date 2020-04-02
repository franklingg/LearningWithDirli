/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class vogalXPLOTS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		char xplots= ' ', letra= ' ';

		for(int i=0; i<palavra.length();i++){
			letra = palavra.charAt(i);
			if(letra =='A'){xplots=letra; break;}
			else if(letra=='E' && xplots!='A'){xplots=letra;}
			else if(letra=='U' && !(xplots=='A'||xplots=='E')){xplots=letra;}
			else if(letra=='O' && !(xplots=='A'||xplots=='E'||xplots=='U')){xplots=letra;}
			else if(letra=='I' && !(xplots=='A'||xplots=='E'||xplots=='U'||xplots=='O')){xplots=letra;}
		}
		System.out.println(xplots);
	}
}
