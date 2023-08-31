public class sum2{
    public static void main(String args[]){
        int a[] ={7,8,24,2};
        int len = a.length;
        int target = 9;
        int b =0;
        int arr[]=new int [2];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){ 
                 if(a[i] + a[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                  // System.out.println(a[i]+" and "+a[j]);
                //  System.out.println(i+" and "+j);
                 
               }
             }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
         }
     }    
        
         
    
