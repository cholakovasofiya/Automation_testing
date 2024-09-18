package com.udemy;

import static java.util.Collections.swap;

public class CodingExerciseCommonDigit {

    public static int gcdEuclidSubtraction(int A, int B) {

      //  return B == 0 ? A : gcdEuclidRemainder(B, A % B);
        while (A != B) {
            if (A < B) {
               // swap(A, B);
                A = A + B;
                B = A - B;
                A = A - B;
            }
            A -= B;
        }

//        while (B != 0) {
//            A %= B;
//            swap(A, B);
//        }
        return A;
    }



    public static void main(String[] args) {
        System.out.println(gcdEuclidSubtraction(12,9));

    }
}
