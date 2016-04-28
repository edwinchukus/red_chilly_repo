package overrridingPackage;

public class GraduateStudent extends Student{
	
	public String StudentID = "GS662";
	
	public GraduateStudent(String StudentID) {
		super(StudentID);
	}

	
	
	public void showStudentID() {
		super.showStudentID();
	}

}
