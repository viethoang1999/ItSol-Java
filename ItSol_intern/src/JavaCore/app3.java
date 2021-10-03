package JavaCore;

public class app3 {
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    public static int leastCommonMultiple(int a, int b) {
        return (a * b) / greatestCommonDivisor(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Ước số chung lớn nhất: " + greatestCommonDivisor(15, 40));
        System.out.println("Bội số chung nhỏ nhất: " + leastCommonMultiple(15, 40));
    }
}
