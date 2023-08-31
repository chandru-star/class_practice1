public class arr2dswap{
    public static void main (String args[]){
         int arr[][] = new int[3][3];
       int  a[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int len = a.length;
       int b=0;
    for( int i=0;i<a.length;i++){
        for( int j=0;j<len/2;j++){
           b = a[i][j];
           a[i][j] = a[i][len-1-j];
           a[i][len-1-j] = b;
        }
    }
     for(int i=0;i<a.length;i++){
     for(int j=0;j<a[0].length;j++){
           System.out.print(a[i][j]);
     }
            System.out.println();
     }
      
    }
}