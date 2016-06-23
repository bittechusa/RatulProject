
public class StartingPoint {

	public static void main(String[] args) {
		Student aStudent =new Student("ratul","ashraf","mohammadpur");
		Student bStudent =new Student("ratul");
		Student cStudent =new Student(aStudent);

	}

}
