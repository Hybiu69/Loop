package Lpalore;

import java.util.Scanner;

public class Lpa35 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int n, fatorial=1,soma=1;

		System.out.println("Informe um número inteiro: ");
		n = ler.nextInt();

		for(int i=1; i<=n; i++) {
			fatorial=fatorial*1;
			soma*=i;
		}
		System.out.println("O fatorial é: "+soma);
		
		ler.close();
	}

}