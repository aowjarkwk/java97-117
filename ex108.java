package examples;

//try catch finally 문

public class ex108 {

	public static void main(String[] args) {
		try {
			//예외 발생할 수 잇는 수행문
		}
		catch(Exception e) {
			//예외 처리 수행문
		}
		finally {
			//예외가 발생하든 안하든 무조건 수행하는 수행문
			//왜? 자원(메모리,IO)을 닫아주는 역할
		}
	}

}
