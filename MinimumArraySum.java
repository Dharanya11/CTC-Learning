import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] a = {4,1,6};
        int[] b = {3,1,2};
        int n=3;
        Arrays.sort(a);
        Arrays.sort(b,);
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i] * b[n - 1 - i];
        }

        System.out.println(sum);
    }
}
//1 4 3 2
//1 4 3 4