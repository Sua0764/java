package java_array;

import java.util.Arrays;

public class Java20240305 {
    public static void main(String[] args) {

        //배열 객체를 생성하고 값 대입하기

        int[] array1 = new int[3];
        int[] array2;
        array2 = new int[3];

        int array3[] = new int[3];
        int array4[];
        array4 = new int[3];

        array1[0] = 2;
        array1[1] = 4;
        array1[2] = 6;
        System.out.println(array1[0] + array1[1]);

        //배열 객체 생성과 함께 값 대입하기
        int[] array5 = {3,6,9};
        System.out.println(array5[0]);

        int[] array6;
        array6 = new int[]{1,2,3};

        double[] a = {1.2, 3.4, 5.6};
        double[] b = a;
        b[0] = 7.8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
