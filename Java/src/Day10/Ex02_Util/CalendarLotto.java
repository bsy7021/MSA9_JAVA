package Day10.Ex02_Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
 * 이번 주 로또 추첨 일시를 구해보자.
 * (조건)
 * - 매일 6시~24까지 판매
 * - 추첨일(토요일)에는 오후 8시에 판매 마감
 * - 추첨일(토요일) 오후 8시부터 다음일(일요일) 오전 6시까지 판매 정지
 * 
 * Q. 오늘 날짜/시간을 기준으로 로또를 구매한다면, 추첨일시는 언제인가?
 * 추첨일 : 2024/08/24 21:00:00
 * */
public class CalendarLotto {
	public static void main(String[] args) {
		//객체
		Calendar lot = Calendar.getInstance();
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int mon = sc.nextInt();
		System.out.print("일 : ");
		int sun = sc.nextInt();
		
		
		lot.set(Calendar.MONTH, mon-1);
		lot.set(Calendar.DAY_OF_MONTH, sun);
		
		//현재 [요일, 시간, ampm] //일(1)~토(7)
		int today = lot.get(Calendar.DAY_OF_WEEK);
		int hour = lot.get(Calendar.HOUR);
		int ampm = lot.get(Calendar.AM_PM);	//am(0), pm(1)
		System.out.println("요일 : " + today);
		System.out.println("시간 : " + hour);
		System.out.println("오전오후 : " + ampm);
		//로또구입이 불가한 조건
		//1. 오전 00시 ~ 06시
		//2. 토요일 이면서, 오후 8시 이후
		boolean buyYn = false;
		if(ampm == 0  && hour >= 0 && hour <= 6){
			System.err.println("구입 가능한 시간이아닙니다.");
		}
		else if(today == 7 && ampm == 1 && hour >= 8) {
			System.err.println("구입 가능한 시간이아닙니다.");
		}
		else {
			buyYn = true;
		}
		
		//구입일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		String 구입일 = sdf.format(lot.getTime());
		System.out.println("구입일 : " + 구입일);
		
		//추첨일 시간은 고정값 : 오후 9시, 0분 0초
		lot.set(Calendar.AM_PM, 1);
		lot.set(Calendar.HOUR, 9);
		lot.set(Calendar.MINUTE, 0);
		lot.set(Calendar.SECOND, 0);
		
		//추첨일 계산
		//토요일(7)과 현재 요일의 차이만큼 현재 요일에 차이를 더해준다
		//ex) 목(5) + (7-5) = 7
		if(buyYn) {
			lot.add(Calendar.DATE, 7-today);
			String 추첨일 = sdf.format(lot.getTime());
			System.out.print("추첨일 : " + 추첨일);
		}
		else {
			System.err.println("구입 가능한 시간에 다시오세요.");
		}
	}
}
