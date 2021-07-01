package examples;
//스레드를 만드는 방법 2가지
//첫번째, Thread 추상화클래스를 상속(extends) 받으면 됨.
//두번째, Runnable 인터페이스를 구현(implements) 하면 됨.

class Printer3 implements Runnable{
	int i = 0;
	String name = "이름없음";
	public Printer3(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(this.name + (i++));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ex103 {

	public static void main(String[] args) {
		Printer3 p1 = new Printer3("엡손프린터");
		Thread t1 = new Thread(p1);
		t1.start();
		Printer3 p2 = new Printer3("HP프린터");
		Thread t2 = new Thread(p2);
		t2.start();

	}

}
