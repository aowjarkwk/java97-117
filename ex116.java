package examples;

import java.util.ArrayList;
import java.util.Collections;

public class ex116 {

	public static void main(String[] args) {//ArrayList 연습문제
		//1.names라는 arrayList를 만들고
		ArrayList<String> names = new ArrayList();
		//2."홍길동", "사임당", "이순신", "변사또" 추가하고,
		names.add("홍길동");
		names.add("사임당");
		names.add("이순신");
		names.add("변사또");
		//3.맨앞에 "춘향이" 추가하고

		names.add(0, "춘향이");
		//4."사임당"삭제하고

		names.remove(2);
		//5.arrayList 갯수 size()함수를 이용하여 출력하고

		System.out.println(names.size());
		//6."홍길동"을 "제임스"로 변경하시오. set함수

		names.set(1, "제임스");
		//7.오름차순 정렬 
		//Collections.sort(names);

		Collections.sort(names);
		//8.내림차순 정렬
		System.out.println(names);
		//Collections.sort(integerList, new AscendingInteger());
		//Collections.sort(stringList, new AscendingString());
		Collections.reverse(names);
		System.out.println(names);
		
	}

}
