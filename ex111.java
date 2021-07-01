package examples;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
public class ex111 {
	public static void main(String[] args) {
		//날짜와 시간
		//Date 약한 수준의 기능을 제공
		//Calendar 고기능을 제공.
		//오늘(2018/11/22)로부터 50일후를 날짜를 구하라.
		//11월 29/30/31? 윤년?
		//태국을 제외한 모든 나라에서, 그레고리력을 씀.
		//태국은 BuddhistCaledar클래스를 사용함.
		//jdk documentation 1.8 GregorianCalendar 검색
		Calendar calendar =  new GregorianCalendar(Locale.KOREA);
		System.out.println( calendar.getTime() );
		int year = calendar.get(Calendar.YEAR);
		//1월은 0부터 시작함!!
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		//요일
		//1 일, 2 월, 3 화 ,4 수 ,5 목 ,6 금 ,7 토
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		//한해의 몇주차냐?
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		//한달의 몇주차냐?
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		//12시간
		int hour = calendar.get(Calendar.HOUR);
		//24시간
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		System.out.println("year:"+year);
		System.out.println("month:"+(month+1));
		System.out.println("dayOfMonth:"+dayOfMonth);
		System.out.println("dayOfWeek:"+dayOfWeek);
		System.out.println("weekOfYear:"+weekOfYear);
		System.out.println("weekOfMonth:"+weekOfMonth);
		System.out.println("hour:"+hour);
		System.out.println("hourOfDay:"+hourOfDay);
		System.out.println("minute"+minute);
		System.out.println("second:"+second);
		System.out.println("millisecond:"+millisecond);
	}
}