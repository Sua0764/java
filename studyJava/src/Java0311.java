public class Java0311 {

    //클래스에 포함된 변수 : 필드
    static int m = 3;
    int n = 4;

    public static void main(String[] args) {
        //메서드에 포함된 변수 : 지역변수
        int k = 5;

    }

    void work1() {
        int k = 5;
        System.out.println(k);
        work2(3);
    }
    void work2(int i) {
        int j = 4;
        System.out.println(i + j);

        Java0311 a = new Java0311();
        System.out.println(Java0311.m);
    }


}
