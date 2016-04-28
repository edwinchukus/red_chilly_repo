package overrridingPackage;

public class Student {
	
	protected String StudentID ;
	
	public Student(String StudentID) {
		this.StudentID = StudentID;
	}
	
	public void showStudentID() {
		System.out.println(StudentID);
	}
	
	
	public String GetName() {
		return "My name is Edwin NWOFOR";
	}

}
