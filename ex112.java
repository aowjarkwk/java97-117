package examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ex112 {

	public static void main(String[] args) {

		Calendar cal = new GregorianCalendar(Locale.KOREA); //GMT +9
		
		cal.setTime(new Date());
		echoTime(cal);
		
		//시간간격 구하기
		//10시간 후
		cal.add(Calendar.HOUR, 10);
		echoTime(cal);
		//10시간 전
		cal.add(Calendar.HOUR, -20);
		echoTime(cal);
		//10일 후
		cal.add(Calendar.DAY_OF_YEAR, 10);
		echoTime(cal);
		//1달 후
		cal.add(Calendar.MONTH, 1);
		echoTime(cal);
		//1년 후 
		cal.add(Calendar.YEAR, 1);
		echoTime(cal);
	}
	static void echoTime(Calendar cal) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strTime = sf.format(cal.getTime());
		System.out.println(strTime);
	}
}
