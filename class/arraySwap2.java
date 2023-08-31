public class arraySwap2{
    public static void main(String args []){
        int a[] = {2,5,1,3,4,7};
        int len = a.length;

        for(int i=1;i<len/2;i=i+2){
          int  b = a[i];
            a[i] =a[i+2];
            a[i+2]=b;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}