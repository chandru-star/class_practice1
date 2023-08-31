public class arr2dsum1{
    public static void main(String args[]){
        int a[][] = {{1,2,3,7},{4,5,6,7}};
         int b[][] = {{1,2,3,9},{4,5,6,7}};
        int len = a.length;
        int c = 0;
        for(int i=0;i<len;i++){
            for(int j=0;j<a[i].length;j++){
             c =a[i][j] + b[i][j];
              System.out.println(c);
        }
            }
           
    }
}