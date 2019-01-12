import java.util.*;

class four {

	public static void main(String args[]) {//main program to print every digit separately of a five digit integer

		Scanner a=new Scanner(System.in);

		int num;

		char b;

		do

		{

		System.out.println("Please enter the five digit integer ");

		num=a.nextInt();

		if(num>99999 || num<9999)

			System.out.println("Entered number is not a five digit number");

		else 

			{

				System.out.print("   "+ (num / 10000));

				System.out.print("   "+ (num / 1000) % 10);

				System.out.print("   "+ (num / 100) % 10);

				System.out.print("   "+ (num % 100) / 10);

				System.out.println("   "+ (num % 10));

			}

			System.out.println("Press Q to exit and press any key to continue");

			b=a.next().charAt(0);

		}

		while(b!='Q');

	}	 

}