public class arraySwap2{
    public static void main(String args []){
        int a[] = {2,5,1,3,4,7};
        int len = a.length;

        for(int i=0;i<len-1;i++){
           if(a[i]>a[i+1]){
            int b = a[i];
            a[i] = a[i+1];
            a[i+1] = b;
           }
        }
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
       
        }
    }
}