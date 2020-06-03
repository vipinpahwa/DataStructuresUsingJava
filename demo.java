import java.io.*;
class demo
{
int a,b,c;
demo()
{
a=0;
b=0;
c=0;
}
void add()
{
a=a+1;
b=b+20;
c=c+30;
}
void subtract()
{
a=a-1;
b=b-10;
c=c-11;
}
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
}
public static void main(String args[])
{
demo obj=new demo();
obj.add();
obj.display();
obj.add();
obj.display();
obj.subtract();
obj.display();
obj.subtract();
}
}