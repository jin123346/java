package test05;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects = new Subject[10];
	private int[] scores = new int[10];
	private int subjectCount =0;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		subjectCount=0;
	}
	
	
	public void enrollSubject(Subject subject) {
		subjects[subjectCount] = subject;
		subjectCount++;
		subject.addStudent(this);
		String sub = subject.getSubName();
		System.out.println(name +" - "+sub+" 과목 신청완료");
	}
	
	public void setScore(Subject subject,int score) {
		for(int i=0;i<subjectCount;i++) {
			if(subjects[i].equals(subject)) {
				scores[i]=score;
				System.out.println(name+" - "+subject.getSubName()+" 점수 입력완료");
			}
		}
		
	}
	
	public void printStudentInfo() {
		System.out.println("이름 : "+name);
		System.out.println("ID : "+studentId);
		System.out.println("성적");
		for(int i=0;i<subjectCount ; i++) {
			String sub=subjects[i].getSubName();
			int sco=scores[i];
			System.out.println(" - "+sub+":"+sco);
		}
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Object getName1() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	

	
	
	

}
