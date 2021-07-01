package examples;
//Math 클래스 - 수학적인 계산에 사용.
import java.lang.Math;
public class ex99 {
	public static void main(String[] args) {
		//반올림 - 소숫점 첫째자리에서 0.5이상이면 1로 올린다. 미만이면 버림.
		double num = 91.789;
		System.out.println( Math.round(num) );
		//올림 - 소숫점 첫째자리에서 0보다 크면 1로 올림
		double num2 = 91.128;
		System.out.println( Math.ceil(num2) );
		//버림 - 소숫점 첫째자리에서 이하를 모두 버림
		System.out.println( Math.floor(num2) );
		
		//각도
		//360분위 :45도, 90도
		//라디언 : 각도를 실수로 표현한 값.
		
		//삼각함수 sin, cos, tan 
		//Radian(라디언)은  180 / PI(3.14) 값.
		
		
		
		double a = 10; 
		double b = 10;
		double aa = Math.pow(a, 2);  //제곱근을 구하는 메소드 pow()
		double bb = Math.pow(b, 2);
		double c = Math.sqrt( aa + bb );  //루트근을 구하는 메소드 sqrt()
		double x = c * Math.sin(Math.toRadians(45) ); //각도(degree)를 라디언으로 변경
		System.out.println(x);
		double y = c * Math.cos(Math.toRadians(45) );
		System.out.println(y);
		// 절대값 구하기 : 음수값 -> 양수값, 양수값 -> 양수값
		double abs = Math.abs( -123 );
		System.out.println(abs);
		//두 수중에 큰값을 가져오기
		double max = Math.max(10, 20);
		System.out.println(max);
		max = Math.max(10, Math.max(20, Math.max(30, 40)));
		System.out.println(max);
		//두 수중에 작은값 가져오기
		double min = Math.min(10, 20);
		System.out.println(min);
		//임의의 값 가져오기
		double random = Math.random(); //0.0 <= random < 1.0
		System.out.println(random);
	}
}