public class swaploop{
    public static void main (String args[]){
        int a[] ={9,5,4,6,0,1,3,22,55,21};
        int len = a.length;

        for( int i=0;i<len;i++){
           int b = a[i];
            a[i] =a[len-1];
            a[len-1] = b;
            len--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}