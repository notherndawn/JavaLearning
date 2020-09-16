package min3;

public class Min3 {
    public static void main(String[] args) {
        int a = -5;
        int b = 56;
        int c = 0;
        System.out.println(min(a, b, c));
    }

    private static int min(int a, int b, int c){
        int minimum;
        if (a <= b && a <= c) {
            minimum = a;
        } else if (b <= c && b <= a) {
            minimum = b;
        } else {
            minimum = c;
        }
        return minimum;
    }
}
