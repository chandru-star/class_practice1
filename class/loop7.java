public class loop7 {
        public static void main(String args []){
            int a[] = {1,2,3,4,5,6};
            int len = a.length;

            for(int i=0;i<len;i++){
              int  b = a[i];
                a[i] =a[len-1-i];
                a[len-1-i]=b;
            }
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            
            }
           
        }
    }
    
