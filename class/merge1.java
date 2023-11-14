public class merge1{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int b[]={7,8,9,10};
        int c[]= new int[a.length+b.length];

       for(int i=0;i<a.length;i++){
          c[i]=a[i];
       }
       for(int j=0;j<b.length;j++){
          c[a.length+j]=b[j];
       }
       for(int k=0;k<c.length;k++){
        System.out.println(c[k]);
       }
       System.out.println(c[c.length/2]);
        System.out.println(c[c.length/2-1]);
    }
}