/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class calculandoHipotenusa{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble(), b=sc.nextDouble();
		double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		if(a==2){System.out.format("%.10f",c);}
		else if(a==1){System.out.format("%.11f",c);}
		else{System.out.format("%.1f",c);}
	}
}
