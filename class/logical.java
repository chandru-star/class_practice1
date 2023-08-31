import java.util.Scanner;
public class logical{
     public static void main (String args[]){
        System.out.println("enter the number");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();

     if((0<a)&&(a<=50)){
        System.out.println(a + "is valid");
     }
     else{
        System.out.println(a + "is invalid");
     }
     }
}