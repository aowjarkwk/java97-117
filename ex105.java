package examples;
//예외처리 : ArithmeticException - 어떤 수를 0으로 나눌때 
//         : InterruptedException - 인터렙트 (가로채기) 예외
public class ex105 {
	public static void main(String[] args) {
		try {
			int i = 10;
			int j = 0;
			System.out.println( i / j );
		}
		catch( ArithmeticException e ) {
			System.out.println( e.getMessage() ); //예외 이름을 출력
			e.printStackTrace();  // 발생경로 출력
		}
		try {
			Thread.sleep(1000);
		}
		catch( InterruptedException e ) { //인터렙트 예외 처리
			e.printStackTrace();
		}
		catch( ArithmeticException e ) { //산술 예외 처리
			e.printStackTrace();
		}
		catch( ArrayIndexOutOfBoundsException e ) { //배열 인덱스를 벗어났을 때
			e.printStackTrace();
		}
		catch( Exception e ) { //그외의 예외 처리
			e.printStackTrace();
		}
	}
}