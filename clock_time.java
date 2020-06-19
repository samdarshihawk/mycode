public class clock_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startmin=00;
		int starthour=00;
		int stophour=23;
		int stopmin=59;
		final int min=60;
		final int hour=24;
		for(int i = 0; i<hour;i++)
			for(int j=0; j<min;j++) 
			{
				if(i==0&&j==0)
					System.out.println("0"+startmin+":"+starthour+"0\n");
				else if(i==stophour&&j==stopmin) 
				{
					System.out.println(stophour+":"+stopmin);
					System.out.print("\nAll done!");
				}
				
				else 
				{
					if(( i>=0 && i < 10)&&(j >= 0 && j<10))
							System.out.println("0"+i+":"+"0"+j+"\n");
					if(( i>=0 && i < 10)&&(j >= 10))
						System.out.println("0"+i+":"+j+"\n");
					if(( i>=10)&&(j>=0&&j<10))
						System.out.println(i+":"+"0"+j+"\n");
					if(( i>=10)&&(j>=10))
						System.out.println(i+":"+j+"\n");
					
				}
			}
		

	}

}
