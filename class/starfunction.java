import java.util.*;
public class starfunction {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
        int a=sc.nextInt();
     star(a);        
    }
}
    public static void star(int b){
        for(int i=1;i<=b;i++){
            for(int k=0;k<=b-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
               System.out.println();
        }
    }
}


