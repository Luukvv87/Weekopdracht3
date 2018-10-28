package Kermis;

public class Kassa {
	static double totaleOmzet;
	static double totaleBelasting;
	static int totaalAantalKaartjes;
	static int aantalBezoekenBd;
	
	static void toonTotaleOmzet() {
		System.out.println(Kermis.attracties[0].naam + ":\t" + Kermis.attracties[0].omzet);
		System.out.println(Kermis.attracties[1].naam + ":\t\t" + Kermis.attracties[1].omzet);
		System.out.println(Kermis.attracties[2].naam + ":\t" + Kermis.attracties[2].omzet);
		System.out.println(Kermis.attracties[3].naam + ":\t" + Kermis.attracties[3].omzet);
		System.out.println(Kermis.attracties[4].naam + ":\t\t" + Kermis.attracties[4].omzet);
		System.out.println(Kermis.attracties[5].naam + ":\t" + Kermis.attracties[5].omzet);
		System.out.println("=====================\nTotaal:\t\t" + Kassa.totaleOmzet);
	}
	
	static void toonVerkochteKaartjes() {
		System.out.println(Kermis.attracties[0].naam + ":\t" + Kermis.attracties[0].aantalRitten);
		System.out.println(Kermis.attracties[1].naam + ":\t\t" + Kermis.attracties[1].aantalRitten);
		System.out.println(Kermis.attracties[2].naam + ":\t" + Kermis.attracties[2].aantalRitten);
		System.out.println(Kermis.attracties[3].naam + ":\t" + Kermis.attracties[3].aantalRitten);
		System.out.println(Kermis.attracties[4].naam + ":\t\t" + Kermis.attracties[4].aantalRitten);
		System.out.println(Kermis.attracties[5].naam + ":\t" + Kermis.attracties[5].aantalRitten);
		System.out.println("===================\nTotaal:\t\t" + Kassa.totaalAantalKaartjes);
	}
}
