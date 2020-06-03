import java.io.*;
class snode
{
int value;
snode next;
snode(int value)
{
this.value=value;
next=null;
}
}
class stackll
{
snode top,first;
int n,size;
stackll(int size)
{
top=null;
first=null;
n=0;
this.size=size;
}
void add(int value)
{
snode temp=new snode(value);
if(top==null && first==null)
{
first=temp;
top=temp;
n=1;
}
else if(n==size)
System.out.println("STACK FULL!!");
else
{
n=n+1;
top.next=temp;
top=temp;
}
}//add ends
int delete()
{
int r;
snode temp;
if(top==null && first==null)
{
System.out.println("NO VALUE TO DELETE!!");
return -999;
}
else if((first!=null)&&(first==top))
{
r=top.value;
top=null;
first=null;
n=n-1;
return r;
}
else
{
r=top.value;
temp=first;
while(temp.next!=top)
temp=temp.next;
temp.next=null;
top=temp;
n=n-1;
return r;
}
}//delete ends
int get()
{
if(top!=null)
return top.value;
else return -999;
}
boolean isempty()
{
if(top==null && first==null)
return true;
else return false;
}
void display()
{
snode temp;
temp=first;
if(first!=null)
{
while(temp!=null)
{
System.out.println(temp.value);
temp=temp.next;
}
}
else
System.out.println("STACK EMPTY!!");
}//display ends
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int size,c,i,r;
System.out.println("enter size of stack");
size=Integer.parseInt(br.readLine());
stackll s=new stackll(size);
do
{
System.out.println("1 to add in stack\n2 to delete\n3 to display\n4 to exit\n5 to get");
c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("Enter value to add");
i=Integer.parseInt(br.readLine());
s.add(i);
break;
case 2:r=s.delete();
if(r!=-999)
System.out.println("Deleted value:"+r);
break;
case 3:s.display();
break;
case 4:System.exit(1);
break;
case 5:System.out.println(s.get());
default:continue;
}
}
while(true);
}
}




