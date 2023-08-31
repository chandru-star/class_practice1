import java.util.Scanner;
public class switch2{
    public static void main (String args []){
        System.out.println("ENTER THE NAME ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = sc.nextInt();

        switch(a){
            case "add":
                System.out.println(c + b);
                break;
            case "sub":
                System.out.println(c - b);
                break;
                case "multi":
                System.out.println(c * b);
                break;
                case "div":
                System.out.println(c / b);
                break;
                default:
                    System.out.println("no data");
                    break;
        }
    }
}