package fase2;

public class fase2 {
	public static void main(String[] args) {
//		FASE 2
//		Sabent que l�any 1948 es un any de trasp�s:
//		Creeu una constant amb el valor de l�any (1948).
//		Creeu una variable que guardi cada quan hi ha un any de trasp�s.
//		Calculeu quants anys de trasp�s hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el
//		valor resultant en una variable.
//		Mostreu per pantalla el resultat del c�lcul.

		final int anyTraspas = 1948;
		int interval = 4;
		int anyNaixement = 1995;
		int numAnysTraspas = 0;

		for (int i = anyTraspas; i <= anyNaixement; i += interval) {
			numAnysTraspas++;
		}
		System.out.println(
				"el nombre d'anys de trasp�s entre " + anyTraspas + " i " + anyNaixement + " �s: " + numAnysTraspas);
	}

}
