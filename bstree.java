import java.io.*;
class node
{
int key;
node left,right;
node(int value)
{
key=value;
left=null;
right=null;
}
}
class bstree
{
node root;
int nodes;
bstree()
{
root=null;
nodes=0;
}
node insert(int value, node n)
{
if(n==null)
return new node(value);
else if(value>n.key)
n.right=insert(value,n.right);
else
n.left=insert(value,n.left);
return n;
}//insert ends
void count_no_of_nodes(node n)
{
if(n!=null)
{
count_no_of_nodes(n.left);
nodes+=1;
count_no_of_nodes(n.right);
}
}
void displayinorder()
{inorder(root);}
void displaypreorder()
{preorder(root);}
void displaypostorder()
{postorder(root);}
void displaylevelorder()
{levelorder(root);}
void levelorder(node root)
{
node r;
queuefornode q=new queuefornode(15);
q.enqueue(root);
while(q.front!=-1 && q.rear!=-1)
{
r=q.dequeue();
System.out.println(r.key);
if(r.left!=null)
q.enqueue(r.left);
if(r.right!=null)
q.enqueue(r.right);
}
}
void inorder(node root)
{
if(root!=null)
{
inorder(root.left);
System.out.println(root.key);
inorder(root.right);
}
}
void preorder(node root)
{
if(root!=null)
{
System.out.println(root.key);
preorder(root.left);
preorder(root.right);
}
}
void postorder(node root)
{
if(root!=null)
{
postorder(root.left);
postorder(root.right);
System.out.println(root.key);
}
}//postorder ends
public boolean search(int value,node root)
{
if(root==null)
return false;
if(root.key==value)
return true;
else if(value<root.key)
return this.search(value,root.left);
else if(value>root.key)
return this.search(value,root.right);
return false;
}//search ends
public node findlca(node root,int v1,int v2)
{
if(!(this.search(v1,root)&&this.search(v2,root)))
return null;
else
{
if((v1<root.key&&v2>root.key)||(v2<root.key&&v1>root.key))
return root;
else if(v1>root.key&&v2>root.key)
return this.findlca(root.right,v1,v2);
else if(v1<root.key&&v2<root.key)
return this.findlca(root.left,v1,v2);
else if(v1==root.key||v2==root.key)
return root;
}
return root;
}//function ends
public int getheight(node root,int v)
{
if(!this.search(v,root))
return -1;
else
{
if(v==root.key)
return 0;
else if(v>root.key)
return 1+this.getheight(root.right,v);
else if(v<root.key)
return 1+this.getheight(root.left,v);
}
return 0;
}//function ends
public int getdistance(node root,int v1,int v2)
{
node temp=this.findlca(root,v1,v2);
if(temp==null)
return -999;
else
{
int h1=this.getheight(temp,v1);
int h2=this.getheight(temp,v2);
return (h1+h2);
}
}//function ends
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c,i,s,v1,v2;
bstree bs=new bstree();
do
{
System.out.println("enter 1 to insert\n2 to display in inorder\n3 to display in preorder\n4 to display in postorder\n5 to fisplay in level order\n6 to count no of nodes\n7 to search\n8 to find lca\n9 to find height\n10 to find distance between two nodes\n11 to exit");
c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("Enter value to insert");
i=Integer.parseInt(br.readLine());
bs.root=bs.insert(i,bs.root);
break;
case 2:bs.displayinorder();
break;
case 3:bs.displaypreorder();
break;
case 4:bs.displaypostorder();
break;
case 5:bs.displaylevelorder();
break;
case 6:bs.count_no_of_nodes(bs.root);
System.out.println("no of nodes: "+bs.nodes);
bs.nodes=0;
break;
case 7:System.out.println("Enter search element");
s=Integer.parseInt(br.readLine());
if(bs.search(s,bs.root))
System.out.println("FOUND");
else
System.out.println("NOT FOUND");
break;
case 8:System.out.println("Enter two elements");
v1=Integer.parseInt(br.readLine());
v2=Integer.parseInt(br.readLine());
node temp=bs.findlca(bs.root,v1,v2);
if(temp!=null)
System.out.println("Value at lca="+temp.key);
else
System.out.println("null");
break;
case 9:System.out.println("enter element to find its height");
v1=Integer.parseInt(br.readLine());
System.out.println(bs.getheight(bs.root,v1));
break;
case 10:System.out.println("Enter two elements");
v1=Integer.parseInt(br.readLine());
v2=Integer.parseInt(br.readLine());
System.out.println(bs.getdistance(bs.root,v1,v2));
break;
case 11:System.exit(1);
default:continue;
}
}
while(true);
}
}




