import java.util.*;	

class three {

	public static void main(String args[]) {//main method to compare two float numbers upto three decimal places

		Scanner a=new Scanner(System.in);

		float num1;

		float num2;

		System.out.println("Enter the first number");

		num1=a.nextFloat();

		System.out.format("Round off number upto three decimal places is %.3f\n", num1);

		System.out.println("Enter the second number you want to compare");

		num2=a.nextFloat();

		System.out.format("Round off number upto three de3cimal places is %.3f\n", num2);

		int compare=Float.compare(num1,num2);

		if(compare>0)

			System.out.println("Number 1 is greater");

		else if(compare==0)

			System.out.println("Both numbers are equal");

		else

			System.out.println("Number 2 is greater");



	}

}