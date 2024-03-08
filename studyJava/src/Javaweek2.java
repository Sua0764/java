import java.util.Scanner;

public class Javaweek2 {
    public static void main(String[] args) {
        // 4장 제어문과 제어 키워드

        //---if선택 제어문---
        //유형 1 / if 단일 구문 : 조건식이 참이면 실행

        if (5 > 3) {
            System.out.println("if 단일구문");
        }

        int a = 3;
        if (a == 3) {
            System.out.println("if 단일구문 2");
        }

        //유형 2 / if else 구문
        int b = 5;

        if (b < 3) {
            System.out.println("이건 false");
        } else {
            System.out.println("이게 true");
        }

        //유형 3/ if-else if-else 구문

        if (a == b) {
            System.out.println("이건 가짜");
        } else if (a > b) {
            System.out.println("이것도 가짜");
        } else {
            System.out.println("이건 진짜");
        }


        //---Switch 선택 제어문---
        int c = 4;

        switch (c) {
            case 2:
                System.out.println("나누기 3");
                break; // 구문 실헬 후 탈출

            case 4:
                System.out.println("나머지 2");
                break;

            case 6:
                System.out.println("곱하기 1");
                break;

            default: //일치하는 위치가 없을 때 점프
                System.out.println("0");
        }

        /*---for 반복 제어문---

        int i;
        for (i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }

         */
        // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 츨력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        System.out.println("0~6까지 숫자를 입력해주세요");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();








        for (int i = 0; i < 5; i++) {
            for(int j =0; j < 3; j++) {
                if(i == 2) {
                    continue;
                }
                if(j == 1) {
                    break;
                }
                System.out.println("A");

            }
        }
    }
}
