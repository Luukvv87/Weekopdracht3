package Kermis;

import java.util.Scanner;

public class Kermis {
	static Attractie[] attracties = {new Botsautos(), new Spin(), new Spiegelpaleis(), new Spookhuis(), new Hawaii(), new Ladderklimmen()};
	static Scanner scanner = new Scanner(System.in);	
	void starten() {
		for(int i = 0; i < attracties.length; i++) {
			if(attracties[i] instanceof RisicoRijkeAttractie) {
				((RisicoRijkeAttractie) attracties[i]).opstellingsKeuring();
			}
		}	
		boolean blijven = true;	
		System.out.println("\nWelkom op de kermis! Kies een attractie:");
		while(blijven) {
		System.out.println("\n1. Botsauto's\n2. Spin\n3. Spiegelpaleis\n4. Spookhuis\n5. Hawaii\n6. Ladderklimmen");
		System.out.println("\no. Toon totale omzet\nk. Toon totaal verkochte kaartjes\nq. Verlaat de kermis");
		String keuze = scanner.nextLine();
			switch (keuze) {
				case "1":
					attracties[0].draaien(attracties[0]);
					break;
				case "2":
					attracties[1].draaien(attracties[1]);
					break;
				case "3":
					attracties[2].draaien(attracties[2]);
					break;
				case "4":
					attracties[3].draaien(attracties[3]);
					break;
				case "5":
					attracties[4].draaien(attracties[4]);
					break;
				case "6":
					attracties[5].draaien(attracties[5]);
					break;
				case "o":
					System.out.println("\nOmzet:\n");
					Kassa.toonTotaleOmzet();
					break;
				case "k":
					System.out.println("\nVerkochte kaartjes:\n");
					Kassa.toonVerkochteKaartjes();
					break;
				case "q":
					blijven = false;
					System.out.println("\nTot de volgende keer!");
					break;
				default:
					System.out.println("\nMaak een keuze.\n");
					break;			
			}
		}	
	}		
}
