import java.util.Scanner;
public class loophi{
    public static void main (String args []){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
         while (i<=0){
            System.out.println(i);
            i++;
        }
        
    }
}