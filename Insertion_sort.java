import java.util.*;
class Insertion_sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];

int i,j,k,temp;

System.out.println("Enter 5 eliment");

for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<5;i++)
{
System.out.println(a[i]);
}

for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[j];
for(k=j;k>i;k--)
{
a[k]=a[k-1];
}

a[k]=temp;

}
}
}

System.out.println("After sort");
for(i=0;i<5;i++)
{

System.out.println(a[i]);
}
}
}