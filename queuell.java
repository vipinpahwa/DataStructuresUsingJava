import java.io.*;
class qnode
{
int key;
qnode next;
qnode(int value)
{
key=value;
next=null;
}
}
class queuell
{
qnode front,rear;
queuell()
{
this.front=null;
this.rear=null;
}
void add(int value)
{
qnode temp=new qnode(value);
if(front==null && rear==null)
{
front=temp;
rear=temp;
}
else
{
rear.next=temp;
rear=temp;
}
}//add ends
int delete()
{
int r;
if(front==null && rear==null)
{
System.out.println("no values to delete");
return -999;
}
else
{
r=front.key;
front=front.next;
if(front==null)
rear=null;
return r;
}
}//delete ends
void display()
{
qnode copy=front;
if(copy==null)
System.out.println("QUEUE IS EMPTY!!");
else
{
while(copy!=null)
{
System.out.print(copy.key+"--->");
copy=copy.next;
}
System.out.println();
}
}
boolean queueisempty()
{
if(this.front==null && this.rear==null)
return true;
else 
return false;
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
queuell q=new queuell();
int c,i,r;
do
{
System.out.println("1 to add in queue\n2 to delete\n3 to display\n4 to exit\n5 to check if empty");
c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("Enter value to add");
i=Integer.parseInt(br.readLine());
q.add(i);
break;
case 2:r=q.delete();
if(r!=-999)
System.out.println("Deleted value:"+r);
break;
case 3:q.display();
break;
case 4:System.exit(1);
case 5:System.out.println(q.queueisempty());
break;
default:continue;
}
}
while(true);
}
}
