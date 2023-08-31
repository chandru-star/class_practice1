public class array{
    public static void main (String args []){
        String student[] = {"chandru" , "sathishkumar" , "yogesh" , "naveen" , "velu" };
        int len = student.length;
        //String a =0;
        String a;
         a= student[0];
         student[0]=student[4];
         student[4]= a;
        System.out.println(len);
         System.out.println(student[0]);
          System.out.println(student[4]);
        //   System.out.println(student[1]);
        //    System.out.println(student[2]);
        //  System.out.println(student[3]);
        //   System.out.println(student[4]);
         // System.out.println(student[]);
    }
}