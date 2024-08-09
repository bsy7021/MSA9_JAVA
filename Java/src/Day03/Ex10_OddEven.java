package Day03;

public class Ex10_OddEven {
	public static void main(String[] args) {
		//1~20 까지 정수 중 홀수의 합계, 짝수의 합계를 각각 구하시오.
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while(a<=20) {
			if(a%2==1)
				sum1 += a;
			else
				sum2 += a;
			a++;
		}
		System.out.println("홀수의 합계 : " + sum1);
		System.out.println("짝수의 합계 : " + sum2);
	}
}
