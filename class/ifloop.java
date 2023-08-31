import java.util.Scanner;
public class ifloop{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i<0){
        for(int a=0;a>=i;a--){
        System.out.println(a);
        }
        }
        if(i>0){
            for(int a=0;a<=i;a++){
                System.out.println(a);
            }
        }
    }
}