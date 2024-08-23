package Day13.Ex02_Collection;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//Vector 생성
		//- 학생 목록
		Vector<String> studentList = new Vector<String>();
		
		//요소 추가 - add()
		studentList.add("황상건");
		studentList.add("곽라리");
		studentList.add("장렁환");
		studentList.add("런성록");
		studentList.add("오박사");
		
		System.out.println(":::: 학생 목록 ::::");
		System.out.println(studentList);
		System.out.println("-----------------");
		
		//요소 제거 - remove()
		studentList.remove("오박사");
		studentList.remove(1);
		
		System.out.println(":::: 요소 제거 ::::");
		System.out.println(studentList);
		System.out.println("-----------------");
		
		//요소 접근 - get()
		String firstStudent = studentList.get(0);
		System.out.println("첫번째 학생 : " + firstStudent);
		
		//요소 개수 - size()
		int size = studentList.size();
		System.out.println("남은 학생 수 : " + size);
		
		//모든 요소 제거 - clear()
		studentList.clear();
		System.out.println(":::: 모두 제거 ::::");
		System.out.println(studentList);
		System.out.println("-----------------");
		
		//요소 전체 추가 - addAll()
		Vector<String> 야근반 = new Vector<String>();
		야근반.add("조바벗");
		야근반.add("리동판");
		studentList.addAll(야근반);
		
		System.out.println(":::: 요소 전체 추가 ::::");
		System.out.println(studentList);
		System.out.println("-----------------");
	}
}
