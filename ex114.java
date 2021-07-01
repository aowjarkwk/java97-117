package examples;
import java.util.Calendar;
import java.util.Date;
public class ex114 {
	public static void main(String[] args) {
		// 두날짜 사이의 차이를 구하기(DDay)
		// 자동으로 그레고리력으로 가져옴.(언어설정)
		Calendar startCal = Calendar.getInstance();
		Calendar endCal = Calendar.getInstance();
		startCal.set(2021,6,1);//0은 1월  6은 7월
		endCal.set(2021,6,6);
		//startCal.setTime(new Date()); //현재시간으로 설정
		try {
			//시간차이를 long 정수값으로 가져옴.
			//밀리세컨드단위의 정수값.
			long diff = endCal.getTimeInMillis() - startCal.getTimeInMillis();
			//millisecond를 day(24시간)바꿈.
			long diffDays = diff/(24*60*60*1000);
			System.out.println("날짜차이는"+diffDays);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//연습문제 - DM으로 제출
		//회사에서 2021년 12월 25일 성탄절 기념으로 이벤트를 하려고 한다.
		//오늘 날짜기준으로 12월 25일까지 며칠이 남았는지 출력하시오.
		//출력형식 : "이벤트데이까지 *일 남았습니다!"
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		//start.set(2021,00,27); //달은 0부터 시작
		start.setTime(new Date()); //현재날짜 설정
		end.set(2021,11,25); //달은 0부터 시작
		try {
			long a = end.getTimeInMillis() - start.getTimeInMillis();
			long Dday = a/(24*60*60*1000);
			System.out.println("이벤트데이까지 "+Dday+"일 남았습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}