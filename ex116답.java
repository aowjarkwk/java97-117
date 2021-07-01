package examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class AscendingInteger implements Comparator<Integer> { 
	@Override 
	public int compare(Integer a, Integer b) { 
		return b.compareTo(a); 
	}
} 
class AscendingString implements Comparator<String> { 
	@Override 
	public int compare(String a, String b) { 
		return b.compareTo(a); //true,false를 통해 디데일한 제어가 가능하다.
	} 
}
public class ex116답 {
	public static void main(String[] args) {
		//ArrayList 연습문제
		//1.names라는 arrayList를 만들고
		//2."홍길동", "사임당", "이순신", "변사또" 추가하고,
		//3.맨앞에 "춘향이" 추가하고
		//4."사임당"삭제하고
		//5.arrayList 갯수 size()함수를 이용하여 출력하고
		//6."홍길동"을 "제임스"로 변경하시오. set함수
		//7.오름차순 정렬 
		//Collections.sort(names);
		//8.내림차순 정렬
		//Collections.sort(integerList, new AscendingInteger()); 
		//Collections.sort(stringList, new AscendingString());
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("사임당");
		names.add("이순신");
		names.add("변사또");
		System.out.println( names );
		names.add(0, "춘향이");
		System.out.println( names );
		names.remove(2);
		System.out.println( names );
		names.set(1, "제임스");
		System.out.println( names );
		//오름차순 정렬
		Collections.sort(names);
		System.out.println( names );
		//내림차순 정렬~
		Collections.reverse(names);
		System.out.println( names );
		Collections.sort(names, new AscendingString());
		System.out.println( names );
	}
}