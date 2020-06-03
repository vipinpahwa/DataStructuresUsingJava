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
public class queuefornode
{
int size,front,rear;
node arr[];
queuefornode(int size)
{
this.size=size;
arr=new node[size];
this.front=-1;
this.rear=-1;
}
public void enqueue(node n)
{
if(front==-1 && rear==-1)
{
front=0;
rear=0;
arr[rear]=n;
System.out.println("1st if condition");
}
else if(rear>=size-1)
{
System.out.println("Queue full!!");
}
else
arr[++rear]=n;
}
public node dequeue()
{
node n;
if((front==-1 && rear==-1))
{
System.out.println("No value to delete!!");
return null;
}
else
{
n=arr[front];
front=front+1;
if(front>rear)
{
front=-1;
rear=-1;
}
return n;
}
}
public void display()
{
int i;
for(i=front;i<rear;i++)
System.out.println(arr[i].key);
}
}