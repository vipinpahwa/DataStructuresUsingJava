import java.io.*;
import java.util.*;
class edge
{
String startvertex;
String endvertex;
edge()
{
startvertex="";
endvertex="";
}
edge(String s,String e)
{
startvertex=s;
endvertex=e;
}
}
class graph
{
int no_of_vertices;
int no_of_edges;
String vertices[];
ArrayList<edge> edges;
graph(int n)
{
no_of_vertices=n;
no_of_edges=0;
vertices=new String[no_of_vertices];
edges=new ArrayList<edge>();
}
void add_edge(String s,String e)
{
no_of_edges+=1;
edge obj=new edge(s,e);
edges.add(obj);
}
void print_edges()
{
Iterator itr=edges.iterator();  
//traversing elements of ArrayList object  
while(itr.hasNext()){  
edge e=(edge)itr.next();  
System.out.println(e.startvertex+" "+e.endvertex);
}
}
int path_exists(String s,String e)
{
int r=0;
if(s.equals(e))
return 1;
else
{
Iterator itr=edges.iterator();
while(itr.hasNext())
{
edge obj=(edge)itr.next();
if(obj.startvertex.equals(s))
r=this.path_exists(obj.endvertex,e);
}
if(r==1)
return r;
else
return -1;
}
}
int get_path(String s,String e)
{

}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,r=0,i,ch;
String s,e;
System.out.println("Enter no of vertices");
n=Integer.parseInt(br.readLine());
graph g=new graph(n);
System.out.println("Enter vertices");
for(i=0;i<=n-1;i++)
g.vertices[i]=br.readLine();
System.out.println("------OPTIONS-------");
do
{
System.out.println("Enter 1 to add edge\nEnter 2 to display edges\nEnter 3 to check if path exists\nEnter 4 to exit ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("Enter start vertex then end vertex");
s=br.readLine();
e=br.readLine();
g.add_edge(s,e);
break;
case 2:g.print_edges();
break;
case 3:System.out.println("Enter start vertex then end vertex");
s=br.readLine();
e=br.readLine();
r=g.path_exists(s,e);
if(r==1)
System.out.println("Path exists");
else 
System.out.println("Path does not exist");
break;
case 4:System.exit(1);
}
}
while(true);
}
}

