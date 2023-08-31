public class nearswap{
    public static void main(String args []){
        int a[] = {2,1,4,3,6,5,8,7};
        int len = a.length;

        for(int i=0;i<len;i=i+2){
          int  b = a[i];
            a[i] =a[i+1];
            a[i+1]=b;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}