package examples;

//throws Exception : 예외처리를 떠넘기기
//           예외를 떠넘기기 -> 자신을 호출한 함수나 클래스로 전가

// try catch문을 굳이 안쓰고 싶을때

public class ex107 {
	static public void func() throws Exception {
		
		Exception e = new Exception(); // 예외발생
		throw e;
	}
	
	public static void main(String[] args) {
		try {
			func();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
