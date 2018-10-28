package Kermis;

public interface GokAttractie {
	public default void kansSpelBelastingBetalen(Attractie at) {
		at.belastingAfdracht += (at.prijs * 0.3);
	}
}
