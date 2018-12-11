package nl.sascha.reken;

import java.util.Random;
import java.util.Scanner;

public class Reken {
	private static final Random random = new Random();
	private static final Scanner scanner = new Scanner(System.in);

	private int gemaakteSommen;
	private int aantalFouten;
	private int x;
	private int y;
	private int invoer;

	public Reken(int nivo) {
		
		for (int i = 0; i < 10; i++) {
			int random = new Random().nextInt(nivo) + 1;

			switch (random) {
			case 1:
				optellen();
				break;
			case 2:
				aftrekken();
				break;
			case 3:
				vermenigvuldig();
				break;
			case 4:
				quotient();
				break;
			}
		}
		System.out.println("Gemaakte sommen: " + gemaakteSommen + " aantal fouten: " + aantalFouten);
	}

	private void optellen() {
		genereerRandomXenY();

		System.out.println("Wat is de uitkomst van: " + x + " + " + y);

		vraagInvoer();

		if (invoer == x + y) {
			System.out.println("Goed!");
		} else {
			System.out.println("Fout!");
			aantalFouten++;
		}
		gemaakteSommen++;
	}

	private void aftrekken() {
		genereerRandomXenY();

		System.out.println("Wat is de uitkomst van: " + x + " - " + y);

		vraagInvoer();

		if (invoer == x - y) {
			System.out.println("Goed!");
		} else {
			System.out.println("Fout!");
			aantalFouten++;
		}
		gemaakteSommen++;
	}

	private void vermenigvuldig() {
		genereerRandomXenY();

		System.out.println("Wat is de uitkomst van: " + x + " * " + y);

		vraagInvoer();

		if (invoer == x * y) {
			System.out.println("Goed!");
		} else {
			System.out.println("Fout!");
			aantalFouten++;
		}
		gemaakteSommen++;
	}

	private void quotient() {
		genereerRandomXenYvoorDelen();

		System.out.println("Wat is de uitkomst van: " + x + " / " + y);

		vraagInvoer();

		if (invoer == x / y) {
			System.out.println("Goed!");
		} else {
			System.out.println("Fout!");
			aantalFouten++;
		}
		gemaakteSommen++;
	}

	public void genereerRandomXenY() {
		x = random.nextInt(10);
		y = random.nextInt(10);
	}

	public void genereerRandomXenYvoorDelen() {
		x = random.nextInt(30);
		y = random.nextInt(29) + 1;

		while (!(x % y == 0)) {
			genereerRandomXenYvoorDelen();
		}
	}

	public void vraagInvoer() {
		if (scanner.hasNextInt())
			invoer = scanner.nextInt();
	}
//	Opdracht rekentest:
//	Kies moeilijkheidsgraad 1-4
//	1= sommen
//	2= sommen en verschillen
//	3 = sommen en verschillen en producten
//	4 = 3+ quotienten (gehele getallen)

}
