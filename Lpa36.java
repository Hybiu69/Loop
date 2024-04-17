package Lpalore;

import java.util.Scanner;

public class Lpa36 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int nf;
		double media, salario, soma=0;
		
		System.out.println("Números de funcionários: ");
		nf = ler.nextInt();
		
		for(int i=1; i<=nf; i++) {
			System.out.println("Qual os salários: ");
			salario = ler.nextDouble();
			soma=soma+salario;
			
			System.out.println("A soma dos salários é: "+soma);
			
			media=soma/nf;
			
			System.out.println("A média salárial é: "+media);
		}
		
		ler.close();
	}

}
