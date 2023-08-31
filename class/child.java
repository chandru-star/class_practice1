import java.util.Scanner;
public class child{
    public static void main (String args []){
        System.out.println("ENTER THE DATA");
    Scanner sc = new Scanner (System.in);
    char a = sc.next().charAt(0);
    int b = sc.nextInt();
    int c = sc.nextInt();
    float d = sc.nextFloat();

    if (a=='c'){
        if (b<1){
            if ((d>=10.0)&&(d<=20.0)){
                System.out.println("child is nrml");
            }
            else {
                System.out.println("child is ubnrml");
            }
        }
        if ((b>1)&&(b<2)){
            if ((d>=10.0)&&(d<=18.0)){
                System.out.println("child is nrml");
            }
            else {
                System.out.println("child is ubnrml");
            }
        }
        if ((b>2)&&(b<6)){
            if ((d>=9.5)&&(d<=14.0)){
                System.out.println("child is nrml");
            }
            else {
                System.out.println("child is ubnrml");
            }
        }
        if ((b>=6)&&(c<=2)){
            if ((d>=10.5)&&(d<=13.5)){
                System.out.println("child is nrml");
            }
            else {
                System.out.println("child is ubnrml");
            }
        }
        if ((c>2)&&(c<6)){
            if ((d>=11.5)&&(d<=13.5)){
                System.out.println("child is nrml");
            }
            else {
                System.out.println("child is ubnrml");
            }
        }
        if ((c>6)&&(c<12)){
            if ((d>=11.5)&&(d<=15.5)){
                 System.out.println("child is nrml");
            }
            else {
                System.out.println("child is ubnrml");
            }
        }
    }
    }
}