import java.util.Scanner;
public class grade{
    public static void main (String args []){
        System.out.println("ENTER THE MARK");
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();

    if (a>90){
        System.out.println(" A grade");
    }
    if ((a>80)&&(a<90)){
        System.out.println(" B grade");
    }
    if ((a>70)&&(a<80)){
        System.out.println(" C grade");
    }
    if ((a>60)&&(a<70)){
        System.out.println(" D grade");
    }
    if ((a>35)&&(a<60)){
        System.out.println(" B grade");
    }
    if (a<35){
        System.out.println(" FAIL");
    }
    }
}