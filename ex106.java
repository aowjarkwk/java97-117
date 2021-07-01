package examples;

//throw new Exception : 예외를 일부러 발생시킴.

public class ex106 {

	public static void main(String[] args) {

		try {
			int countToy=5;
			if(countToy>3) { //값이 이상하다?
				throw new Exception();
			}
			//프로그램 흐름 제어
			//return:함수 밖으로 나감
			//break:반복문 밖으로 나감
			//continue:해당회차(루프)를 나감 ->증감문으로(반복문의 처음으로)으로 간다.
		}
		catch(Exception e) {
			System.out.println("장난감의 갯수가 3을 넘어섰음.");
			e.printStackTrace();
		}
	}

}
