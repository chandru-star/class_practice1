public class arrswap{
    public static void main (String args []){
        int a[] = {1,3,5,7,9};
        int len = a.length;
        int b = a [0];
        a[0] = a[4];
        a[4] = b ;
        System.out.println(len);
        System.out.println(a[0]);
         System.out.println(a[4]);
     }
}