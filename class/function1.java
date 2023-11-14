import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7};
        vel(arr);
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
    vel(arr);
    }
    public static void vel(int num[]){
        for(int i=0;i<num.length;i++){
        System.out.println(num[i]);
    }
}
}
