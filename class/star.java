import java.util.Scanner;
public class star{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for( int i=1;i<=a*a;i++){
        System.out.print("*");
        if(i%a==0){
         System.out.println();
        } 
        }
    }
    }
