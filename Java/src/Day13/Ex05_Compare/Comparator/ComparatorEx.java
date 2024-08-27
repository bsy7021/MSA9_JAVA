package Day13.Ex05_Compare.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 1. Comparator 인터페이스를 구현
 * 2. compare() 메소드 오버라이딩
 * 	  - 정렬 기준1 : 나이 순 오름차순
 * 	  - 정렬 기준2 : 이름 순 내림차순
 * */
class User implements Comparator<User>{
	String id;
	String name;
	int age;
	
	public User() {
		this("-", "-", 0);
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		//정렬 기준1 : 나이순(오름차순)
		//정렬 기준2 : 이름순(내림차순)
		
		//o1 : 해당객체
		//o2 : 비교할객체
		
		//1.각 객체의 나이를 가져와서 age1, age2로 선언
		//2.각 객체의 이름을 가져와서 name1, name2로 선언
		
		//정렬 로직 작성
		//o1이 더 큰 객체 -> 양수
		//o1이 더 작은 객체 -> 음수
		//o1과 o2 같은 객체 -> 0
		
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		//방법 1
		//정렬 기준1 : 나이순(오름차순)
//		if(age1>age2) return 1;
//		if(age1<age2) return -1;
//		if(age1==age2) {
//			//정렬 기준2 : 이름순(내림차순)
//			int gap = name1.compareTo(name2);
//			//name1 더 큰 값(사전순으로 더 뒤) : 양수(+)
////			if(gap>0) return -1;
////			if(gap<0) return 1;
////			if(gap==0) return 0;
//			return -gap;
//		}
		
		//방법 2
		int result = age1 - age2;				//정렬기준1 나이순↑
		int result2 = name1.compareTo(name2);	//정렬기준2 이름순↓
		//나이가 같은 경우에만 정렬기준2 이름순을 적용
//		if(result == 0) return -result2;
		return result == 0 ? -result2 : result;
	}
	
}

public class ComparatorEx {
	public static void main(String[] args) {
		List<User> userList = Arrays.asList(
			new User("rung1004", "장렁환", 31),
			new User("ssung4885", "썽이", 25),
			new User("yabi1234", "야비환", 31),
			new User("haeun564", "장하은", 31),
			new User("hwaneun584", "하은환", 21),
			new User("jjang567", "짱성환", 20),
			new User("ssug2", "장썽이", 43),
			new User("hwan2", "장썽환", 55)
		);
		
		//정렬 전
		System.out.println("* 정렬 전");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("----------------------------------------");
		
		//정렬
		Collections.sort(userList, new User());
		
		//정렬 후
		System.out.println("* 정렬 후");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("----------------------------------------");
		
		List<User> userList2 = Arrays.asList(
				new User("rung1004", "장렁환", 31),
				new User("ssung4885", "썽이", 25),
				new User("yabi1234", "야비환", 31),
				new User("haeun564", "장하은", 31),
				new User("hwaneun584", "하은환", 21),
				new User("jjang567", "짱성환", 20),
				new User("ssug2", "장썽이", 43),
				new User("hwan2", "장썽환", 55)
		);
		
		//Collections.sort(컬렉션, 정렬기준객체);
		//* 익명구현객체를 사용하여 이 시점에서 정렬기준 적용 가능
		Collections.sort(userList2, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				String id1 = o1.getId();
				String id2 = o2.getId();
				int result = id1.compareTo(id2);
				return result;
			}
		});
		System.out.println("아이디순 오름차순");
		for (User user : userList2) {
			System.out.println(user);
		}
	}
}
