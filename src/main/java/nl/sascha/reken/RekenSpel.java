package nl.sascha.reken;

import java.util.Scanner;

public class RekenSpel {

	public static void main(String[] args) {
		System.out.println("Welkom bij het rekenspel. \n");
		System.out.println("1 = sommen");
		System.out.println("2 = sommen en verschillen");
		System.out.println("3 = sommen, verschillen en producten");
		System.out.println("4 = sommen, verschillen, producten en quotiënten");
		System.out.println("5 = stop het spel");
		System.out.println("\nVoer een niveau in:");

		Scanner scanner = new Scanner(System.in);
		int nivo = scanner.nextInt();

		if (nivo != 5)
			new Reken(nivo);
		scanner.close();
	}

}
