import java.io.*;
import java.util.*;
class cachemethods
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,c=0,deleted,q,x,y;
HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
String arr[],str[];
n=Integer.parseInt(br.readLine());
q=Integer.parseInt(br.readLine());
arr=new String[q];
queue qu=new queue(q);
for(i=0;i<q;i++)
arr[i]=br.readLine();
for(i=0;i<q;i++)
{
str=arr[i].split(" ");
if(str[0].equals("SET"))
{
x=Integer.parseInt(str[1]);
y=Integer.parseInt(str[2]);
if(hmap.containsKey(x)==false && c<n)
{
hmap.put(x,y);
c=c+1;
qu.add(x);
}
else if(c==n)
{
deleted=qu.delete();
hmap.remove(deleted);
hmap.put(x,y);
}
}
else
{
x=Integer.parseInt(str[1]);
if(hmap.containsKey(x))
System.out.println(hmap.get(x));
else
System.out.println(-1);
}
}//for ends
}//main ends
}//class ends




