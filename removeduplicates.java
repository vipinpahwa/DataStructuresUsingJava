import java.io.*;
class removeduplicates
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
int i,n,j,k,size;
System.out.println("Enter no of elements");
n=Integer.parseInt(br.readLine());
String strarr[]=new String[n];
System.out.println("Enter elements");
for(i=0;i<n;i++)
strarr[i]=br.readLine();
for(i=0;i<=n-2;i++)
{
if(strarr[i]!="")
{
for(j=i+1;j<=n-1;j++)
{
if(strarr[i].equals(strarr[j]))
strarr[j]="";
}
}
}

size=n-1;
for(i=0;i<=size;i++)
{
if(strarr[i].equals(""))
{
for(k=i;k<=size-1;k++)
strarr[k]=strarr[k+1];
size=size-1;
i=i-1;
}
}
System.out.println("after removing duplicates");
for(i=0;i<=size;i++)
System.out.println(strarr[i]);
System.out.println(strarr.length+" "+size);
}
}
