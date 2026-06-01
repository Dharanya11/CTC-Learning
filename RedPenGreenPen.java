import java.util.*;

 class Main {
    public static void main(String[] args) {
        int n=6;
        int a[]={70,23,13,26,72,19};
        int e=0,o=0,r=0;
        for(int i=0;i<6;i++)
        {
            if(a[i]%2==0) e++;
            else o++;
        }
        if(e>o) r=o;
        else
        r=e;
        System.out.print(r);
    }
 }