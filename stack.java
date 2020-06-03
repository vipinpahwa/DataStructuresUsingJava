
import java.io.*;
class stack
{
int arr[];
int top,size;
stack(int size)
{
this.size=size;
arr=new int[size];
top=-1;
}
void add(int value)
{
if(top==-1)
{
top=0;
arr[top]=value;
}
else if(top==size-1)
System.out.println("STACK FULL!!");
else
{
top=top+1;
arr[top]=value;
}
}//add ends
int delete()
{
int r;
if(top==-1)
{
System.out.println("NO VALUES TO DELETE!!");
return -999;
}
else
{
r=arr[top];
top=top-1;
return r;
}
}//delete ends
void display()
{
if(top!=-1)
{
for(int i=top;i>=0;i--)
System.out.println("|"+arr[i]+"|");
}
else
System.out.println("STACK EMPTY!!");
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int size,ch,v,r;
System.out.println("Enter size of stack:");
size=Integer.parseInt(br.readLine());
stack s=new stack(size);
do
{
System.out.println("ENTER 1 TO ADD\n2 TO DELETE\n3 TO PRINT\n4 TO EXIT");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("enter value");
v=Integer.parseInt(br.readLine());
s.add(v);
break;
case 2:r=s.delete();
if(r!=-999)
System.out.println("Deleted value:"+r);
break;
case 3:s.display();
break;
case 4:System.exit(1);
}
}
while(true);
}
}



