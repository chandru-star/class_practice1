public class arrshort{
    public static void main (String args[]){
        int a[] = {10,20,3,4,5,6,7};
        int len = a.length;
        int b =0;
    
    for(int i=0;i<len;i++){
        for(int j=0;j<len;j++){
            if(a[j]>a[i]){
                b = a[i];
                a[i] = a[j];
                a[j] = b;
            }
            
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    }

