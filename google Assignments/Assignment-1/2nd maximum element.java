import java.util.Scanner;
class Main {
  public static void main(String[] args) { 
     Scanner scanner=new Scanner(System.in); 
    int num=scanner.nextInt(); 
    int arr[]=new int[num];
    for(int i=0;i<num;i++)
      {
        arr[i]=scanner.nextInt();
      }  
    int largest=arr[0]>arr[1]?arr[0]:arr[1]; 
    int seclargest=arr[0]<arr[1]?arr[0]:arr[1]; 
    for(int i=2;i<num;i++)
      {
        if(arr[i]>largest)
        { 
          seclargest=largest;
          largest=arr[i];
        } 
        else if(arr[i]>seclargest)
        { 
          seclargest=arr[i];
          
        }
      }
     System.out.print("second largest is "+seclargest);
  }
}
