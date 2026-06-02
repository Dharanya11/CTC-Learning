import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        int pc=100,puc=20,coc=10;
        int p,pu,co;
        p=s.nextInt();
        pu=s.nextInt();
        co=s.nextInt();
        t=(p*pc)+(pu*puc)+(co*coc);
        System.out.println(p);
        System.out.println(pu);
        System.out.println(co);
        System.out.println(t);
    }
}
//10 
// 12
// 5
// 10
// 12
// 5
// 1290