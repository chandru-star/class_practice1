public class mergeinf2 {

        public static void main(String[] args) {
            int[] a = {1,2,3,4,5};
            int[] b= {6,7,8,9,0};
    
            merge(a,b);
    
           
        }
        public static void merge(int[] a, int[] b) {
            int[] c = new int[a.length + b.length];
            
            for(int i=0;i<a.length;i++){
                c[i]=a[i];
             }
             for(int j=0;j<b.length;j++){
                c[a.length+j]=b[j];
             }
            printArray(c);
        }
        public static void printArray(int[] c) {
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();
        }
    }
    

