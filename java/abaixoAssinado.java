/*                                                                                                                                                                       * Laboratório de Programação 2 - Lab 1                                                                                                                                  *                                                                                                                                                                       * @author Franklin Regis de Oliveira - 119210030                                                                                                                        */                                                                                                                                                                                                                                                                                                                                             import java.util.Scanner;

public class abaixoAssinado{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pessoas = 0, total = 0, pontuacao = 0;
		char valor = ' ';
		String assinado = " ";
		while(true){
			assinado = sc.nextLine();
			if (assinado.equals("fim")) {break;}
			pessoas += 1;
			valor = assinado.charAt(assinado.length()-1);
			pontuacao = valor - '0';
		        total += pontuacao;	
		}
		int media = total / pessoas;
		System.out.println(pessoas);
		System.out.println(media);

	}
}
