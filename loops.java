import java.util.*;
class loops
    {
     public static void main(String args[])
            {
              Scanner sc=new Scanner(System.in);
             System.out.println("Enter the parameters");
             int i=sc.nextInt();
             String k="l";
             for(int a=0;a<=i;a++)
                { 
                 for(int b=0;b<=a;b++)
                  {
                    System.out.print(k+"\t");
                  }
                 System.out.println("  ");
                 }
                 sc.close();
     } 
 }
