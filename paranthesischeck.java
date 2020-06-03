import java.io.*;
class stackch
{
char arr[];
int top,size;
stackch(int size)
{
this.size=size;
arr=new char[size];
top=-1;
}
void push(char value)
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
void pop()
{
if(top==-1)
{
System.out.println("NO VALUES TO DELETE!!");
}
else
top=top-1;
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
char charattop()
{
if(top!=-1)
return arr[top];
else return' ';
} 
}
class paranthesischeck
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String expr;
int i;
boolean flag=true;
char ch;
System.out.println("Enter expression");
expr=br.readLine();
stackch ob=new stackch(expr.length()+1);
outer: 
for(i=0;i<expr.length();i++)
{
ch=expr.charAt(i);
if(ch=='('||ch=='{'||ch=='[')
ob.push(ch);
else if(ch==')')
{
if(ob.charattop()=='(')
ob.pop();
else
{
flag=false;
break outer;
}
}
else if(ch=='}')
{
if(ob.charattop()=='{')
ob.pop();
else
{
flag=false;
break outer;
}
}
else if(ch==']')
{
if(ob.charattop()=='[')
ob.pop();
else
{
flag=false;
break outer;
}
}
}
if(flag==false||ob.top!=-1)
System.out.println("unbalanced");
else
System.out.println("balanced");
}
}