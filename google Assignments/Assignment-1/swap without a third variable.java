import java.util.Scanner;
public class Main
{  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println("Before Swapping"+num1+" "+num2+" ");
        
        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;
        System.out.println("After Swapping"+num1+" "+num2+" ");
	}
}
