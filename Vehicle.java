import java.util.Scanner;
class Properties 
{		
	private String Vehicle_number;
	private String RagistrationNo;
	private double Amount;
	public String getVehiclenumber() 
	{
		return Vehicle_number;
	}
	public void setVehiclenumber(String Vehiclenumber,String ragistrationNo) {
		Vehicle_number = Vehiclenumber;
		RagistrationNo = ragistrationNo;
	}
	public String getRagistrationNo() {
		return RagistrationNo;
	}
	
	public double getAmount()
	{
		return Amount;
	}
	public void setPrice(double Amount)
	{
		this.Amount = Amount;
	}

	
	String color;
	int Mileage;
	int EngineCapacity;
	double FuelTankCapacity;
	Properties(String color,int Mileage,int EngineCapacity,double FuelTankCapacity) 
	{      
		this.Mileage=Mileage;
		this.color = color;
		this.EngineCapacity=EngineCapacity;
		this.FuelTankCapacity=FuelTankCapacity;
		
	}
	String Helmate;
	Properties(String Helmate) {
		this.Helmate=Helmate;
	}
	public void details()//RTB/RTP superclass
	{
		System.out.println("COLOURS:            "+color);
		System.out.println("MILEAGE:            "+Mileage+" Kmpl");
		System.out.println("ENGINE CAPACITY:    "+EngineCapacity+" CC");
		System.out.println("FUEL TANK CAPACITY: "+FuelTankCapacity+" Litres");
	}

		public static void Type()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Press 1: Two Wheeler\nPress 2: Four Wheeler\nPress 3: Six Wheeler\nPress 4: Log Out\nPress 5: Search By Company");
			System.out.println("                          **-**-**");
			System.out.print("Select Type Of Vehicle: ");
			
			int Press=sc.nextInt();
			switch(Press)
			{
			case 1: System.out.println("---------------------------------------------------------------");
					System.out.println("        [ You are Selected Two Wheeler ] ");
					Bike B=new Bike();
					B.company();
			break;
			case 2: System.out.println("        [ You are Selected Four Wheeler ] ");
					car C=new VariantCar();       //created Ref variable for abstract class
					C.company();
			break;
			case 3: System.out.println("        [ You are Selected Six Wheeler ] ");
			break;
			case 4:System.out.println("                 LOGOUT SUCCESFUL\n");
				   System.out.println("    ------------------------------------------------");
				   System.out.println("    !***** THANK YOU FOR VISITING OUR SHOWROOM *****!");
				   System.out.println("    ------------------------------------------------");
				   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				   Vinay V=new Vinay();
				   V.start();
			break;
			case 5:find f=new find();
			       f.search();
			break;
			default:System.out.println("    !!!!! Please Select Valid Type !!!!!");
					Type();
			}
		}
		
}
			//------------------------

class TwoWheeler extends Properties
{
	int Mileage;
	double FuelTankCapacity;
	int EngineCapacity;
	String Helmate;
	TwoWheeler(String color,double FuelTankCapacity,int EngineCapacity,int Mileage, String Helmate)
	{
	   super(color,Mileage,EngineCapacity, FuelTankCapacity);
	   this.Helmate=Helmate;
	}
	@Override
	public String toString()
	{
		System.out.println("Helmate From ToString: "+Helmate);
		return "             TwoWheelerBike";
		
	}
	
	
	public void details()        //Method Overriding (RTB)--Run time Polymorphism  //subclass
	{
		super.details();
		
		System.out.println("HELMATE TYPE:       "+Helmate);
	}
	
}
				//-----------------------
class Bike 
{
	Scanner sc=new Scanner(System.in);
	public void company()
	{	System.out.println("Press 1: Hero\nPress 2: Honda\nPress 3: Bajaj\nPress 4: <<Previous Page\n");
	    System.out.println("                          **-**-**");
		System.out.print("Select Company: ");
		int Press=sc.nextInt();
		Variant V=new Variant();
		
		switch(Press)
		{
		case 1: System.out.println("----------------------------------------------------------------");
				System.out.println("           [ You are Selected Hero Company ]");
				V.HeroVariant();
		break;
		case 2: System.out.println("You are Selected Honda Company");
				V.HondaVariant();
		break;
		case 3: System.out.println("You are Selected Bajaj Company");
				V.BajajVariant();
		break;
		case 4:System.out.println("                   **-**-**");
			System.out.println("        [ >>> Please Reselect Type <<< ]");
				
			   Properties.Type();
		break;
		default:System.out.println("    !!!!! Please Select Valid Company !!!!!");
				company();
		}
	}
	
}
				//------------------------
