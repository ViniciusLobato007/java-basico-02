package exercicio02.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private void start() {

		System.out.print("Digite o valor do produto: ");

		Scanner scan = new Scanner(System.in);

		double valorDouble = scan.nextDouble();

		int valorInteiro = (int) valorDouble;

		System.out.println("Valor em double: " + valorDouble + "| Valor int: " + valorInteiro);
		
		valorInteiro = 10;

		double valorDecimal = (int) valorInteiro;
		
		System.out.println("Novo: " + valorDouble + "| Convertido: " + valorInteiro);

	}

}
