import java.util.Scanner;
public class nestedif{
    public static void main (String args[]){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println("this is even number");
            if(a%4==0){
                System.out.println("this is the even number / by 4");
            }
            else{
                System.out.println("this number is not / by 4");
            }
        }
        else if (a%2!=0){
            System.out.println("this is odd number");
            if(a%3==0){
                System.out.println("this is odd number / by 3");
            }
            else{
                System.out.println("this number is not / by 3");
            }
        }    
        

    }
}