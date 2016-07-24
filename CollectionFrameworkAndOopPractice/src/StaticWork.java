
public class StaticWork {
	static	int count =10;
	public StaticWork() {
		count--;
		System.out.println(count);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		StaticWork aStatic,bStatic;
		aStatic =new StaticWork();
		bStatic = new StaticWork();
		
		
	}

}
