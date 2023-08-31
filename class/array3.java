import java.util.Scanner;
public class array3{
    public static void main (String args[]){
    System.out.println("enter the data");
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    a[0] = sc.nextInt();
    a[1] = sc.nextInt();
    a[2] = sc.nextInt();

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    }
}