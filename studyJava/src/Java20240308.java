import java.util.Scanner;

public class Java20240308 {
    public static void main(String[] args) {

        // 1.양의 정수 10개를 입력받기
        // 2.배열에 담기
        // 3.3의 배수만 출력

    /*    Scanner scan = new Scanner(System.in);
        System.out.println("정수 10개를 입력해주세요");
        int num = scan.nextInt();

        for (int i=0 ; i < num ; i++) {
            if (num[i] % 3 == 0) {
                System.out.println(scan.nextInt(i));
            } else {
                break;
            }
        }

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int[] intList = new int[10];

        for (int i=0 ; i < intList.length ; i++) {
            intList[i] = scan.nextInt();
        }
        for (int i=0; i<intList.length; i++) {
            if (intList[i] % 3 == 0) {
                System.out.print(intList[i] + " ");
            }
        }




    }
}
