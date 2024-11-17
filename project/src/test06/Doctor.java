package test06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients = new ArrayList<Patient>();
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
	}

	public void addPatient(Patient patient) {
		
		patients.add(patient);
		
	}

	@Override
	public String toString() {
		/*
		 * Stringbuilder sb = new StringBuilder();
		 * sb.append("의사 : ").append(name).append(ID: ).append(id).append(", 전문분야 : ").append(special).append(")")
		 * sb.append("\n담당 환자 목록")
		 * 
		 * sb.toString();
		 */
		
		
		System.out.printf("의사 : %s(ID: %s, 전문분야 : %s)\n",name,id,special);
		System.out.println("담당 환자 목록");
		patients.stream().forEach(t-> System.out.println(t.toString()));
		return "";
	}
	
	
	
	
	
	
	
}
