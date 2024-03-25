package java_practice;

import java.util.Arrays;

public class Java20240312 {

    public static void main(String[] args) {
        //아래 배열의 모든 값들을 다른 배열에 복사하기
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2;
        intArray2 = new int[5];

        for (int i = 0; i < intArray1.length; i++) {
            intArray2[i] = intArray1[i];
            System.out.println(Arrays.toString(intArray2));
        }


    }

    public static void array() {
    }
}
