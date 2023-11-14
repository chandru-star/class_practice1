import java.util.Scanner;
public class function2{
    public static void main (String args []){
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner (System.in);
         for(int i=0;i<9;i++){
        int a = sc.nextInt();
        move(a);
         }
         
        }
        public static void move(int numb){
        switch(numb){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;
            case 6:
            System.out.println("six");
            break;
            case 7:
            System.out.println("seven");
            break;
            case 8:
            System.out.println("eight");
            break;
            case 9:
            System.out.println("nine");
            break;
            default:
                System.out.println("there is no day available");
                break;
        
        }
       
}
}

