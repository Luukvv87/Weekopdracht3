package Kermis;

abstract class Attractie{
	String naam;
	double prijs;
	double omzet, belastingAfdracht;
	int aantalRitten;
	
	void draaien(Attractie at) {
		System.out.println("\nDe attractie " + naam + " draait.");
		omzet += prijs;
		aantalRitten++;
		Kassa.totaleOmzet += prijs;
		Kassa.totaalAantalKaartjes++;
		
		if(at instanceof RisicoRijkeAttractie) {
			try {
				((RisicoRijkeAttractie)at).onderhoudsBeurt();
			} catch (OnderhoudNodig oh){
				System.out.println("\nTijd voor een onderhoudsbeurt...\nDruk m om een monteur te laten komen");
				String keuze = Kermis.scanner.nextLine();
				if(keuze.equals("m")) {
					System.out.println("\nDe monteur heeft zijn werk gedaan en de " + naam + " kan weer draaien.");					
				} else {
					System.out.println("\nHet wachten is op de monteur...");
				}
			}
		}
		
		if (at instanceof GokAttractie) {
			((GokAttractie) at).kansSpelBelastingBetalen(at);
		}
	}
}

class Botsautos extends Attractie{
	
	Botsautos(){
		naam = "Botsauto's";
		prijs = 2.50;
	}
}

class Spin extends RisicoRijkeAttractie{
	
	Spin(){
		naam = "Spin";
		prijs = 2.25;
		draaiLimiet = 5;
	}
}

class Spiegelpaleis extends Attractie{
	
	Spiegelpaleis(){
		naam = "Spiegelpaleis";
		prijs = 2.75;
	}
}

class Spookhuis extends Attractie{
	
	Spookhuis(){
		naam = "Spookhuis";
		prijs = 3.20;
	}
}

class Hawaii extends RisicoRijkeAttractie{
	
	Hawaii(){
		naam = "Hawaii";
		prijs = 2.90;
		draaiLimiet = 10;
	}
}

class Ladderklimmen extends Attractie implements GokAttractie{
	
	Ladderklimmen(){
		naam = "Ladderklimmen";
		prijs = 5.00;	
	}
}