import java.io.*;
import java.util.*;
class Unique
{
 public static void main(string ag[])
 {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the Array Size:");
   int n=s.nextInt();
   int a[]=new int[n];
   int i=0;
   for(i=0;i<n;i++)
      a[i]=s.nextInt();
   Arrays.sort(a);
   for(i=0;i<n;i++)
     {
       if(a[i]==i)
          System.out.println(a[i]);
      }
  }
}
