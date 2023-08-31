import java.util.Scanner;
public class findchar{
    public static void main (String args[]){
       System.out.println("enter the data");
       Scanner sc = new Scanner(System.in);
       char a = sc.next().charAt(0);
      // char b =  sc.next().charAT(0);

      // if ((a>='0')&&(a<='9')){
        //  System.out.println("it is numbers");
       //}
        if((a>='A')&&(a<='Z')){
        System.out.println("it is Alphabet");
            if (a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                System.out.println("it is vowel");
            }
            else {
                System.out.println("it is not a vowel");
            }
       }
       //else {
        //System.out.println("it is spl characters");
       //}
    }
}