package tp1;

public class SecondClass extends Thread{
	private int i = 0;
	public void run() {
		for(i=65;i<=81;i++) {
			System.out.println((char)i);
		}
	}
}
