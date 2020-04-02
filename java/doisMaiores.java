/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class doisMaiores {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] valores = (sc.nextLine()).split(" ");
		int maior = 0, maior_2 = 0;

		for(int i = 0; i < valores.length; i++) {
			Integer valor = Integer.parseInt(valores[i]);
			if(valor > maior) {
				maior_2 = maior;
				maior = valor;
			} else if(valor > maior_2) {
				maior_2 = valor;
			}
		
		}
		System.out.println(maior + maior_2);
	}
}
