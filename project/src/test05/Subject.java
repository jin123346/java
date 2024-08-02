package test05;

public class Subject {
	private String subName;
	private Student[] students= new Student[10];
	private int studentCount;
	public Subject(String subName) {
		this.subName = subName;
		this.studentCount=0;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : "+subName);
		System.out.print("과목명 : ");
		for(int i=0; i< studentCount ; i++) {
			System.out.print(students[i].getName()+" ");
		}
		System.out.println();
		
	}
	
	public void addStudent(Student student) {
		students[studentCount] = student;
		studentCount++;
	}
	
	
	
	
	
}
