package Java0326Example2;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        //char[] arrNum = str.toCharArray();

        for (int i = 0 ; i < str.length() ; i++) {
        //    int j = Integer.parseInt(String.valueOf(arrNum[i]));
            int j = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum = sum + j;
            System.out.println(sum);
        }

        System.out.println("합계는 " + sum); // 15
    }
}