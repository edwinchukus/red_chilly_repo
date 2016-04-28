package overrridingPackage;

public class TestRunner {
	
	public static void main (String args []) {		
		Student emeka = new Student("PS55555");
		emeka.showStudentID();
		String name = emeka.GetName();
		System.out.println(name);
		System.out.println("Nollywood");
	}

}
