import java.util.Scanner;
public class logicalopp{
    public static void main (String args[]){
        System.out.println("enter the numebr");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       if((a>b)&&(a>c)){
            System.out.println( "a is bigger");
       }
       else if((b>a)&&(b>c)){
            System.out.println( "b is bigger");
       }
       else {
            System.out.println( "c is bigger");
       }
    }
}