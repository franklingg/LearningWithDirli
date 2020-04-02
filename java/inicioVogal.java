/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class inicioVogal{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			String palavra = sc.nextLine();
			char letraInicial = palavra.charAt(0);
			if (letraInicial == 'a') {
				System.out.println('s');
			} else {
				System.out.println('n');
			}
		}
        }
}

