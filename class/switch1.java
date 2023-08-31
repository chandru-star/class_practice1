import java.util.Scanner;
public class switch1{
    public static void main (String args []){
        System.out.println("ENTER THE NAME ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

    switch(a){
        case "chandru":
            System.out.println("mbl no: 99999999");
            System.out.println("blood group : B+");
            System.out.println("email:chand@01");
            break;
            case "sathish":
            System.out.println("mbl no: 88888888");
            System.out.println("blood group : A+");
            System.out.println("email:sathish@02");
            break;
            case "yogesh":
            System.out.println("mbl no: 777777777");
            System.out.println("blood group : ab+");
            System.out.println("email:yogesh@03");
            break;
            case "naveen":
            System.out.println("mbl no: 66666666");
            System.out.println("blood group : A-");
            System.out.println("email:chand@01");
            break;
            default:
                System.out.println("no data");
                break;
    }
    }
}