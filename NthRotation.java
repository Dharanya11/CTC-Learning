//not optimized solution
// 1 2 1 2 3
//1 2 1 2 3

// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = 5;
//         int a[] = {1,2,1,2,3};
//         int k = 1;
//         if (s.hasNextInt()) {
//             k = s.nextInt();
//         }
//         int t[] = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             t[(i+k)%n]=a[i];
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(t[i] + " ");
//         }
//     }
// }


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = {1, 2, 1, 2, 3};
        int n = 5;

        int k = s.hasNextInt() ? s.nextInt() : 1;
        k %= n;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == a[(i - k + n) % n]) {
                count++;
            }
        }

        System.out.println(count);
    }
}