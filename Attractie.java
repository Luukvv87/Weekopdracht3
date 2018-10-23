package Kermis;

abstract class Attractie{
	String naam;
	double prijs;
	double omzet;
	int aantalRitten;
	abstract void draaien();
}

class Botsautos extends Attractie{
	
	Botsautos(){
		naam = "Botsauto's";
		prijs = 2.50;
	}
	
	void draaien() {
		System.out.println("\nDe botsauto's rijden.");
		omzet += prijs;
		aantalRitten++;
		Kermis.totaleOmzet += prijs;
		Kermis.totaalAantalKaartjes++;
	}	
}

class Spin extends RisicoRijkeAttractie{
	
	Spin(){
		naam = "Spin";
		prijs = 2.25;
		draaiLimiet = 5;
	}
	
	void draaien() {
		System.out.println("\nDe spin draait.");
		omzet += prijs;
		aantalRitten++;
		Kermis.totaleOmzet += prijs;
		Kermis.totaalAantalKaartjes++;
		if(aantalRitten % draaiLimiet == 0) {
			opstellingsKeuring();
		}
	}
	
	void opstellingsKeuring() {
		System.out.println("\nTijd voor een keuring.\nDe monteur doet zijn ding..........\nDe spin is gekeurd en kan weer draaien.");
	}	
}

class Spiegelpaleis extends Attractie{
	
	Spiegelpaleis(){
		naam = "Spiegelpaleis";
		prijs = 2.75;
	}
	
	void draaien() {
		System.out.println("\nHet spiegelpaleis is geopend.");
		omzet += prijs;
		aantalRitten++;
		Kermis.totaleOmzet += prijs;
		Kermis.totaalAantalKaartjes++;
	}	
}

class Spookhuis extends Attractie{
	
	Spookhuis(){
		naam = "Spookhuis";
		prijs = 3.20;
	}

	void draaien() {
		System.out.println("\nHet spookhuis griezelt.");
		omzet += prijs;
		aantalRitten++;
		Kermis.totaleOmzet += prijs;
		Kermis.totaalAantalKaartjes++;
	}	
}

class Hawaii extends RisicoRijkeAttractie{
	
	Hawaii(){
		naam = "Hawaii";
		prijs = 2.90;
		draaiLimiet = 10;
	}
	
	void draaien() {
		System.out.println("\nDe hawaii draait.");
		omzet += prijs;
		aantalRitten++;
		Kermis.totaleOmzet += prijs;
		Kermis.totaalAantalKaartjes++;
		if(aantalRitten % draaiLimiet == 0) {
			opstellingsKeuring();
		}
	}
	
	void opstellingsKeuring() {
		System.out.println("\nTijd voor een keuring.\nDe monteur doet zijn ding..........\nDe hawaii is gekeurd en kan weer draaien.");
	}	
}

class Ladderklimmen extends Attractie{
	
	Ladderklimmen(){
		naam = "Ladderklimmen";
		prijs = 5.00;
	}

	void draaien() {
		System.out.println("\nDe ladder wankelt.");
		omzet += prijs;
		aantalRitten++;
		Kermis.totaleOmzet += prijs;
		Kermis.totaalAantalKaartjes++;
	}	
}