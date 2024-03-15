package java_string;

import java.util.Arrays;

public class Java0306String2 {
    public static void main(String[] args) {

        //toLowercase(), toUppercase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //@replace()
        //Study<- 단어를 찾지 못하면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("Study" , "공부"));

        //@substring()

        //두번째 파라미터로 사용된 인덱스는 포함 X
        System.out.println(str1.substring(0,5));

        //@split()
        // split 메소드의 리턴형은 String[] 문자열의 배열이다!!!
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        //@trim
        // "앞뒤" 공백 지우기 (가운데 공백은 그대로 있다)
        System.out.println("    abc     ".trim());



        // 모든 공백 지우기
        System.out.println(str1.replaceAll(" ",""));

        System.out.println();

        //문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        //@stack 메모리 비교(==) : 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        //@equals(), equalsIgnorecase() : 내용비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

    }
}
