package principal;

import java.util.Scanner;

import entidades.Retang;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retang rect = new Retang();

		System.out.println("Digite os valores de largura e altura: ");
		rect.altura = sc.nextDouble();
		rect.largura = sc.nextDouble();

		System.out.printf("A area é = %.2f%n", rect.calculaArea());
		System.out.printf("O perimetro é  = %.2f%n", rect.calculaPerimetro());
		System.out.printf("A diagonal é  = %.2f%n", rect.calculaDiagonal());
		sc.close();

	}

}
