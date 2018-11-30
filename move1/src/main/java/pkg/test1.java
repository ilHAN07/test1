import test2;

public class test1
{
    public static void main (String []args)
    {
          test2 o = new test2();
          int k = o.entree();
          for (int i=0; i<k;i++) {
               System.out.println("premier test  " + i);
          }
     }
}