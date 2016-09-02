import java.io.*;
import java.util.*;
class Unique
{
  public static void main()
  {
    Scanner s=new Scanner(System.in);
    ArrayList<Integer> a=new ArrayList<Integer>();
    int n=s.nextInt();
    int i=0;
    for(i=0;i<n;i++)
       a.add(s.next());
    i=n;
    while(n!=0)
     {
       int r=a.get(i);
       a.remove(a.get(i));
       int q=a.size();
        if(1==(n-q))
          Sysetm.out.println(r);
        i=q;
        n=q;
        }
  }
}
