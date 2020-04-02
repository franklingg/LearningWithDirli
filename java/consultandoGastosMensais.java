/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class consultandoGastosMensais{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] meses = line.split(" ");

		String line_2 = sc.nextLine();
		String[] valores = line_2.split(" ");

		String leitura = sc.nextLine();
		
		for (int i=0; i<meses.length; i++) {
			if (meses[i].equals(leitura)) {
				System.out.println(valores[i]);
			}
		}
	}
}
