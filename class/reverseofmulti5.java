import java.util.Scanner;
public class reverseofmulti5{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();

     for(int i=a;i>=0;i--){
        if(i%5==0){
            System.out.println(i);
        }
     }
    }
}