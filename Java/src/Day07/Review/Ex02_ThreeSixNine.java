package Day07.Review;

public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
		//정수 1~100까지 수를 반복하여 출력하면서,
		//해당 수가 3 또는 6 또는 9가 될때는
		//자리수마다 369가 되는 개수 만큼 정수 대신 "*" 출력하는 프로그램을 작성하시오.


		for (int i = 1; i <= 100; i++) {
			//십의 자리수 : 해당수(i) / 10
			//일의 자리수 : 해당수(i) % 10
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			boolean one369 = one == 3 || one == 6 || one == 9;
			
			if(ten369 && one369) System.out.println("**");
			else if(ten369 || one369) System.out.println("*");
			else System.out.println(i);
		}
	}
}
