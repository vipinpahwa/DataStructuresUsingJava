import java.io.*;
class mergesort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
mergesort ob=new mergesort();
int n,i;
int arr[];
System.out.println("Enter size of array");
n=Integer.parseInt(br.readLine());
arr=new int[n];
System.out.println("Enter elements");
for(i=0;i<n;i++)
arr[i]=Integer.parseInt(br.readLine());
long starttime=System.nanoTime();
ob.msort(arr,0,n-1);
long endtime=System.nanoTime();
long timeElapsed=endtime-starttime;
System.out.println("Time taken: "+ timeElapsed+" nanoseconds");
System.out.println("-------SORTED ARRAY-------");
for(i=0;i<n;i++)
System.out.println(arr[i]);
}
void msort(int arr[],int l,int r)
{
//System.out.println("In msort");
int mid=(l+r)/2;
//System.out.println("l="+l+" "+"mid="+mid+" "+"r="+r);
if(l<r)
{
msort(arr,l,mid);
msort(arr,mid+1,r);
merge(arr,l,mid,r);
}
}
void merge(int arr[],int l,int mid,int r)
{
//System.out.println("In merge");
//System.out.println("l="+l+" "+"mid="+mid+" "+"r="+r);
int n1,n2,i,j,k;
n1=mid-l+1;
n2=r-mid;
/*for(i=l;i<=r;i++)
System.out.println(arr[i]);*/
int L[]=new int[n1];
int R[]=new int[n2];
for(i=0;i<n1;i++)
L[i]=arr[l+i];
for(j=0;j<n2;j++)
R[j]=arr[j+mid+1];
i=0;
j=0;
k=l;
while(i<n1 && j<n2)
{
if(L[i]<=R[j])
{
arr[k]=L[i];
i++;
}
else
{
arr[k]=R[j];
j++;
}
k++;
}
while(i<n1)
{
arr[k]=L[i];
i++;
k++;
}
while(j<n2)
{
arr[k]=R[j];
j++;
k++;
}
}
}


