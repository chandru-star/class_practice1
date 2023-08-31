public class findnuminarr{
    public static void main(String args []){
        int a[] = {7,5,20,10,31,42,61,78};
        int len = a.length;
        int target = 31;

        for(int i=0;i<len;i++){
            if(a[i]==target){
                // int b =a[i];
                System.out.println(i);
            }
        }
    }
}