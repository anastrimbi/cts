package ro.ase.csie.cts.g1087.dp.strategy;

public class ProfilPlayer {

	String usrename;
	double playTime;
	int nrNiveluri;
	
	InterfataBonus strategieBonus = null;
	
	public ProfilPlayer(String usrename, double playTime, int nrNiveluri) {
		super();
		this.usrename = usrename;
		this.playTime = playTime;
		this.nrNiveluri = nrNiveluri;
	}
	
	public void setStrategieBonus(InterfataBonus strategie) {
		this.strategieBonus = strategie;
	}
	
	public void getBonus() {
		if(this.strategieBonus != null) {
			int puncteBonus = this.strategieBonus.getPuncteBonus(this);
			System.out.println("Ai primit puncte bonus " + puncteBonus);
		}
		else {
			throw new UnsupportedOperationException();
		}
	}
	
}
