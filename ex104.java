package examples;
//예외처리 ( Exception Handling ) : 예측가능한 에러를 최대한 처리해 준다.
//try catch문 (finally)
//try {
//  예외가 일어날수 있는 실행문
//}
//catch( 예외발생 객체 ) {
//   예외처리하는 실행문
//}
public class ex104 {
	public static void main(String[] args) {
//		String name = null; // null 값이 없음을 의미.
//		System.out.println(name.toLowerCase());
		
		try {
			String name = null;
			System.out.println(name.toLowerCase());
		}
		catch(NullPointerException e) {
			System.out.println("널포인트 에러발생!");
			e.printStackTrace(); //에러발생 경로를 출력
		}
	}
}