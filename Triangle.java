import java.util.Scanner;
class Triangle {
   public static void main(String args[]) {  
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the 1st side of triangle:");
        int firstSide= scan.nextInt();
		System.out.println("Enter the 2nd side of triangle:");
        int secondSide= scan.nextInt();
		System.out.println("Enter the 3rd side of triangle:");
        int thirdSide= scan.nextInt();
        int side=(firstSide+secondSide+thirdSide)/2;
        double  area=Math.sqrt(side*(side-firstSide)*(side-secondSide)*(side-thirdSide));
        System.out.println("Area of Triangle is: " + area);
	}
}

		