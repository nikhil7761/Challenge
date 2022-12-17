import java.util.Scanner;

public class FahrenheitToCelcsius {
	
public static void main(String[] args) {
 
	Scanner in=new Scanner(System.in);
		
	System.out.println("Enter the Fahrenheit Temperature");
	
    float Farhrenheit=in.nextFloat();

    float answer=(Farhrenheit-32)*5/9;
    
    System.out.println("temperature in degree celcuis:"+answer);
    
    }

}
