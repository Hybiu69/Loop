package Lpalore;

import java.util.Scanner;

public class Lpa34 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		double soma=0;
		double n;

		for(int i =0; i<=9; i++) {
			System.out.print("Informe o número: ");
			n = ler.nextDouble();
			soma = soma+n;
		}
		for(int i =0; i<=soma; i++) {
			if(i%2!=0) {
				System.out.println("Os números ímpares: "+i);
			}
			else if (i%2==0) {
				System.out.println("Os números pares: "+i);
			}

		}
		ler.close();
	}
}