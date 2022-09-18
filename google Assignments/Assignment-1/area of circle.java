import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double area1 = Math.PI*r*r;
		System.out.println(area1);
		System.out.printf("%.2f",(float)area1);
	}
}
