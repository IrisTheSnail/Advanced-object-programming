package tp2;

public class Work {
	public static void main(String[] args) throws Exception{
		Banque banque = new Banque(100, 1000);
		for (int d = 0; d < 100; d++) {
			Runnable r = new Transfert(banque, d,(int) Math.random()*100, (int)Math.random()*500);
			Thread tt = new Thread(r);
			tt.start();
			System.out.println(banque.soldeTotal());
		}
	}

}

/*
 * Output : 0.0
0.0
0.0
0.0
0.0
843.6778967849453
843.6778967849453
843.6778967849453
1188.3978780814018
 * llkhra =/= 10000
*/
