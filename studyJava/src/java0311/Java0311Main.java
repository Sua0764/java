package java0311;

public class Java0311Main {
    public static void main(String[] args) {
        //클래스의 생성자가 없는 경우 => 기본생성자가 자동으로 만들어짐
        //매개변수가 잇는 생성자만 있는 경우 => 기본생성자는 만들어지지 않는다!
        //셍성자의 오버로딩
     /*   Java_class.Students a = new Java_class.Students();
        Java_class.Students tom = new Java_class.Students("tom", 20,"Seoul","12345");
        Java_class.Students steve = new Java_class.Students("steve",25,"LA");*/
    }

    class A {
        boolean a;
        int b;
        double c;
        String d;

        void abc() {
            System.out.println(b + c);
            System.out.println(c + d);
            System.out.println(d + a);

            A a = new A();
            System.out.println(a.a);
            System.out.println(a.b);
            System.out.println(a.c);
            System.out.println(a.d);
            System.out.println();

            a.abc();
        }
    }
}