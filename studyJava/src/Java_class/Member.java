package Java_class;

public class Member {
    static int name;
    int age;

    static {
        name = 10000;
    }
    public Member() {
    }

    public Member(int age) {
        this.age = age;
    }
    //static 요소는 초기화 불가능

}
