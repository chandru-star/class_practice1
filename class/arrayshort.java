public class arrayshort{
    public static void main (String args[]){
        int a[] = {15,88,92,1100,17,0,10,1};
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

