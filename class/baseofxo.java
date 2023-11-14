import java.util.*;
public class baseofxo {
    public static void main(String[] args) {
        int b =0;
       base(b);
     }
    public static void base(int a){
     for(int i=0;i<3;i++){
            if(i<3){
                System.out.print(" | ");
            }
        for(int j=0;j<3;j++){
            System.out.print("-");
            if(j<3){
                System.out.print(" | ");
            }
        }   
        System.out.println(); 
    }
}
}
