package Day10.Ex02_Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		//현재 날짜/시간 정보로 객체 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		//날짜 형식을 지정하는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		//sdf.format(Date 객체)
		//*지정한 날짜 형식에 맞게 Date 객체의 날짜/시간 정보를 문자열로 반환하는 메소드
		String today = sdf.format(cal.getTime());
		System.out.println("현재 날짜/시간 : " + today);
		
		//현재 날짜/시간부터 N시간, N일 후는 언제인지?
		//10분 후
		cal.add(cal.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println("10분 후 : " + after10Min);
		
		//1시간 후
		cal.add(cal.HOUR, 1);
		String after1hour = sdf.format(cal.getTime());
		System.out.println("1시간 후 : " + after1hour);

		//1일 후
		cal.add(cal.DAY_OF_MONTH, 1);
		String after1day = sdf.format(cal.getTime());
		System.out.println("1일 후 : " + after1day);
		
		//18일 전
		cal.add(cal.DAY_OF_WEEK, -18);
		String before12day = sdf.format(cal.getTime());
		System.out.println("18일 전 : " + before12day);
		
		//50일 전(add)
		cal.add(cal.DAY_OF_WEEK, -50);
		String before50day = sdf.format(cal.getTime());
		System.out.println("50일 전 : " + before50day);
		
		//50일 전(roll)
		Calendar cal2 = Calendar.getInstance();
		cal2.roll(cal.DAY_OF_WEEK, -50);
		String before50day2 = sdf.format(cal2.getTime());
		System.out.println("50일 전 : " + before50day2);
		
		//add(날짜필드, 값)		: 해당 날짜 데이터에서 날짜 필드의 값을 증감시키는 메소드
		//roll(날짜필드, 값)	: 해당 날짜 데이터에서 날짜 필드의 값을 증감시키는 메소드
		//					* 상위 날짜 필드에 영향을 주지 않는다.
	}
}
