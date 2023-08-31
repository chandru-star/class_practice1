import java.util.Scanner;
public class hemoglobin{
    public static void main (String args[]){
     System.out.println("enter the data");   
    Scanner sc = new Scanner(System.in);
    char a = sc.next().charAt(0);
    int  b = sc.nextInt();
    float c = sc.nextFloat();

    if (a=='m'){
        if ((b>=12)&&(b<=18)){
            if  ((c>=13.0)&&(c<=16.0)){
                System.out.println("he is nrml");
            }
            else {
                System.out.println("he is ubnrml");
            }
        }
         if (b>18){
            if ((c>=13.6)&&(c<=17.7)){
                System.out.println(" HE IS NRML");
            }
            else {
                System.out.println(" HE IS UBNRML");
            }
        }
    }
     else if (a=='f'){
        if ((b>=12)&&(b<=18)){
            if ((c>=12.0)&&(c<=16.0)){
                System.out.println("she is nrml");
            }
            else {
                System.out.println("she is ubnrml");
            }
        }
        if (b>18){
            if ((c>=13.1)&&(c<=15.1)){
                System.out.println(" SHE IS NRML");
            }
            else {
                System.out.println(" SHE IS UBNRML");
            }
            }
        
    }
    }
}