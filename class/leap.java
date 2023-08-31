public class leap{
    public static void main(String args[]){
        int a[] ={2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
        int len = a.length;
        int b=0;
        for(int i=0;i<len;i++){
            if(a[i]%4==0){
                 b +=1;
                System.out.println(a[i]);
            }
        }
       // for(int i=0;i<len;i++){
         //   if(a[i]%4==0){
             
          System.out.println(b);     
        }
    }
     
//}
//}