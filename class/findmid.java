public class findmid{
    public static void main(String args[]){
      int a[] = {1,2,3,4,8,};
      int b[] = {6,7,8,9,10};
      int c[]=new int [a.length+b.length];
      int d =0;  
        for(int i=0;i<a.length;i++){
            c[i] =a[i];
        }
        
        for(int j=0;j<b.length;j++){
               c[a.length+j] =b[j];  
             
        }
    
        System.out.println(c[c.length/2]);
        System.out.println(c[c.length/2-1]);
          
        
    }
}
        
    
      
      
