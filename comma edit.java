import java.util.Scanner;
import javax.swing.JOptionPane;
public class arrow {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String num = JOptionPane.showInputDialog("Enter a number b/w 1,000 & 999,999(with comma):");
	
		if (num.length()==7) 
			System.out.println(num.substring(0,3)+num.substring(4));
		else if(num.length()==6)
			System.out.println(num.substring(0,2)+num.substring(3));
		else
			System.out.println(num.substring(0,1)+num.substring(2));
		
		
	}

}
