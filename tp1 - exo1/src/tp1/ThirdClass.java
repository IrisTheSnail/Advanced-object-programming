package tp1;

public class ThirdClass extends Thread{
	private int i;
	public void run() {
		for(i=1;i<=60;i++) {
			if( i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Thread coo1 = new FisrtClass();
		Thread coo2 = new SecondClass();
		Thread coo3 = new ThirdClass();
		coo1.start();
		coo2.start();
		coo3.start();
	}
}