class Variant extends Bike  
{	TwoWheeler B;   
    public static void SeparaterDesign()
    {
    	System.out.println("====================================================");
    	System.out.println("<<||Choose Another Option");
   
    }
	public void HeroVariant()
	{	
		{
			System.out.println("Press 1: Splender Plus\nPress 2: HF Deluxe\nPress 3: Passion Pro\nPress 4: <<Previous Page\nPress 5: |^|Home Page\n");
			System.out.println("                          **-**-**");
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Variant: ");
		int Press=sc.nextInt();
		switch(Press)
		{
		case 1: System.out.println("----------------------------------------------------------");
				System.out.println("      \n        * { Information of Hero Splender Plus } *");
				B=new TwoWheeler("Black",10.8,125,80,"Reguler");
		        B.setVehiclenumber("MH12-B01122","HSla123c$4");
			    System.out.println("Bike_No:            "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
			    B.details();
			    System.out.println(B.toString());
			    SeparaterDesign();
			    HeroVariant();	
		break;
		case 2: System.out.println("    * Information of HF Deluxe *");
		        B=new TwoWheeler("Black",10.8,125,80,"Sport Helmate");
	            B.setVehiclenumber("MH11-R01822","HFla124c$4");
	            System.out.println("Bike_No:            "+B.getVehiclenumber());
	            System.out.println("Bike_ Registration: "+B.getRagistrationNo());
	            B.details();
			    SeparaterDesign();
	       	    HeroVariant();     
		break;
		case 3: System.out.println("    * Information of Passion Pro *");
		        B=new TwoWheeler("Black",10.8,80,125,"Fiber Helmate");
		        B.setVehiclenumber("MH18-PASSI1822","PPla124c$4");
		        System.out.println("Bike_No:            "+B.getVehiclenumber());
		        System.out.println("Bike_ Registration: "+B.getRagistrationNo());
		        B.details();
	    	    SeparaterDesign();
	    	    HeroVariant();
		break;
		case 4: System.out.println("----------------------------------------------------");
				System.out.println("Please Reselect Company");
		        company();
		break;
		case 5: System.out.println("**!HOME PAGE!**");
			    Properties.Type();
		break;
		default:System.out.println("    !!!!! Please Select Valid Variant !!!!!");
				HeroVariant();
		}
	}
	public void HondaVariant()
	{	
		{
			System.out.println("Press 1: Shine\nPress 2: Unicorn\nPress 3: Hornet 2.0\nPress 4: <<Previous Page\nPress 5: Home Page\n");
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Variant: ");
		int Press=sc.nextInt();
		switch(Press)
		{
		case 1: System.out.println("    * Information of Shine *");
				B=new TwoWheeler("Red",10.5,55,124,"Half Headcover");
				B.setVehiclenumber("MH11-R01822","HFla124c$4");
			    System.out.println("Bike_No:            "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
				B.details();
				SeparaterDesign();
			    HondaVariant();			       
		break;
		case 2: System.out.println("    * Information of Unicorn *");
				B=new TwoWheeler("1: Pearl Igneous Black\n         2: Imperial Red Metallic\n         3: Mat Axis Gray Metallic",13.3,50,163,"SemiSport");
				B.setVehiclenumber("MH11-R01822","HFla124c$4");
			    System.out.println("Bike_No:            "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
				B.details();
				SeparaterDesign();
				HondaVariant();
		break;
		case 3: System.out.println("    * Information of Hornet *");
				B=new TwoWheeler("Red",10.5,55,124,"StarAirVent");
				B.setVehiclenumber("MH11-R01822","HFla124c$4");
			    System.out.println("Bike_No:            "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
				B.details();
				SeparaterDesign();
				HondaVariant();
		break;
		case 4: System.out.println("--------------------------------------------------------");
				System.out.println("Please Reselect Company");
			    company();
		break;
		case 5: System.out.println("**!HOME PAGE!**");
			    Properties.Type();
		default:System.out.println("    !!!!! Please Select Valid Variant !!!!!");
				HondaVariant();
		}
	}
	public void BajajVariant()
	{	
		{
			System.out.println("Press 1: Dominar 400\nPress 2: Pulsar NS160\nPress 3: Bajaj Avenger\nPress 4: <<Previous Page\nPress 5: Home Page");
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Variant: ");
		int Press=sc.nextInt();
		switch(Press)
		{
		case 1: System.out.println("     * Information of Dominar 400 *\n");
				B=new TwoWheeler("Aurora Green",13.5,29,374,"Sport Helmate");
				B.setVehiclenumber("MH11-R01822","HFla124c$4");
			    System.out.println("Bike_No: "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
				B.details();
				SeparaterDesign();
			    BajajVariant();
		break;
		case 2: System.out.println("     * Information of Pulsar NS160 *\n");
				B=new TwoWheeler("1: Burnt Red\n         2: Metallic Pearl White\n         3: Pewter Grey",12,41,160,"HimalayaSport");
				B.setVehiclenumber("MH11-R01822","HFla124c$4");
			    System.out.println("Bike_No: "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
				B.details();
				SeparaterDesign();
			    BajajVariant();	
		break;
		case 3: System.out.println("     * Information of Bajaj Avenger *\n");
				B=new TwoWheeler("Ebony Black",13,45,160,"StrongSefty Helmate");
				B.setVehiclenumber("MH11-R01822","HFla124c$4");
			    System.out.println("Bike_No: "+B.getVehiclenumber());
			    System.out.println("Bike_ Registration: "+B.getRagistrationNo());
				B.details();
				SeparaterDesign();
			    BajajVariant();
		case 4: System.out.println("----------------------------------------------------");
				System.out.println("Please Reselect Company");
			    company();
		break;
		case 5: System.out.println("**!HOME PAGE!**");
				Properties.Type();
		break;
		default:System.out.println("     !!!!! Please Select Valid Variant !!!!!");
				BajajVariant();
		}
	}
}
              //CAR 
class FourWheeler extends Properties
{
	
	int Transmission;
	int Mileage;
	int Cylinder;
	int SeatingCapacity;
	int EngineCapacity;
	double FuelTankCapacity;
	String TransmissionType;
	public FourWheeler(String color,int Transmission,int Mileage,int EngineCapacity,int Cylinder,String TransmissionType, double FuelTankCapacity) {
		super(color,Mileage,EngineCapacity,FuelTankCapacity);
		this.Transmission=Transmission;
		this.Cylinder=Cylinder;
		this.TransmissionType=TransmissionType;
	}
	public void details()
	{
		super.details();
		System.out.println("TRANSMISSION:       "+Transmission);
		System.out.println("No.of CYLINDER:     "+Cylinder);
		System.out.println("TRANSMISSION TYPE:  "+TransmissionType+"\n");
	}
	
}
abstract class car
{
	Scanner sc=new Scanner(System.in);
	public void company()
	{	System.out.println("Press 1: KIA\nPress 2: FORD\nPress 3: Mercedes\nPress 4: Exit\n");
		System.out.print("Select Company: ");
		int Press=sc.nextInt();
		VariantCar Vc=new VariantCar();
		switch(Press)
		{
		case 1: System.out.println("You are Selected KIA Company");
		        I2 ref =new FuelType();//ref Variable Created for interface 
		        ref.fuelEngine();
		break;
		case 2: System.out.println("You are Selected FORD Company");
                Vc.FORDVariant();
           
		break;
		case 3: System.out.println("You are Selected Mercedes Company");
                Vc.MercedesVariant();
		break;
		case 4:System.out.println("***** THANK YOU FOR VISITING OUR SHOWROOM *****");
		break;
		default:System.out.println("    !!!!! Please Select Valid Company !!!!!");
				company();
		}
	}
}
interface I2
{
	abstract public void fuelEngine();
}
class FuelType extends VariantCar implements I2
{
	public void fuelEngine()
	{
		System.out.println("Press 1: Petrol\nPress 2: Diesel\nPress 3: CNG\n");
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Fuel Type: ");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println(" Petrol");
		 		KIAVariant();
		 		FORDVariant();
		break;
		case 2:System.out.println(" Diesel");
		break;
		case 3:System.out.println(" CNG");
		break;
		}
	}
	
	
}
class VariantCar extends car  
{	FourWheeler c;   
    
	public void KIAVariant()
	{	
		{
			System.out.println("Press 1: KIA Seltos\nPress 2: KIA Sonet\nPress 3: KIA Carnival\nPress 4: <<Previous Page\nPress 5: |^|Home Page\n");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Variant: ");
		int Press=sc.nextInt();
		switch(Press)
		{
		case 1: System.out.println("    \n* Information of KIA Seltos *");
		        c=new FourWheeler("White",6,21,1497,4,"Automatic",35.6);
		        c.setVehiclenumber("MH03-KS1122","KSla123c$4");
			    System.out.println("CAR_No:             "+c.getVehiclenumber());
			    System.out.println("CAR_ Registration:  "+c.getRagistrationNo());
			    c.details();
			    Variant.SeparaterDesign();
			    KIAVariant();	
		break;
		case 2: System.out.println("    * Information of KIA Sonet *");
				c=new FourWheeler("Grey",7,12,1395,4,"Automatic",30.6);
			    c.setVehiclenumber("MH05-Kson1822","KIASONla124c$4");
				System.out.println("CAR_No:             "+c.getVehiclenumber());
	            System.out.println("CAR_ Registration:  "+c.getRagistrationNo());
	            c.details();
	            Variant.SeparaterDesign();
	       	    KIAVariant();     
		break;
		case 3: System.out.println("    * Information of KIA Carnival *");
		        c=new FourWheeler("Black Matic",5,20,1236,6,"Automatic",40.3);
                c.setVehiclenumber("MH09-KC1822","KCla124c$4");
		        System.out.println("CAR_No:             "+c.getVehiclenumber());
		        System.out.println("CAR_ Registration:  "+c.getRagistrationNo());
		        c.details();
		        Variant.SeparaterDesign();
	    	    KIAVariant();
		break;
		case 4: System.out.println("Please Reselect Company");
		        company();
		break;
		case 5: System.out.println("**!HOME PAGE!**");
			    Properties.Type();
		break;
		default:System.out.println("    !!!!! Please Select Valid Variant !!!!!");
				KIAVariant();
		}
	}
	public void FORDVariant()
	{	
		{
			System.out.println("Press 1: FORD EcoSport\nPress 2: FORD Endeavour\nPress 3: Ford Mustang 2.0\nPress 4: <<Previous Page\nPress 5: Home Page\n");
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Variant: ");
		int Press=sc.nextInt();
		switch(Press)
		{
		case 1: System.out.println("    * Information of FORD EcoSport *");
		        c=new FourWheeler("White",6,22,1499,4,"Manual",45);
		        c.setVehiclenumber("MH13-FX1822","XFORD24c$4");
			    System.out.println("CAR_No:             "+c.getVehiclenumber());
			    System.out.println("CAR_ Registration:  "+c.getRagistrationNo());
				c.details();
				Variant.SeparaterDesign();
			    FORDVariant();			       
		break;
		case 2: System.out.println("    * Information of FORD ENDEAVOUR *");
		        c=new FourWheeler("Red",7,20,1423,6,"Automatic",50.4);
		        c.setVehiclenumber("MH17-FS1822","FDlaSUVc$4");
			    System.out.println("Car_No:             "+c.getVehiclenumber());
			    System.out.println("Car_ Registration:  "+c.getRagistrationNo());
				c.details();
				Variant.SeparaterDesign();
				FORDVariant();
		break;
		case 3: System.out.println("    * Information of FORD MUSTANG *");
		        c=new FourWheeler("Silver",5,21,1339,4,"Automatic",45.3);
		        c.setVehiclenumber("MH02-FD50001822","FD5lac$4");
			    System.out.println("Car_No:             "+c.getVehiclenumber());
			    System.out.println("Car_ Registration:  "+c.getRagistrationNo());
				c.details();
				Variant.SeparaterDesign();
				FORDVariant();
		break;
		case 4: System.out.println("Please Reselect Company");
			    company();
		break;
		case 5: System.out.println("**!HOME PAGE!**");
			    Properties.Type();
		default:System.out.println("    !!!!! Please Select Valid Variant !!!!!");
				FORDVariant();
		}
	}
	public void MercedesVariant()
	{	
		{
			System.out.println("Press 1: CLASS-I\nPress 2: FCL-SR12\nPress 3: CLS\nPress 4: <<Previous Page\nPress 5: Home Page");
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Select Variant: ");
		int Press=sc.nextInt();
		switch(Press)
		{
		case 1: System.out.println("     * Information of CLASS-I *\n");
		        c=new FourWheeler("Orange",6,18,1463,6,"Automatic",70.5);
		        c.setVehiclenumber("MH17-CLASS1822","CIla124c$4");
			    System.out.println("Car_No:             "+c.getVehiclenumber());
			    System.out.println("Car_ Registration:  "+c.getRagistrationNo());
				c.details();
				Variant.SeparaterDesign();
			    MercedesVariant();
		break;
		case 2: System.out.println("     * Information of FCL-SR12 *\n");
		        c=new FourWheeler("Yellow",6,13,1397,4,"Manual",50.3);
		        c.setVehiclenumber("MH16-FCL1822","SRla12c$4");
			    System.out.println("Car_No:             "+c.getVehiclenumber());
			    System.out.println("Car_ Registration:  "+c.getRagistrationNo());
				c.details();
				Variant.SeparaterDesign();
			    MercedesVariant();	
		break;
		case 3: System.out.println("     * Information of CLS *\n");
		        c=new FourWheeler("CarbonBlack",6,16,1498,4,"Automatic/Manual",60.5);
		        c.setVehiclenumber("MH19-CLS1822","CS5623c$4");
			    System.out.println("Car_No:             "+c.getVehiclenumber());
			    System.out.println("Car_ Registration:  "+c.getRagistrationNo());
				c.details();
				Variant.SeparaterDesign();
			    MercedesVariant();
		case 4: System.out.println("Please Reselect Company");
			    company();
		break;
		case 5: System.out.println("**!HOME PAGE!**");
				Properties.Type();
		break;
		default:System.out.println("     !!!!! Please Select Valid Variant !!!!!");
				MercedesVariant();
		}
	}
}
class find
{	
	public void search()
	{	String Hero[]= {"Hero","hero","Hero Bike","hero company","hERo"};
	    String KIA[]= {"KIA","kia","Kia","kIa","KIA CAR"};
	    String FORD[]= {"FORD","ford","Ford","fORd","Ford Car"};
		Scanner sc=new Scanner(System.in);
        System.out.print("Search by Company Name:");
        String a=sc.next();
        int i=0;
        VariantCar VC=new VariantCar();
     for(;i<5;i++) 
     {
	   if(a.equals(Hero[i]))
	   {
		Variant v =new Variant();
		v.HeroVariant();
		break;
	   }
	   else if(a.equals(KIA[i]))
	   {
		  VC.KIAVariant();
		   break;
	   }
	   else if(a.equals(FORD[i]))
	   {
		   VC.FORDVariant();
		   break;
	   }
	  
     }
     if(i==a.length())
	  {
		   System.out.println("Company Not Present!");
		   System.out.println("--------------------------------------------");
		   System.out.println("search Again With Different Company ^^");
		   search();
	  }
	}
}
class Vinay
{
	public void start()
	{
		          Scanner sc=new Scanner(System.in);
	        	  System.out.println("                  LOGIN PAGE");
	        	  System.out.print("Enter a Username:");
	        	  String a=sc.next();
	        	  System.out.print("Enter a Passward:");
	        	  String b=sc.next();
	        if((a.equals(Driver.User))&&(b.equals(Driver.Pass)))
	        {
	            
	        	  System.out.println("             *{Login Succesfully}*");
	              System.out.println("----------------------------------------------");
	              Properties.Type();
	        }
	        else
	        {
	        	  System.out.println("Incorrect Username");
	              System.out.println("-----------------------------------------------");
	              System.out.println("Press 1: Login Again\nPress 2: Information About us\nPress 3: Forgot Passward or Username ?");
	              System.out.print("Choose other options :");
	              int Press=sc.nextInt();
	             switch(Press)
	             {
	             	case 1: System.out.println("            ! Login Again");
	             			start();
	             	break;
	             	case 2: System.out.println("This Web Page is developed by MR.Vinay Jadhav(BE Mech).\nYou can getting all information about latest as well as Upcoming Vehicles.\nOur showroom contains all types of vehicls like Two wheelers, Four Wheelers etc.");
	             	        System.out.println("-----------------------------------------------------------------");
	             	        start();
	             	break;
	             	case 3: System.out.println("Please create New Username or Passward by using Your EmailID**");
	                        Driver.Forgot();
	                break;
	             }
	        }
	}
}