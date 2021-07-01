package examples;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ex110 {
	public static void main(String[] args) {
		//날짜와 시간 관련된 클래스
		//
		//인간의 주배경 : 시간-년월일시분초, 정수값(1970-1-1 0:0:0 - timestamp) 
		//                장소-행정주소(노원구 상계동), GPS좌표-위도,경도
		//현재시간을 운영체제OS에서 가져온다.
		Date date = new Date();
		System.out.println( date );
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");//y:연도 M:달 d:날짜 h:시간 m:분	s:초
		
		String dataFormat = sdf.format(date);
		System.out.println(dataFormat);
		//H:24시간
		//h:오전 오후 12시간
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String dataFormat2 = sdf2.format(date);
		System.out.println(dataFormat2);
		
SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		
		String dataFormat3 = sdf3.format(date);
		System.out.println(dataFormat3);
		
		
		}
}
