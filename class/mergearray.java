
public class mergearray {
    public static void main(String args[]){
        int a[] = {9,8,7,6};
        int b[] = {5,4,3,2,1};
        int c[]= new int[a.length+b.length];

       for(int i=0;i<a.length;i++){
          c[i]=a[i];
       }
       for(int j=0;j<b.length;j++){
          c[a.length+j]=b[j];
       }
       for(int k=0;k<c.length;k++){
        System.out.println(c[k]);
       }
    }
}
