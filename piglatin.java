import java.util.Scanner;

public class piglatin {

	public static void main(String[] args) {
		String lower1, lower2;
		Scanner key = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String first = key.next();
		System.out.println("Please enter your last name");
		String last = key.next();
		lower1 = first.toLowerCase();
		lower2 = last.toLowerCase();
		String cap1 = lower1.substring(0,1);
		String cap2 = lower2.substring(0,1);
		lower1 = lower1.replace(cap1,"").concat(cap1 + "ay");
		lower2 = lower2.replace(cap2, "").concat(cap2 + "ay");
		lower1 = lower1.substring(0,1).toUpperCase() + lower1.substring(1, lower1.length());
		lower2 = lower2.substring(0,1).toUpperCase() + lower2.substring(1,lower2.length());
		
		System.out.println("Your Name" + " \""+first+" "+last
				+"\" "+"turned into pig latin is: " + lower1 
				+ " "+lower2);
		
		
