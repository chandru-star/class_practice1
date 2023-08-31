public class array2{
    public static void main (String args[]){
        int a[] = {10,20,3,4,5,6,7};
        int len = a.length;
        int b = a[0];

        for(int i=0;i<len;i++){
            if(a[i]<b){
                b = a[i];
            }
        }
         System.out.println(b);
    }
}