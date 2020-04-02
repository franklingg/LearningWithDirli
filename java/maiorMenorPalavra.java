/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class maiorMenorPalavra{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		int size_maior = 0, size_menor = 300;
		String maior = " ", menor = " ";
		for(int i=0; i<5; i++){
			String palavra = sc.nextLine();
			if (palavra.length() > size_maior) {
				if (palavra.length() < size_menor) {
					size_menor = palavra.length();
					menor = palavra;
				}
				size_maior = palavra.length();
				maior = palavra;
			} else if(palavra.length() < size_menor) {
				size_menor = palavra.length();
				menor = palavra;
			}
		}
		System.out.println(menor);
		System.out.println(maior);
        }
}

