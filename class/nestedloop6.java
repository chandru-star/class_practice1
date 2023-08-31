public class nestedLoop6{
    public static void main (String args[]){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
            System.out.print(" ");
            }
             for(int j=i;j>1;j--){
            System.out.print(j);
            }
             for(int j=1;j<=i;j++){
            System.out.print(j);
            }
                System.out.println();
            
            }
        for(int i=4;i>=1;i--){
            for(int j=i;j<=5;j++){
            System.out.print(" ");
            }
             for(int j=i;j>1;j--){
            System.out.print(j);
            }
             for(int j=1;j<=i;j++){
            System.out.print(j);
            }
                System.out.println();
            
            }
        
          }
}