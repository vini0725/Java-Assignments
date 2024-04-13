public class Fibonacci {
    void m1(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a);
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Fibonacci a=new Fibonacci();
        a.m1(10);
    }
    
}
