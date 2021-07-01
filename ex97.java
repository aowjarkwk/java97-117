package examples;
//StringBuffer : 문자열을 좀더 유연하게 처리하는 클래스
//             : 추가(append),삽입(insert),삭제(delete)
//StirngBuilder : 조금 속도를 빠르게 한 StringBuffer인데, 큰차이없음.
public class ex97 {
	public static void main(String[] args) {
		//문자열형 String에서 추가 + 연산자
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println( sb );
		
		sb.insert(5, "___");
		System.out.println(sb);
		sb.delete(2, 3);
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("abc");
	}
}