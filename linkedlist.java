import java.io.*;
class node
{
int key;
node next;
node(int value)
{
key=value;
this.next=null;
}
}
class linkedlist
{
node start;
linkedlist()
{
start=null;
}
void add(int value)
{
if(start==null)
start=new node(value);
else
{
node temp=start;
while(temp.next!=null)
temp=temp.next;
temp.next=new node(value);
}
}
int remove()
{
int r;
if(start==null)
{
System.out.println("no values to remove");
return -999;
}
else
{
if(start.next==null)
{
r=start.key;
start=null;
}
else
{
node temp=start;
while(temp.next.next!=null)
temp=temp.next;
r=temp.next.key;
temp.next=null;
}
return r;
}
}
void display()
{
if(start==null)
System.out.println("No values to print!!");
else
{
node temp=start;
while(temp!=null)
{
System.out.println(temp.key);
temp=temp.next;
}
}
}//display ends
void reverse()
{
node temp,temp1;
temp1=start;
temp=start;
if(temp.next==null)
System.out.println("only 1 node");
else
{
while(temp.next!=null)
{
temp1=temp;
temp=temp.next;
}
temp1.next=null;
System.out.println("before rec");
temp.next=this.rec();
System.out.println("after rec");
start=temp;
}//else
}//reverse ends
public node rec()
{
System.out.println("in rec");
this.display();
node temp,temp1;
temp=start;
temp1=start;
if(temp.next==null)
{
return start;
}
else
{
while(temp.next!=null)
{
temp1=temp;
temp=temp.next;
}
temp1.next=null;
temp.next=rec();
return temp;
}//else ends
}//rec ends
void reverseusingitr()
{
node prev,current,next;
prev=null;
current=start;
while(current!=null)
{
next=current.next;
current.next=prev;
prev=current;
current=next;
}
start=prev;
}//func ends
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c,i,r;
linkedlist ob=new linkedlist();
do
{
System.out.println("1 to add in linked lsit\n2 to delete\n3 to display\n4 to reverse\n5 to exit\n");
c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("Enter value to add");
i=Integer.parseInt(br.readLine());
ob.add(i);
break;
case 2:r=ob.remove();
if(r!=-999)
System.out.println("Deleted value:"+r);
break;
case 3:ob.display();
break;
case 4:ob.reverseusingitr();
break;
case 5:System.exit(1);
default:continue;
}
}
while(true);
}
}
