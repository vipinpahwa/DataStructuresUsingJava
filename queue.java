import java.io.*;
public class queue
{
int size,front,rear;
int arr[];
queue(int size)
{
this.size=size;
arr=new int[size];
this.front=-1;
this.rear=-1;
}
void add(int value)
{
if(front==-1 && rear==-1)
{
front=0;
rear=0;
arr[rear]=value;
rear=rear+1;
System.out.println("1st if condition");
}
else if(rear>=size)
{
System.out.println("Queue full!!");
System.out.println("2nd if condition");
}
else
{
arr[rear]=value;
rear=rear+1;
System.out.println("3rdj if condition");
}
System.out.println("front="+front);
System.out.println("rear="+rear);
}
int delete()
{
int value;
if((front==-1 && rear==-1)||(front>=size))
{
System.out.println("No value to delete!!");
return -999;
}
else
{
value=arr[front];
front=front+1;
return value;
}
}
void display()
{
int i;
for(i=front;i<rear;i++)
System.out.println(arr[i]);
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c,i,r;
queue q=new queue(6);
do
{
System.out.println("Enter 1 to add \n 2 to delete\n3 to stop");
c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("Enter value");
i=Integer.parseInt(br.readLine());
q.add(i);
q.display();
break;
case 2:r=q.delete();
if(r!=-999)
System.out.println("Deleted value:"+r);
q.display();
break;
case 3:System.exit(1);
}
}
while(true);
}
}