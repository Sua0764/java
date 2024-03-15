package java0315;

public class Count {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence"; // 모음 10개 자음 17개

        int[] count = new int[] {'a','e','i','o','u'};
        int vowel = 0;
        int consonant = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j< count.length; j++){
                if (str.charAt(i) == count[j]) {
                    vowel++;
                } else if (str.charAt(i) != ' '){
                    consonant++;
                }
            }
        }


        System.out.println("모음의 수 : " + vowel);
        System.out.println("자음의 수 : " + consonant);
    }
}
