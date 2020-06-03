import java.io.*;
import java.time.Instant;
import java.time.Duration;
class quicksort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i;
System.out.println("Enter size of array");
n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
System.out.println("Enter array elements");
for(i=0;i<=n-1;i++)
arr[i]=Integer.parseInt(br.readLine());
long starttime=System.nanoTime();
quicksort(arr,0,n-1);
long endtime=System.nanoTime();
long timeElapsed=endtime-starttime;
System.out.println("Time taken: "+ timeElapsed+" nanoseconds");
System.out.println("----SORTED ARRAY----");
for(i=0;i<=n-1;i++)
System.out.println(arr[i]);
}
static void quicksort(int arr[],int low,int high)
{
//System.out.println("in quicksort");
int p;
if(low>=high)
return;
else
{
//System.out.println("in quicksort else");
p=partition(arr,low,high);
quicksort(arr,low,p-1);
quicksort(arr,p+1,high);
}
}
static int partition(int arr[],int low,int high)
{
//System.out.println("in partition");
int pivot,pindex,i,t;
pivot=arr[high];
pindex=low;
for(i=low;i<=high-1;i++)
{
if(arr[i]<=pivot)
{
t=arr[i];
arr[i]=arr[pindex];
arr[pindex]=t;
pindex=pindex+1;
}
}
t=arr[high];
arr[high]=arr[pindex];
arr[pindex]=t;
return pindex;
}
}
