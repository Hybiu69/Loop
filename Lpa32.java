package Lpalore;

import java.util.Scanner;

public class Lpa32 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva o valor de repetição: ");
		int in = ler.nextInt();

		for(int i=0; i<=in; i++) { 
			if(i%2!=0) {
				System.out.println("Os números ímpares: "+i);
			}


		}
		ler.close();
	}
}