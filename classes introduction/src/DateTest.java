import java.util.*;
class Date{
	int month;
	int day;
	int year;
	Date(){
		month = 1;
		day = 1;
		year = 2000;
	}
	Date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	void display(){
		System.out.println(""+(month)+"/"+(day)+"/"+(year)+"");
	}
}
	public class DateTest{
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			Date d1 = new Date();
			d1.display();
			System.out.println("Enter the month : ");
			int month = in.nextInt();

			System.out.println("Enter the day : ");
			int day = in.nextInt();

			System.out.println("Enter the year : ");
			int year = in.nextInt();
			Date d2 = new Date(month, day, year);
			d2.display();

		}
	}