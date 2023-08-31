import java.util.Scanner;
public class addinloop{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int c = 0;
     for (int i=a;i>=1;i--){
       c+=i;
     }
      System.out.println(c);
    }
}