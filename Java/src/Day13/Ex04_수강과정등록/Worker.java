package Day13.Ex04_수강과정등록;

public class Worker extends Person{
	
	//생성자
	public Worker(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Worker [" + this.getName() + "]";
	}
	
	

}
