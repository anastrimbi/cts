package ro.ase.csie.cts.g1087.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		GrupCaractereJava grup1 = new GrupCaractereJava("Grup 1");
		grup1.adaugaNod(new CaracterNPC("Soldat 1", 100));
		grup1.adaugaNod(new CaracterNPC("Soldat 2", 100));
		
		GrupCaractereJava grup2 = new GrupCaractereJava("Grup 2");
		grup2.adaugaNod(new CaracterNPC("Soldat 3", 200));
		grup2.adaugaNod(new CaracterNPC("Tanc", 500));
		
		GrupCaractereJava grupNivelJoc = new GrupCaractereJava("Level 2");
		grupNivelJoc.adaugaNod(new CaracterNPC("Level Boss", 1000));
		grupNivelJoc.adaugaNod(grup1);
		grupNivelJoc.adaugaNod(grup2);
		
		grupNivelJoc.atacaJucator("Superman");
		grupNivelJoc.seRetrage();
		grupNivelJoc.getNod(0).seDeplaseaza();
	}

}
