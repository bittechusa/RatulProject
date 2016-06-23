/**
 * this keyord work
 * @author Ratul
 *
 */
public class ThisWork {
	
	private String name;
	private String address;
	private int age;
	public ThisWork() {
		System.out.println("default constructor: invoked");
		// TODO Auto-generated constructor stub
	}
	public ThisWork(String n,String addr) {
		this();
		this.name =n;
		this.address =addr;
	}
	public ThisWork(String fName,String location,int age) {
		this(fName,location);
		this.age =age;
	}
	void Display() {
		System.out.println(name+" "+address+" "+age);
	}
	void MethodFirst() {
		System.out.println("method 1");
	}
	
	public static void main(String args[]) {
		ThisWork thisWork = new ThisWork("ratul", "mohammadpur");
		ThisWork aThis =new ThisWork("ratul","Dhaka",10);
		thisWork.Display();
		
	}

}
