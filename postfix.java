import java.io.*;
class postfix
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String expr;
int i,a,b,c;
char ch;
System.out.println("ENTER POSTFIX MATHEMATICAL EXPRESSION");
expr=br.readLine();
stack ob=new stack(expr.length()+1);
for(i=0;i<expr.length();i++)
{
ch=expr.charAt(i);
if((int)ch>=48 && (int)ch<=57)
ob.add(Integer.parseInt(String.valueOf(ch)));
else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
{
b=ob.delete();
a=ob.delete();
if(ch=='+')
c=a+b;
else if(ch=='-')
c=a-b;
else if(ch=='*')
c=a*b;
else
c=a/b;
ob.add(c);
}
}
System.out.println("RESULT:"+ob.delete());
}
}

