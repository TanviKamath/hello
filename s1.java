import java.util.*;
public class s1
{
 public static void main(String[] args)
 {
  Vector<Integer> vec = new Vector<Integer>();
  vec.addElement(4);
  vec.addElement(3);
  vec.addElement(2);
  vec.addElement(1);
  for(int i=0;i<vec.size();i++)
  {
   System.out.println(vec.elementAt(i) +" ");
  }
 }
}