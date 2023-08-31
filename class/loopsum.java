import java.util.Scanner;
public class loopsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1;i<=a;i++){
          if (i%2==0){
            b +=i;
            System.out.println(b);
          }
        }
    }
}