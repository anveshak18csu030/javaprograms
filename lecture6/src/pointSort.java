import java.util.*;
class pointSort{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int i;
		int j;
		Point array[] = new Point[10];
		int num;
		double x;
		double y;
		Point temp = new Point();
		System.out.println("enter no: of pairs of elements you want to sort : ");
		num = in.nextInt();
		for(i=0;i<num;i++){
			System.out.println("enter the elements : " + (i + 1));
			System.out.println("enter the value of x : ");
			x = in.nextDouble();
			System.out.println("enter the value of y : ");
			y = in.nextDouble();
			array[i] = new Point(x,y);
		}
		for(i=0;i<num;i++){
			for(j=0;j<num;j++){
				if(array[i].getY()>array[j].getY()){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted as : ");
		for(i=0;i<array.length;i++){
			System.out.println(array[i].getX()+","+array[i].getY());
		}
	}
}