import java.util.Scanner;
  public class large 
{
    public static void main(String args[])
    {
        int ar[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elemnets :");
        for( int i=0 ; i<10 ;i++)
        {            
		  ar[i] = sc.nextInt();
        }
		int large=ar[0];
		
		for(int i=0 ; i<10 ;i++)
		{
			if(large<ar[i])
			{
				large=ar[i];
			}
		}
		System.out.println("Largest element is: " +large);

        
    }
}
