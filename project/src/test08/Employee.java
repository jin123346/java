package test08;

public class Employee extends Person{

	private String employeeId;
	private String dept;
	private int salary;
	
	
	public Employee(String name, String birth, String employeeId, String dept, int salary) {
		super(name, birth);
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}
	
	public void raiseSalary(int salary) {
		this.salary += salary;
	}
	
	public void changeDepartment(String changeDept) {
		this.dept = changeDept;
	}
	
	
	public void printEmployeeInfo() {
		super.printPersonInfo();
		System.out.println("직원 ID : "+employeeId);
		System.out.println("부   서 : "+dept);
		System.out.println("급   여 : "+salary);
	}
	

	
	
	
}
