package Kermis;

import java.util.Scanner;

public class Kermis {
	static double totaleOmzet = 0;
	static int totaalAantalKaartjes = 0;
	static Attractie[] attracties = {new Botsautos(), new Spin(), new Spiegelpaleis(), new Spookhuis(), new Hawaii(), new Ladderklimmen()};
		void starten() {


			boolean blijven = true;
			
			System.out.println("Welkom op de kermis! Kies een attractie:");
			while(blijven) {
				System.out.println("\n1. Botsauto's\n2. Spin\n3. Spiegelpaleis\n4. Spookhuis\n5. Hawaii\n6. Ladderklimmen");
				System.out.println("\no. Toon totale omzet\nk. Toon totaal verkochte kaartjes\nq. Verlaat de kermis");
				
				Scanner scanner = new Scanner(System.in);
				String keuze = scanner.nextLine();
				switch (keuze) {
					case "1":
						attracties[0].draaien();
						break;
					case "2":
						attracties[1].draaien();
						break;
					case "3":
						attracties[2].draaien();
						break;
					case "4":
						attracties[3].draaien();
						break;
					case "5":
						attracties[4].draaien();
						break;
					case "6":
						attracties[5].draaien();
						break;
					case "o":
						System.out.println("\nOmzet:\n");
						toonTotaleOmzet();
						break;
					case "k":
						System.out.println("\nVerkochte kaartjes:\n");
						toonVerkochteKaartjes();
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
		
		void toonTotaleOmzet() {
			System.out.println(attracties[0].naam + ":\t" + attracties[0].omzet);
			System.out.println(attracties[1].naam + ":\t\t" + attracties[1].omzet);
			System.out.println(attracties[2].naam + ":\t" + attracties[2].omzet);
			System.out.println(attracties[3].naam + ":\t" + attracties[3].omzet);
			System.out.println(attracties[4].naam + ":\t\t" + attracties[4].omzet);
			System.out.println(attracties[5].naam + ":\t" + attracties[5].omzet);
			System.out.println("=====================\nTotaal:\t\t" + totaleOmzet);
		}
		
		void toonVerkochteKaartjes() {
			System.out.println(attracties[0].naam + ":\t" + attracties[0].aantalRitten);
			System.out.println(attracties[1].naam + ":\t\t" + attracties[1].aantalRitten);
			System.out.println(attracties[2].naam + ":\t" + attracties[2].aantalRitten);
			System.out.println(attracties[3].naam + ":\t" + attracties[3].aantalRitten);
			System.out.println(attracties[4].naam + ":\t\t" + attracties[4].aantalRitten);
			System.out.println(attracties[5].naam + ":\t" + attracties[5].aantalRitten);
			System.out.println("===================\nTotaal:\t\t" + totaalAantalKaartjes);
		}
		
}




