import java.util.Scanner;

public class KrishnmurthyNumber 
{
   public void findNumber(int num,int temp)
   {
	   
	   int sum=0;
	   temp=num;
	   
	 
	   while(num!=0)
	   {
		   int fact=1;
		   int digit=num%10;
		   for(int i=1;i<=digit;i++)
		    fact=fact*i;
	   
	   sum=sum+fact;
	   num=num/10; 
		   
	   }
	   if(sum==temp)
		   System.out.println(temp+"Strong number");
	   else
		   System.out.println(temp+"Not strong number");
	       System.out.println();
   }
   
	  
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
       int num=sc.nextInt();
       int temp=num;
       sc.close();
       KrishnmurthyNumber k=new KrishnmurthyNumber();
       k.findNumber(num,temp);
	}

}
