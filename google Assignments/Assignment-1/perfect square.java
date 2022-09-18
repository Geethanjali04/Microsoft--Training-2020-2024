import java.util.Scanner;
public class Main
{  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sq = Math.sqrt(n);
        if(sq*sq==n){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
	}
}
