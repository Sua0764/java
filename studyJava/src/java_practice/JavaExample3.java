package java_practice;

import java.util.Scanner;

public class JavaExample3 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};

        Scanner scan = new Scanner(System.in);
        System.out.println("1부터 5까지 정수를 입력해주세요");
        int n = scan.nextInt();


        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, first;

            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
