import java.util.Scanner;
import javax.swing.JOptionPane;
public class vending {

	public static void main(String[] args) {
		int Dollars, Quaters, Nickels;
		Scanner Keyboard = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Welcome to the vending Machine");
		String Price = JOptionPane.showInputDialog("Enter the price of the item");
		Double Cost = Double.parseDouble(Price)*100;
		String Amount = JOptionPane.showInputDialog("Enter the amount given");
		Double Value = Double.parseDouble(Amount)*100;
		int Remaining = (int)(Value-Cost);		
		
		if(Remaining >= 100) { 
			
			Dollars = Math.floorDiv(Remaining, 100);
			Remaining = Remaining%100;
			Quaters = Math.floorDiv(Remaining,25);
			Remaining %= 25;
			Nickels = Math.floorDiv(Remaining,10);
			Remaining %= 10;
			JOptionPane.showMessageDialog(null, Dollars+" Dollars "+Quaters+" Quaters "+Nickels+" Nickels "+ Remaining+" Pennies");
		}
		else if (Remaining < 100 && Remaining > 0) {
			Quaters = Math.floorDiv(Remaining, 25);
			Remaining %= 25;
			Nickels = Math.floorDiv(Remaining, 10);
			Remaining %= 10;
			JOptionPane.showMessageDialog(null, "0 Dollars "+Quaters+" Quaters "+Nickels+" Nickels "+Remaining+" Pennies");
		}
		
		else if(Remaining == 0) {
			System.out.print("No Change Due");
			
		}
		else {
			System.out.println("Insufficient Amount Given\n"
					+"Please Inesert the Remaining Amount: "+Math.abs(Value-Cost)+"Pennies");
		}
	
		Keyboard.close();
	}
		
		

}

