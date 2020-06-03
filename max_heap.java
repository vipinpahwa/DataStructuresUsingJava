import java.io.*;
class max_heap
{
void build_max_heap(int arr[])
{
int heap_size,i,n;
heap_size=arr.length;
n=(int)Math.floor(heap_size/2);
for(i=n;i>=1;i--)
{
max_heapify(arr,i);
}
}
void max_heapify(int arr[],int i)
{
int l,r,heap_size=arr.length,large,temp;
l=2*i;
r=2*i+1;
if(l<=heap_size-1 && arr[l]>arr[i])
large=l;
else
large=i;
if(r<=heap_size-1 && arr[r]>arr[large])
large=r;
if(large!=i)
{
temp=arr[i];
arr[i]=arr[large];
arr[large]=temp;
this.max_heapify(arr,large);
}
}
void heap_sort(int arr[],int size)
{
int i,l,r,temp;
System.out.println(arr[1]);
if(size==1)
return;
else
{
arr[1]=arr[size];
size=size-1;
i=1;
while(2*i<=size)
{
l=i*2;
r=i*2+1;
if(arr[l]>arr[r])
{
temp=arr[l];
arr[l]=arr[i];
arr[i]=temp;
i=l;
}
else if(arr[r]>arr[i])
{
temp=arr[r];
arr[r]=arr[i];
arr[i]=temp;
i=r;
}
else break;
}//while ends
heap_sort(arr,size);
}//else ends
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
max_heap ob=new max_heap();
int size,k=1,j=0,i;
int arr[];
System.out.println("Enter size of heap");
size=Integer.parseInt(br.readLine());
arr=new int[size+1];
System.out.println("Enter elements");
for(i=1;i<=size;i++)
arr[i]=Integer.parseInt(br.readLine());
ob.build_max_heap(arr);
for(i=1;i<=size;i++)
System.out.println(arr[i]);
System.out.println("-------------");
ob.heap_sort(arr,size);
}
}
