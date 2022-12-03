package tp2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banque {
	final double[] comptes;
	
	Banque(int size, double soldeTotal){
		this.comptes = new double[size];
		for(int i = 0; i < size;i++) {
			comptes[i] = soldeTotal;
		}
	}
	
	////////////////////////
	private Lock bankLock = new ReentrantLock(); //implements Lock interface
	private Condition soldeSuffisant = bankLock.newCondition();
	
	
//	public synchronized void transferer(int de,int vers, double m) throws InterruptedException {
//		while(comptes[de] < m) {
//				// boucle !!
//				System.out.printf(" Solde insuffisant\n");
//				wait(); //attendre
//			}
//		comptes[de] -=m;
//		comptes[vers] +=m;
//		notifyAll(); //notifier les threads en attente
//	}

	public void transferer (int de, int vers, double m) throws InterruptedException {
		bankLock.lock();
		try{ 
			if(comptes[de] < m)
				soldeSuffisant.await();
				//attendre la condition
				comptes[de] -= m;
				comptes[vers] += m;
				soldeSuffisant.signalAll();
				//débloquer les threads attendant la condition
		} finally{
			bankLock.unlock();
		}
	}
	public double soldeTotal() { 
		bankLock.lock();
		try{
			double somme=0;
			for (double c : comptes) {
				somme += c;
			}
			return somme;
		} finally{
			bankLock.unlock();
			}
		}
	
	//////////////////////////////////////////////////////
	
	int size() {
		return this.size();
	}
	
//	double soldeTotal() {
//		double s=0;
//		int size = this.size();
//		for(int i=0; i<size; i++) {
//			s = s+this.comptes[i];
//		}
//		return this.soldeTotal();
//	}
}