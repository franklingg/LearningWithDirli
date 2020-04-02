/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class estabilizandoAlturaAviao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ideal = sc.nextInt();
		int altura_0 = sc.nextInt();
		int diferenca_0 = Math.abs(altura_0 - ideal);

		while (true) {
			int altura_1 = sc.nextInt();
			int diferenca_1 = Math.abs(altura_1-ideal);

			if (diferenca_1 == 0) {
				System.out.println("OK");
				break;
			} else if (diferenca_1 >= diferenca_0) {
				System.out.println("PERIGO");
			} else {
				System.out.println("ADEQUADO");
			}
			diferenca_0 = diferenca_1;
			
		}
	}
}
