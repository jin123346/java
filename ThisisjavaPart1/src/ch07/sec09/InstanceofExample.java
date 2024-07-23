package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println(person.name);
		person.walk();
		
		if(person instanceof Student student) {
			System.out.println("studentNO : "+student.studentNo);
			student.study();
		} // person이 참조하는 객체가 student타입일 경우
		
		// 매개값이 student일 경우
//		if(person instanceof Student) {
//			Student student = (Student)person;
//			System.out.println("studentNO : "+student.studentNo);
//			student.study();		}
		
		
	}
	public static void main(String[] args) {
		Person p1=  new Person("홍길동");
		
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동",10);
		personInfo(p2);
	}
	
}
