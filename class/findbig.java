public class findbig{
    public static void main(String args[]){
        int a[] = {1,2,3,4,56,7,8,};
        int len = a.length;
       // int b[] = {0};
       int max=a[0];
        for(int i=0;i<len;i++){
        
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        }
    }
