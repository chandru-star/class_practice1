public class swap{
    public static void main (String args[]){
        int a = 8;
        int b =6;
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}