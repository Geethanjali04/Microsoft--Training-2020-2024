import java.util.Scanner;
public class Main
{  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String reverse ="";
        int len = str.length();
        int i=len-1;
        while(i>=0){
            reverse=reverse+str.charAt(i);
            i--;
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
	}
}
