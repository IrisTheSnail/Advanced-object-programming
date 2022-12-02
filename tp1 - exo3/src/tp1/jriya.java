package tp1;

public class jriya {
	
	
	public static void main(String[] args) {
		Runnable Lievre = new Jrrieur("Bunny", 30);
		Runnable Tortue = new Jrrieur("Turtle", 70);
		Thread th_lievre = new Thread(Lievre, "Lievre");
		Thread th_tortue = new Thread(Tortue, "Tortue");
		th_tortue.start();
		th_lievre.start();
		
		
	}
}
