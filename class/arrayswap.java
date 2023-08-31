public class arrayswap{
    public static void main (String args[]){
        int a[] = {12,13,14,15,16};
        int len = a.length;
        int b = a[0];
         int c = a[1];
         a[0] = a[4];
         a[1] = a[3];
         

        System.out.println(len);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(c);
        System.out.println(b);
    }
}