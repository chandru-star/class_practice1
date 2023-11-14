public class mergeinf {
    private static int[] merge;
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={6,7,8,9,0};
        int[] merge = mergearray(a,b);

        System.out.println(merge);
    }
    public static void int[] mergearray(int a[],int b[]){
      int c[] = {a.length + b.length };
      for(int i=0;i<a.length;i++){
        c[i]=a[i];
     }
     for(int j=0;j<b.length;j++){
        c[a.length+j]=b[j];
     }
     for(int k=0;k<c.length;k++){
      System.out.println(c[k]);
     }

        }
      }
     

