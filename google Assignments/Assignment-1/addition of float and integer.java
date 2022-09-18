import java.util.Scanner;
public class Main
{  
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intnum = scanner.nextInt();
        float floatnum  = scanner.nextFloat();
        System.out.println((float)(intnum+floatnum));
	}
}
