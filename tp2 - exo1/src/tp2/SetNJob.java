package tp2;

public class SetNJob extends Thread{
	
	CompteBanque compte;
	int montant;
	
	public SetNJob(CompteBanque compte, int montant) {
		this.compte = compte;
		this.montant = montant;
	}
	
	public void run() {
		demanderRetrait(this.montant);
	}
	
	public void demanderRetrait(int montant) {
		System.out.println(this.compte.getSolde());
		try {
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName() + " reveillé.");
			this.compte.retirer(this.montant);
			System.out.println(Thread.currentThread().getName() + " à compléter le retrait"); 
		}catch(Exception e) {
			System.out.println("Pas assez d’argent pour" + Thread.currentThread().getName());
		}
		
	}
}

/*hm hmmmm fin l mouchkil ? 
 * Bjouj baghiyin ydkhlo l ressource critique, 
 * 
 * 
 * 
 * 
 * */