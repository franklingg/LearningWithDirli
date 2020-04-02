/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class maiorMenor{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		int maior = 0, menor = 500;
		for(int i=0;i<5;i++){
			int numero = sc.nextInt();
			if(numero > maior) {
				if (numero < menor){
					menor = numero;
				}
				maior = numero;
			} else if(numero < menor) {
				menor = numero;
			}
		}
		System.out.println(maior - menor);
        }
}

