public class numinloop2{
    public static void main (String args[]){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int j=5;j>i;j--){
                System.out.print(j);
            }
               System.out.println();
        }
    }
}