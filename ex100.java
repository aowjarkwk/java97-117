package examples;
//래퍼클래스(Wrapper Class) : Primitive(기본) 자료형(8개)을 감싼 클래스
//                          : 기능을 추가하기 위해서
//정수형 int, long, short, byte 
//실수형 float, double
//문자형 char
//논리형 boolean
//int->Integer, long->Long, short->Short, byte->Byte
//float->Float, double->Double
//char->Character
//boolean->Boolean
//Number <- ( Integer, Float, Double,  Byte, Short, Long )
public class ex100 {
	public static void main(String[] args) {
		
		int i = 10; //기본형, 기능확장이 안됨.
		
		//기능확장 + 객체타입으로 형변환도 가능
		Integer intValue1 = new Integer( 10 );
		System.out.println(intValue1);
		System.out.println(intValue1.intValue());
		System.out.println(intValue1.floatValue());
		
		Integer intValue2 = 20;
		System.out.println(intValue2);
		
		Number number = 10;
		System.out.println(number.intValue());
		System.out.println(number.doubleValue());
	}
}