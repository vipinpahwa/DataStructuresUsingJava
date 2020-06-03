import java.io.*;
class combinations
{
public static String remove(String s,int p)
{
if(p<s.length()-1)
return(s.substring(0,p)+s.substring(p+1));
else
return(s.substring(0,p));
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,k,c,l,size,sum,top;
String str="",s="";
System.out.println("Enter no of elements");
n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
System.out.println("Enter elements");
for(i=0;i<n;i++)
arr[i]=Integer.parseInt(br.readLine());
String strarr[]=new String[100];
for(i=0;i<=n-1;i++)
str=str+String.valueOf(i);
strarr[0]=str;
System.out.println(strarr[0]);
k=0;
c=0;
while(strarr[k].length()!=2)
{
//System.out.println("k="+k);
str=strarr[k];
l=str.length();
for(j=0;j<l;j++)
{
//System.out.println("j="+j);
s=remove(str,j);
//System.out.println(s);
strarr[++c]=s;
}
k=k+1;
//System.out.println("k is incremented");
}
System.out.println("after bla bla");
for(i=0;i<=c;i++)
System.out.println(strarr[i]);
int sumarr[]=new int[c+1];
for(i=0;i<=c;i++)
{
sum=0;
str=strarr[i];
l=str.length();
for(j=0;j<l;j++)
sum=sum+arr[Integer.parseInt(str.charAt(j)+"")];
sumarr[i]=sum;
}
for(i=0;i<=c;i++)
System.out.println(sumarr[i]);

}
}