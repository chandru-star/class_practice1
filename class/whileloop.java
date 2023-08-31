import java.util.Scanner;
public class whileloop{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
      int sum=0;
        int b = 0;
        while(b<10){
  int a = sc.nextInt();
        
        sum+=a;
        b++;
        }
        System.out.println(sum);
    }
}