package examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex113 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getTime());
		
		//timestamp 
		
		String startDay = "2021-07-01";
		String endDay = "2021-07-06";
		
		try {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			//문자열로부터 시간을 설정할 수 있다.
			Date startDate = sf.parse(startDay);
			Date endDate = sf.parse(endDay);
			
			//시간차가 정수값(밀리세컨드)으로 나옴.
			long diff = endDate.getTime() - startDate.getTime();
			
			//날짜 차이
			long diffDay = diff/(24*60*60*1000);
			System.out.println("D-"+diffDay);
		}
		catch(Exception e) {
			
		}

	}

}
