/*
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class doisMaioresGastosEmpresa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		Integer valor = 0;
		int maior = -1, maior2 = -1;
		for(int i=0; i<entrada.length;i++){
			valor = Integer.parseInt(entrada[i]);
			if(valor > maior){
				maior2 = maior;
				maior = valor;
			} else if(valor > maior2) {
				maior2 = valor;
			}
		}
		System.out.println(maior + maior2);
	}
}
