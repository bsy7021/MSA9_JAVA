package Day13.Ex04_수강과정등록;

import java.util.ArrayList;
import java.util.List;

public class Academy {
	public static void main(String[] args) {
		//일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("야비환"));
		personList.add(new Worker("장렁환"));
		personList.add(new Student("장썽환"));
		personList.add(new HighStudent("조은환"));
		personList.add(new MiddleStudent("장떵환"));
		Course<Person> personCourse = new Course<Person>(personList);
		personCourse.createCourse("일반인과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		//직장인 과정 생성
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add(new Worker("군뭔장"));
		workerList.add(new Worker("야비장"));
		workerList.add(new Worker("썽이장"));
		workerList.add(new Worker("떵환장"));
		Course<? super Worker> wrokerCourse = new Course<>(workerList);
		Course<?> createWorkerCourse = wrokerCourse.createWorkerCourse("직장인과정", wrokerCourse);
		Course<?> createWorkerCourse2 = wrokerCourse.createWorkerCourse("직장인과정2", personCourse);
		
		createWorkerCourse.printStudentList(createWorkerCourse);
		createWorkerCourse.printStudentList(createWorkerCourse2);
		
		
		//학생 과정 생성
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("썽학생"));
		studentList.add(new MiddleStudent("환고딩"));
		studentList.add(new HighStudent("장중딩"));
//		studentList.add(new Person("황상건"));
//		studentList.add(new Person("곽라리"));
		Course<? extends Student> studentCourse = new Course(studentList);
		studentCourse.createStudentCourse("학생과정", studentCourse);
//		studentCourse.createStudentCourse("직장인과정", workerCourse);
//		studentCourse.createStudentCourse("일반인과정", personCourse);
		
		List<MiddleStudent> middleStudentList = new ArrayList<MiddleStudent>();
		middleStudentList.add(new MiddleStudent("썽중딩"));
		Course<MiddleStudent> middleStudentCourse = new Course(middleStudentList);
		middleStudentCourse.createStudentCourse("중학생과정", middleStudentCourse);
		//*직장인 과정에는 학생 과정 세팅을 개설할 수 없다.
		//*workerCourse.createWorkerCourse("직장인과정3, studentCourse);
		
		studentCourse.printStudentList(studentCourse);
		studentCourse.printStudentList(middleStudentCourse);
	}
}
