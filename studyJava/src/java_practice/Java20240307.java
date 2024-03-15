package java_practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java20240307 {
    public static void main(String[] args) {

/*        Scanner scan = new Scanner(System.in);
        System.out.print("0~10까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();

        for ( int i = 0; 0 <intList1.length ; i++) {
            if (intList1[i] > num); {
                System.out.print(intList1[i] + "  ");
            }
        }



        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        for (int i = 0; i< intList1.length; i++) {
            if (intList1[i] > num) {
                intList3.add(intList1[i]);
            }
        }
        System.out.print(intList3.toString());


        //7.아래 배열의 총합과 평균을 구하시오.
        int[] numberList = {12,34,56,32,84,99,73,69};
        int sum = 0;
        for (int i = 0 ; i < numberList.length ; i++) {
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);




        // 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        //예) hello를 입력하면 olleh를 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");
        String inputStr = sc.nextLine();

        char[] inputChar = inputStr.toCharArray();
        char[] inputChar2 = new char[inputChar.length];
        int index = inputChar2.length - 1;
        for (int i = 0; i <inputChar.length; i++) {
            inputChar2[index] = inputChar[i];
            index = index - 1;
        }

        for (int i=0; i < inputChar2.length ;i++) {
            System.out.print(inputChar2[i]);

        }
        System.out.println();



        // 난수생성법, Random 숫자 만드는 법
        Random rd = new Random();
        int randNum = rd.nextInt(10); // 0부터 입력한 정수값-1 범위에서 랜덤
        System.out.println(randNum);

 */

        //9. 1~45까지의 랜덤한 정수를 길이가 6인 배열에 넣으시오
        //번호 중복 안됨 (하나의 랜덤 숫자가 나올때마다 비교)


        int[] randNum = new int[6];
        Random lottoNum = new Random();

        for (int i = 0 ; i < randNum.length ; i++) {
            int temp = lottoNum.nextInt(6)+1;
            for (int j=0; j<i; j++) {
                if(randNum[j] == temp) {
                    temp = lottoNum.nextInt(6)+1;
                    j=0;
                }
            }
            randNum[i] = temp;

            System.out.println(randNum[i]);

           // for  (int j = 0; j < i; )
        }





    }
}
