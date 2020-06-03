import java.io.*;
import java.util.*;
class hashmapdemo
{
public static void main(String args[])throws IOException
{
HashMap<String, Integer> hmap=new HashMap<String,Integer>();
System.out.println(hmap);
hmap.put("Dhoni",7);
hmap.put("Kohli",18);
hmap.put("Dhawan",25);
System.out.println(hmap.containsValue(25));
hmap.put("",0);
System.out.println(hmap);
hmap.put("",10);
System.out.println(hmap);
}
}
