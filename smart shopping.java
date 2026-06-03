import java.util.*;
class Main{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        int n,k,m=0,ans=0;
        n=s.nextInt();
        k=s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i+=k)
        {
            int sum=0;
            int max=Integer.MIN_VALUE;
            int count=0;
            for(int j=i;j<n&&count<k;j++,count++)
            {
                sum+=a[j];
                max=Math.max(max,a[j]);
            }
            if(count==k)    ans+=sum-max;
            else ans=ans+sum;
        }
         System.out.print(ans);       
    }
}

// 8

// 2

// 3 10 5 8 50 7 12 16
// 27