import java.util.*;

 class Main {
    public static void main(String[] args) {
        int a[]={2,1,3,1};
        int n=4;
        int i=0,j=0;
        while(i<n)
        {
            j=i;
            i=i+a[i];
        }
        System.out.print(j);
    }
    
 }