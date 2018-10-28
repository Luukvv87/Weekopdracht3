package Kermis;

abstract class RisicoRijkeAttractie extends Attractie{
	int draaiLimiet;
	
	void opstellingsKeuring() {
		System.out.println("De " + naam + " is goedgekeurd.");
	}
	
	void onderhoudsBeurt() throws OnderhoudNodig {
		if(aantalRitten % draaiLimiet == 0) { 
			throw new OnderhoudNodig();
		}
	}
}

class OnderhoudNodig extends Exception{
	
}
