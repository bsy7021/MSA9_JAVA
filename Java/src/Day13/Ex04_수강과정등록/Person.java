package Day13.Ex04_수강과정등록;

public class Person {
	private String name;

	//생성자
	public Person(String name) {
		this.name = name;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//toString
	@Override
	public String toString() {
		return "Person [" + name + "]";
	}	
}
