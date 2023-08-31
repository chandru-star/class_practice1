import java.util.Scanner;
public class primenumber{
    public static void main(String args[]){
     System.out.println("ENTER THE NUMBER");
     Scanner sc = new Scanner(System.in);
     //int a = sc.nextInt();
     for(int i=2;i<=50;i++){
            if((i==2)||(i==3)||(i==5)||(i==7)){
                System.out.println(i + "  is primenumber");
            }
              if ((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)){     
              System.out.println(i + "  is primenumber");
              }
        
       }
          }
        }
     
    
