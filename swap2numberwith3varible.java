import java.util.Scanner;


public class swap2numberwith3varible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,temp;
		
		System.out.println("Enter THE X & Y");
		
		Scanner in=new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		
		
		System.out.println("BEFORE SWAPPING x= "+x+"y="+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping x="+x+"y="+y);
		
	}
		
		
	}


