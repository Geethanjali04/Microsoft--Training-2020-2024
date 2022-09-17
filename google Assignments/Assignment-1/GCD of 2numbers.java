import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();  
    int gcd=findGCD(num1,num2);  
      System.out.println(gcd);
  }
    public static int findGCD(int num1,int num2)
      {
    if(num2==0)
    {
      return num1;
    } 
    else 
    {
      return findGCD(num2,num1%num2);
    } 
    }
  
}
