package examples;

import java.util.ArrayList;
import java.util.Collections;

//       프레임워크 > SDK > Lib > APIs

//11장 콜렉션(Collection) 프레임워크(Framework)(뼈대)

//콜렉션 : 모아놓은 것. 봄 신상 콜렉션~
//프레임워크 : 뼈대. 함수(클래스)들의 모임 - 라이브러리, API, SDK 

//데이타구조를 지원하는 클래스모임.
//1.리스트(List) : 순서가 있는 데이터의 모임 <-> 배열(추가,삭제 불편)
//   List(인터페이스)-> 상속해서 ArrayList클래스, LinkedList클래스
//2.맵(Map) : 키(Key)와 값(Value)으로 이루어진 데이터모임(JSON,XML)
//   Map(인터페이스) -> HashMap클래스
//3.집합(Set) : 순서가 없는 데이터의 모임, 중복허용않음
//   Set(인터페이스) -> HashSet클래스

//해쉬(Hash) : 내부데이타간의 연결을 위한 유일한 키(정수) 배열

//리스트

public class ex115 {
	public static void main(String[] args) {
		//제네릭으로 타입설정
		ArrayList<String> fruits = new ArrayList<String>();
		System.out.println(fruits);
		fruits.add("수박");//"수박"
		System.out.println(fruits);
		fruits.add("망고");//"수박","망고"
		System.out.println(fruits);
		fruits.add("딸기");//"수박","망고,"딸기
		System.out.println(fruits);
		
		//맨처음에 추가
		fruits.add(0, "레몬");
		System.out.println(fruits); //[레몬, 수박, 망고, 딸기]
		//바꿔치기
		fruits.set(0, "키위");
		System.out.println(fruits);//[키위, 수박, 망고, 딸기]
		//삭제하기
		fruits.remove(1);
		System.out.println(fruits);//[키위, 망고, 딸기]
		
		//오름차순 정렬
		Collections.sort(fruits);
		System.out.println(fruits);//[딸기, 망고, 키위]
		
		//다 지우기
		fruits.clear();
		System.out.println(fruits);
	}
}