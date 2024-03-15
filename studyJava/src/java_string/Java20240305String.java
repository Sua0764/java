package java_string;

public class Java20240305String {
    public static void main(String[] args) {


        //String 객체변수는 값이 수정되지 않고 항상 새로운 값을 만든다
        String str1 = new String("Start");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "end";
        System.out.println(str1);
        System.out.println(str2);

        //리터럴로 입력되는 값은 런타임 이전에 이미 메모리에 만들어짐
        String str5 = new String ("Start");
        String str3 = "Start";
        String str4 = "Start";
        System.out.println(str3 == str4);
        System.out.println(str4 == str5);


        //문자열의 '+' 연산
        String a1 = "Hello";
        String a2 = "world";
        System.out.println(a1 + " " + a2);

        //문자열과 숫자의 + 연산
        System.out.println(1 + "Hi");
        System.out.println(1 + 2 + "Hi");
        System.out.println("Hi" + 1 + 2);


    }
}
