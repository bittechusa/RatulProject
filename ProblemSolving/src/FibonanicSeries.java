import java.util.*;
public class FibonanicSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want to fibonanic:");
		Scanner input =new Scanner(System.in);
		int number =input.nextInt();
		int n1=0,n2=1,sum;
		System.out.print(n1+" "+n2);
		for(int i=2;i<number;i++) {
			sum =n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
