package work;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            arr[i]=a;
        }
        for (int a = 0; a < k; a++) {
            int f = f(a);
            int i =0;
            while (i<=a){
                if (f(i) == f){
                    break;
                }
                i++;
            }
            System.out.println(f+" "+i);
        }
    }

    public static void method(int start, int end) {
        int count=0;
        if(start>end) {
            int temp=start;
            start=end;
            end=temp;
        }
        //write your code here......
        for (int i = start; i <= end ; i++) {
            if(isPrime(i)) {
                count++;
            }
        }

        System.out.println(start+"到"+end+"之间有"+count+"个大于2的素数");
    }
    public static boolean isPrime(int n) {
        if(n<=2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] mem = new int[10001];
    public static int f(int n){
        if(n<2){
            return n;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        mem[n]=f(n/2)+f(n%2);
        return mem[n];
    }
}
