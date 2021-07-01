package examples;
//스레드 ( Thread ) : 실 , 프로그램 안의 작은 프로그램.
//                  : 메인쓰레드 외에 별도의 쓰레드를 만드는 것.

//스레드를 만드는 방법 2가지
//첫번째, Thread 추상화클래스를 상속(extends) 받으면 됨.
//두번째, Runnable 인터페이스를 상속(implements) 받으면 됨.

class Printer extends Thread{
	int i = 0;
	@Override
	public void run() {
		
		while(true) {
			System.out.println( "Printer:"+(i++));
			
			if(i>10) {
				break;
			}
		}
	}
	
}

public class ex101 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.start();
		System.out.println("메인함수 완료!");
	}
}