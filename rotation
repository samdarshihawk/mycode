import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter array size (minimum size 5 and an odd number)? ");
		int input = sc.nextInt();
		System.out.print("Starting integer value: ");
		int value = sc.nextInt();
		System.out.println();
		int [] arr = new int[input];
		for(int i =arr.length-1;i>=0;i--)
		{
			arr[i]=value;
			value=value+3;
		}
		System.out.println("Original array:");

		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i=i+2)
		{
			arr[i]=arr[i+2];
		}
		arr[arr.length-1]=temp;
		System.out.println();

		System.out.println();

		System.out.println("Array after rotation:");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
