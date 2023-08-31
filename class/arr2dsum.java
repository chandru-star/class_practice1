public class arr2dsum{
    public static void main (String args[]){
         int arr[][] = new int[3][3];
       int  a[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int b = 0;
    for( int i=0;i<a.length;i++){
        for( int j=0;j<a.length;j++){
              b +=a[i][j];
          //  System.out.print(b);
        }
           
    }
    System.out.println(b);
    }
}