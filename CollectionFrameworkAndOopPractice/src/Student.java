
public class Student {
	private String fName;
	private String lName;
	private String address;
	public Student(String fName, String lName, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		System.out.println(fName+""+lName+""+address);
	}
	public Student() {
		super();
	}
	public Student(String fName) {
		super();
		this.fName = fName;
		System.out.println(fName);
	}
	public Student(Student s) {
		super();
		fName =s.fName;
		lName =s.lName;
		address=s.address;
		System.out.println(fName+""+lName+""+address);
	}
	
	//copy value with constructor
	

}
