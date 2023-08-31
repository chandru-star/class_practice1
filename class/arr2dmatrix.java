public class arr2dmatrix{
    public static void main (String args[]){
        int a[][] = {{1,2},{2,1}};
        int b[][] = {{2,1},{1,2}};
        int c[][] = new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               int d = 0; 
                for(int k =0;k<a.length;k++){
                d +=a[k][i]*b[k][j];
                }
                c[i][j]+=d;
            }
            
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
           
            System.out.println(c[i][j]);
        }

    }
}