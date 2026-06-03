// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int e=0,o=0,r;
        n=s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0) e++;
            else o++;
        }
        if(o<e) r=o;
        else if(o==e) r=o;
        else r=e;
        System.out.println(r*2);
        
        
    }
}