public class arr2d3{
    public static void main (String args[]){
         int arr[][] = new int[3][3];
       int  a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            int b = 0;
     for(int j=a.length-1;j>=0;j--){
        arr[i][b]=a[j][i];
        b++;
     }
     }
      for(int i=0;i<arr.length;i++){
     for(int j=0;j<arr.length;j++){
        System.out.print(arr[i][j]);
    }
    System.out.println();
}
    }
}
