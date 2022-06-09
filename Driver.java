import java.util.Scanner;

public class Driver 
{       static String name;
        static String User;
        static String Pass;
        static String Email;
        static
		{
        	System.out.println("      ---------------------------------------");
			System.out.println("      |***** WELCOME TO JADHAV SHOWROOM *****|");
			System.out.println("      ---------------------------------------");
			Scanner sc=new Scanner(System.in);
	        System.out.println("                 **Registration PAGE**");
	        System.out.print("Enter a Name: ");
	        name=sc.nextLine();
	        System.out.print("Enter Email ID: ");
	        Email=sc.next();
	        System.out.print("Enter a Username: ");
	        User=sc.next();
	        System.out.print("Enter a Passward: ");
	        Pass=sc.next();
	       
	        System.out.println("        @Ragistration Completed Succesfully@\n Dear "+name+" Thank You For Joining Us.\nGet more details about vehicles by using our web page. Enjoyeee!!! ");
	        System.out.println("------------------------------------------------------");
	        
		}
        public static void Forgot()
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("------------------------------------------------------");
        	System.out.print("Enter Your Email ID: ");
        	String FgEmail=sc.next();
        	if(Email.equals(FgEmail))
        	{
        		System.out.print("Enter new username: ");
        		User=sc.next();
        		System.out.print("Enter a new Passward: ");
      	        Pass=sc.next();
      	        System.out.println("New Username or Passward Generated Succesgfully**");
      	        System.out.println("----------------------------------------------------");
      	  	    Vinay Vj=new Vinay();
		        Vj.start();
        	}
        	else
        	{
        		System.out.println("Oopsss! You Enter Wrong Email ID!!!!!");
        		System.out.println("Try again....");
        		Forgot();
        	}
        }
		public static void main(String[]args)
		{
				Vinay Vj=new Vinay();
			    Vj.start();
		}
}
