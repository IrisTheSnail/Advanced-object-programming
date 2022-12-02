package tp1;

public class Jrrieur extends Thread{
	public static final int finals = 100;
	public int vit;
	private int pas = 0;
	public String name;
	
	public Jrrieur(String name, int vit) {
		this.name = name;
		this.vit = vit;
	}
	
	public void run() {
		while(pas <=100) {
			pas++;
			System.out.println(this.name + "was here, at" + this.pas);
			try {
				Jrrieur.sleep(this.vit);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
	}
}
