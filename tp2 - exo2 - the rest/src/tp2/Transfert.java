package tp2;

public class Transfert implements Runnable{
	int d;
	int depuis;
	double combien;
	Banque banque;

	Transfert(Banque banque, int comptes, int depuis, double combien){
		this.banque = banque;
		this.d = comptes;//d == a qui donne
		this.depuis = depuis;//depuis == qui donne
		this.combien = combien;
	}
	
	@Override
	public void run() {
		try {
			this.banque.transferer(d, depuis, combien);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
