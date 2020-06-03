import java.io.*;
import java.util.*;
class edge
{
int startvertex;
int endvertex;
edge()
{
startvertex=0;
endvertex=0;
}
edge(int s,int e)
{
startvertex=s;
endvertex=e;
}
}
class graphforbfs
{
int no_of_vertices;
int no_of_edges;
int vertices[];
int visited[][];
ArrayList<edge> edges;
graphforbfs(int n)
{
no_of_vertices=n;
no_of_edges=0;
vertices=new int[no_of_vertices];
visited=new int[no_of_vertices][2];
edges=new ArrayList<edge>();
}
void add_edge(int s,int e)
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
void bfs(int vertex)
{
int r,i;
queuell q=new queuell();
q.add(vertex);
for(i=0;i<=no_of_vertices-1;i++)
{
if(vertices[i]==vertex)
visited[i][1]=1;
}
System.out.println(vertex);
while(q.queueisempty()!=true)
{
r=q.delete();
Iterator itr=edges.iterator();
while(itr.hasNext())
{
edge obj=(edge)itr.next();
if(obj.startvertex==r && this.check_if_visited(obj.endvertex)==0)
{
for(i=0;i<=no_of_vertices-1;i++)
{
if(vertices[i]==obj.endvertex)
visited[i][1]=1;
}
q.add(obj.endvertex);
System.out.println(obj.endvertex);
}
else if(obj.endvertex==r && this.check_if_visited(obj.startvertex)==0)
{
for(i=0;i<=no_of_vertices-1;i++)
{
if(vertices[i]==obj.startvertex)
visited[i][1]=1;
}
q.add(obj.startvertex);
System.out.println(obj.startvertex);
}
}
}
}
int check_if_visited(int vertex)
{
int i;
for(i=0;i<=no_of_vertices-1;i++)
{
if(vertices[i]==vertex)
return(visited[i][1]);
}
return 1;
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,r=0,i,ch,a,s,e;
System.out.println("Enter no of vertices");
n=Integer.parseInt(br.readLine());
graphforbfs g=new graphforbfs(n);
System.out.println("Enter vertices");
for(i=0;i<=n-1;i++)
{
a=Integer.parseInt(br.readLine());
g.vertices[i]=a;
g.visited[i][0]=a;
g.visited[i][1]=0;
}
System.out.println("------OPTIONS-------");
do
{
System.out.println("Enter 1 to add edge\nEnter 2 to display edges\nEnter 3 to do bfs\nEnter 4 to exit ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("Enter start vertex then end vertex");
s=Integer.parseInt(br.readLine());
e=Integer.parseInt(br.readLine());
g.add_edge(s,e);
break;
case 2:g.print_edges();
break;
case 3:g.bfs(g.vertices[0]);
break;
case 4:System.exit(1);
}
}
while(true);
}
}
