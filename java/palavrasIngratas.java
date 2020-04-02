/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class palavrasIngratas{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		int ingratas = 0, i=0, words = 0;
		while(true){
			if(ingratas == 3){break;}
			String palavra = sc.nextLine();
			for(i=0; i<palavra.length(); i++) {
				char letra = palavra.charAt(i);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
					break;
				} else {
					words += 1;
				}
			}
			if(words == palavra.length()) {
				ingratas += 1;
				System.out.println(palavra);
			}
			words = 0;
		}
        }
}

