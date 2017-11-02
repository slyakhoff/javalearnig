package commonpackage;

public class Main {

    public static void main(String[] args) {

        int A = 0b111101;

        System.out.println(Integer.toBinaryString(A << 1));
        System.out.println(Integer.toBinaryString(A << 2));
        System.out.println(Integer.toBinaryString(A << 3));
        System.out.println(Integer.toBinaryString(A << 4));
        System.out.println(Integer.toBinaryString(A << 5));

        System.out.println(Integer.toBinaryString(A >> 1));
        System.out.println(Integer.toBinaryString(A >> 2));
        System.out.println(Integer.toBinaryString(A >> 3));
        System.out.println(Integer.toBinaryString(A >> 4));
        System.out.println(Integer.toBinaryString(A >> 5));
        System.out.println(Integer.toBinaryString(A >> 6));

        System.out.println(Integer.toBinaryString(A >>> 1));
        System.out.println(Integer.toBinaryString(A >>> 2));
        System.out.println(Integer.toBinaryString(A >>> 3));
        System.out.println(Integer.toBinaryString(A >>> 4));
        System.out.println(Integer.toBinaryString(A >>> 5));
        System.out.println(Integer.toBinaryString(A >>> 6));
    }


}


