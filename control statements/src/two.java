import java.util.*;
class two{
	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		int m;
		char b;
		do{
			System.out.println("Enter the Number corresponding to month from 1 to 12:");
		m = a.nextInt();
		switch(m)
		{
			case 1:
			System.out.println("JAN");
			break;
			case 2:
			System.out.println("FEB");
			break;
			case 3:
			System.out.println("MAR");
			break;
			case 4:
			System.out.println("APRIL");
			break;
			case 5:
			System.out.println("MAY");
			break;
			case 6:
			System.out.println("JUNE");
			break;
			case 7:
			System.out.println("JULY");
			break;
			case 8:
			System.out.println("AUG");
			break;
			case 9:
			System.out.println("SEPT");
			break;
			case 10:
			System.out.println("OCT");
			break;
			case 11:
			System.out.println("NOV");
			break;
			case 12:
			System.out.println("DEC");
			break;
			default:
			System.out.println("invalid input");

		}
		System.out.println("press N to exit");
		b=a.next().charAt(0);}
		while (b!='N');
		

		 
	}
}