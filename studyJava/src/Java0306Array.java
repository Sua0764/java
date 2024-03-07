import java.util.Arrays;


public class Java0306Array {
    public static void main(String[] args) {

    /*    int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};

        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        array1[5] = 6;
        array1[6] = 7;
        array1[7] = 8;
        array1[8] = 9;
        array1[9] = 10;

        System.out.println(array[9]);
        System.out.println(array1[9]);

        int[] intList1 = new int[10];
        for (int i=0; i<10; i++) {
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));


        String[] fruitList = {"배","사과","바나나","딸기","사과","수박"};
        int count = 0;
        for (int i=0; i< fruitList.length; i++){
            if (fruitList[i] == "사과") {
                count = count + 1;
            }
        }
        System.out.println(count);


     */


        //자바에서 입력값을 받는 방법
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해 주세요 : ");
        int inputNumber = sc.nextInt();

        if (inputNumber >= 0 && inputNumber <=6) {
            System.out.println(inputNumber);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

      */


        //자바에서 문자열을 입력받는 방법
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요 : ");
        String inputStr = sc.nextLine();
        System.out.println(inputStr);

       */


      /*  // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 츨력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        System.out.println("0~6까지 숫자를 입력해주세요 : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=0; i< week.length; i++) {
            if (num >= 0 && num <= 6) {
                System.out.println(week[num]);
                break;
            } else {
                System.out.println("잘못 입력하셨습니다");
            }
        }

       */

        //5.사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        //"~~~님 환영합니다"를 출력하고
        //없으면 "회원가입해주세요"를 출력 (단, 대소문자 구분하지 마시오)

       /*  String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요 : ");
        String str = sc.nextLine();

        int k = 0;
        for ( ; k< members.length; k++) {
            if (members[k].equalsIgnoreCase(str.toLowerCase())) {
                System.out.println(members[k] + "님 환영합니다");
                break;
            }
        }
        if (k == members.length) {
            System.out.println("회원가입 해주세요");
        }


    /*
        boolean found = false;
        for (int i=0; i< members.length; i++) {
            if (members[i].equalsIgnoreCase(str)) {
                System.out.println(members[i] + "님 환영합니다");
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("회원가입 해주세요");

        }

     */
    }
}
