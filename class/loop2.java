import java.util.Scanner;
public class loop2{
    public static void main(String args []){
    System.out.println("enter the number");
    Scanner sc = new Scanner (System.in);
    int a = 1;
    while(a<=10){
        int i =sc.nextInt();
        if (i%2!=0){
            System.out.println("this is odd number:" + i);
        }
        //else {
          //  System.out.println("this is even number:" + i);
        //}
        a++;
        
        }
         
    }
}