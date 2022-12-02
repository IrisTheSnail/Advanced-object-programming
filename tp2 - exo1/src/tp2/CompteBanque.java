package tp2;

public class CompteBanque {
	private int solde;
	
	public CompteBanque(int solde) {
		this.solde = solde;
	}
	
	int getSolde() {
		return this.solde;
	}
	
	public void retirer(int montant){
		if(this.solde < montant) {
			 throw new ArithmeticException("Pas assez d’argent pour "+Thread.currentThread().getName());
	}else {
		System.out.println(Thread.currentThread().getName() + " est sur le point de retirer."); 
		this.solde = this.solde-montant;
		System.out.println("Current solde :"+this.solde);
		
	}
	}
}
