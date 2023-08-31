public class nestedloop3{
    public static void main(String args[]){
         for(int i=1;i<=5;i++){
            for(int k=0;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
            System.out.print(j);
            }
                System.out.println();
            
            }
    }
}