package Day10.Ex01_Lang;

import java.util.Iterator;

public class StringEx {
	public static void main(String[] args) {
		String str1 = " TheJoEun Academy ";				
		String str2 = " theJoEun Academy ";				
		System.out.println(str1.charAt(2));				//index에 있는 문자 추출
		System.out.println(str1.concat(str2));			//문자열 연결
		System.out.println(str1.contains("Academy"));	//문자열 포함 여부(t/f)
		System.out.println(str1.equals(str2));			//문자열 일치 여부(t/f)
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 구분 없이 일치 여부(t/f)
		System.out.println(str1.indexOf("A"));			//해당 문자의 첫 index 반환, 없으면 -1
		System.out.println(str1.lastIndexOf("e"));		//해당 문자의 마지막 index 반환, 없으면 -1
		System.out.println(str1.trim());				//문자열 양쪽 공백 제거
		System.out.println(str1.length());				//문자열 길이(글자수)[공백포함]
		System.out.println(str1.substring(10));			//index 앞의 문자열을 자르고, 뒤의 문자열 반환
		System.out.println(str1.substring(10, 17));		//index 10번째부터 16번째까지의 문자열을 가져온다.
		
		//split("구분자")		: (구분자)를 기준으로 문자열을 잘라서 배열로 반환
		String[] sp = str1.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + " : \t" + sp[i]);
		}
		System.out.println();
		
		for (int i = 0; i < sp.length; i++) {
			char ch = str1.charAt(i);
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//Strin g.split(정규표현식)
		//: 정규표현식에서 + 기호는 산술연산자가 아닌 다른 의미로 사용
		//	산술연산자 + 로 구분하려면 앞에 \\ 기호를 붙여주어야한다.
		String cal = "10+20";
		String[] num = cal.split("\\+");
		if(cal.contains("+")) {
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			
			int result = a + b;
			System.out.println(result);
		}
		System.out.println("피연산자1 : " + num[0]);
		System.out.println("피연산자2 : " + num[1]);
		
	}
}
