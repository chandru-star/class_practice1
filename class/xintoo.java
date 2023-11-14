import java.util.*;
public class xintoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a =sc.next().charAt(0);
        change(a);
    }
    public static void change(char b){
    switch(b){
        case 'x':
        System.out.println("o");
        break;
        case 'o':
        System.out.println("x");
        break;
        default:
         System.out.println("there is no data available");
            break;
    }
    }
}
