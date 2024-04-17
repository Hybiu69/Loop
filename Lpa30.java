package Lpalore;

import java.util.Scanner;

public class Lpa30 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		String n;

		for(int i=0;i <=5; i++) {
			System.out.println("Qual seu nome?");
			n = ler.next();
			System.out.println("Seu nome é: "+n);
			System.out.println("****************");
		}
		ler.close();
	}

}