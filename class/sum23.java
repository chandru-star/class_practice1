public class sum23{
    public static void main(String args[]){
        int a[] ={5,6,4,7,1};
        int b =13;
        int arr[] =new int [2];
     for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i]+a[j]==b){
                arr[0]=i;
                arr[1]=j;
            }
        }
     }
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
    }
}