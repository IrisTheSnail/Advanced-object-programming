package tp2;

public class Work {

	public static void main(String[] args) {
		int s = 4000;
		CompteBanque compteNamiSanji = new CompteBanque(5000);
		
		SetNJob NamiEtSanji= new SetNJob(compteNamiSanji, 4000);
		
		Thread th_Sanji = new Thread(NamiEtSanji, "Sanji");
		Thread th_Nami = new Thread(NamiEtSanji, "Nami");
		th_Sanji.start();
		th_Nami.start();
		
		
	}

}
