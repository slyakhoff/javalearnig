package commonpackage;
import java.lang.Math;
import java.util.Arrays;
import java.text.NumberFormat;

public class MultiplicationMatrix {
    public static void main(String[] args) {
        int N = 10;
        double[][] A = new double[N][N];
        initMatrix(A,N);
        printMatrix(A,N);
    }

    public static double[][] mlt2on2(double[][] A, double[][] B, int Rank){
        double C[][] = new double[Rank][Rank];
        for (int i = 0; i < Rank; i++) {
            for (int j = 0; j < Rank; j++) {
                for (int k = 0; k < Rank; k++) {
                   C[i][j] += A[i][k]+B[k][j];
                }
            }
        }
        return C;
    }

    public static void printMatrix(double[][] A, int Rank){
        for (int i = 0; i < Rank; i++) {
            for (int j = 0; j < Rank; j++) {
                System.out.printf("%2.2f", A[i][j]);
                System.out.printf(" ");
            }
            System.out.println();
        }
    }

    public static void initMatrix(double[][] A, int Rank) {
        for (int i = 0; i < Rank; i++) {
            for (int j = 0; j < Rank; j++) {
                A[i][j] = Math.random()*10;
            }
        }
    }
}

