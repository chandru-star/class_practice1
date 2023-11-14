public class arrayshort2{
    public static void main(String args[]){
    int a[] ={1,4,23};
    int b=0;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
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