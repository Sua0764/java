package HW02;

import Java0326.A;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {

        for (int i=0; i<str.length(); i++ ) {
            String letter = String.valueOf(str.charAt(i));
            if (str.charAt(i) > 64 || str.charAt(i) < 91) {
                letter.toLowerCase();
            } else if (str.charAt(i) > 96 || str.charAt(i) < 123) {
                letter.toUpperCase();
            } else { }
            char letter2 = letter.charAt(0);
        }
        return "";

    }
}
