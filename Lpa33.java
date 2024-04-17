package Lpalore;

import java.util.Scanner;

public class Lpa33 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double n,media;
		double soma=0;
		
		for(int i=0; i<=4; i++) {

			System.out.println("Informa sua nota: ");
			n = ler.nextDouble();
			soma = soma+n;
			
			System.out.println("A somatória é: "+soma);
			
			media = soma/5;
			System.out.println("A média é: "+media);
		}
		
		ler.close();
	}

}