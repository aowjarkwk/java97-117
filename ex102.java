package examples;

class Printer2 extends Thread{
	int i = 0;
	String name = "이름없음";
	public Printer2(String name) { // 생성자에서 이름을 넣어준다.
		this.name = name;
	}
	@Override
	public void run() { // 추상클래스에서 추상메소드(가상함수)를 재정의함.
		while(true) {
			System.out.println(this.name+(i++));
			try {
				Thread.sleep(1000); //1초 쉰다.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

public class ex102 {

	public static void main(String[] args) {
		Printer2 p1 = new Printer2("엡손프린터");
		p1.start();
		Printer2 p2 = new Printer2("HP프린터");
		p2.start();
	}

}
