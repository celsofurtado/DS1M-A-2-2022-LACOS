package br.senai.sp.jandira;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
		
		int repeticao = 10;
		
		while(repeticao >= 1) {
			
			System.out.println(repeticao + " - Senai Vicente Amato");
			repeticao--;
			
		}
		
		// Cálculo de fibonacci
		int valor = 1;
		int fibonacci = valor * (valor - 1);
		
		while(valor > 2) {
			valor--;
			fibonacci = fibonacci * (valor - 1);
			//System.out.println(fibonacci);
		}
		
		System.out.println(fibonacci);
		
		Scanner leitor = new Scanner(System.in);
		String resposta = "s";
		
		while (resposta.equalsIgnoreCase("s")) {
			System.out.println("Legal, mais uma volta. Uhuuuu!!!");
			System.out.println("Mais uma volta(s/n)?");
			resposta = leitor.next();
		}
		System.out.println("A brincadira acabou!!");
		
	}

}
