package Kermis;

public class BelastingInspecteur {
	double kasbd = 0;
	
	void belastingInnen(Attractie at) {
		kasbd += at.belastingAfdracht;
		Kassa.totaleOmzet -= at.belastingAfdracht;
		Kassa.totaleBelasting += at.belastingAfdracht;
		at.belastingAfdracht = 0;
		Kassa.aantalBezoekenBd++;
	}
}
