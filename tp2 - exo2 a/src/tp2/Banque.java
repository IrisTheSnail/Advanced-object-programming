package tp2;

public class Banque {
	final double[] comptes;
	
	Banque(int size, double soldeTotal){
		this.comptes = new double[size];
		for(int i = 0; i < size;i++) {
			comptes[i] = soldeTotal;
		}
	}
	
	int size() {
		return this.size();
	}
	
	double soldeTotal() {
		double s=0;
		int size = this.size();
		for(int i=0; i<size; i++) {
			s = s+this.comptes[i];
		}
		return this.soldeTotal();
	}
	
	static double s=0;
	
	public void transferer(int qui, int depuis, double combien){
		if(this.comptes[depuis] >= combien) {
			this.comptes[depuis] = this.comptes[depuis] - combien;
			this.comptes[qui] = this.comptes[qui] + combien;
			s = s+this.comptes[qui];
		}
	}
}