/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class jogoAdvinhacao {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int escolhido = sc.nextInt();

		while(true) {
			int numero = sc.nextInt();
			int diferenca = numero - escolhido;
			if(diferenca == 0) {
				System.out.println("ACERTOU");
				break;
			} else if (diferenca > 0) {
				System.out.println("MAIOR");
			} else {
				System.out.println("MENOR");
			}
		}
	}
}
