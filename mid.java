import java.util.Scanner;
public class arrow {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.next();
		int length = str.length();
		if (length%2==1) 
			System.out.print(str.substring((length-1)/2,((length-1)/2)+1));
		else if(length%2==0)
			System.out.print(str.substring((length/2 -1),(length/2+1)));
	}
		
	

		
}
	
