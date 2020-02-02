package CMRIT.RohitGoud;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
	
	while(true) {
		System.out.println("Menu");
		System.out.println("1. Choclate 1");
		System.out.println("2. Choclate 2");
		System.out.println("3. Choclate 3");
		System.out.println("4. Sweet 1");
		System.out.println("5. Sweet 2");
		System.out.println("6. Sweet 3");
		System.out.println("7. Exit");
	System.out.println("Enter your choice:");
	NewYearChoclates ob;
	int tot=0;
	try {
		Scanner sc=new Scanner(System.in);
	switch(sc.nextInt())
	{
	case 1: System.out.println("Enter the weight :");
			ob=new Choclate1();
			 tot=ob.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+tot);
			break;
	case 2: System.out.println("Enter the weight :");
			ob=new Choclate2();
			tot=ob.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+tot);
			break;
	case 3: System.out.println("Enter the weight :");
			ob=new Choclate3();
			tot=ob.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+tot);
			break;
	case 4: System.out.println("Enter the weight :");
			ob=new Sweet1();
			tot=ob.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+tot);
			break;
	case 5: System.out.println("Enter the weight :");
			ob=new Sweet2();
			tot=ob.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+tot);
			break;
	case 6: System.out.println("Enter the weight :");
			ob=new Sweet3();
			tot=ob.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+tot);
			break;
	case 7: System.exit(0);
	default: System.out.println("Enter an integer input (1-7)");

	
	}
	}
	catch(Exception e)
	{
		System.out.println("Enter an integer input (1-7)");
	}
	}

	}

}
