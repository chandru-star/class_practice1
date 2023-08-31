import java.util.Scanner;
public class findgender{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        
        
        if(a=='m'){
            System.out.println("male");
        }
        else if(a=='f'){
            System.out.println("female");
        }
        else if(a=='c'){
            System.out.println("children");
        }

    }
}