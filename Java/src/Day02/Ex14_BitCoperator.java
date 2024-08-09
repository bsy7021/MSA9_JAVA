package Day02;

public class Ex14_BitCoperator {
	public static void main(String[] args) {
		// AND
		int result = 20 & 16;
		
		//Interger.toBinaryString() : 십진수를 이진수로 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));//10100
		System.out.println(Integer.toBinaryString(16));//10000
		System.out.println("-----");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		int result2 = 20 | 16;
		System.out.println(Integer.toBinaryString(20));//10100
		System.out.println(Integer.toBinaryString(16));//10000
		System.out.println("-----");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		//XOR
		//: 서로 값이 다르면 1(true), 같으면 0(false)
		int result3 = 20 ^ 16;
		System.out.println(Integer.toBinaryString(20));//10100
		System.out.println(Integer.toBinaryString(16));//10000
		System.out.println("-----");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
	}
}
