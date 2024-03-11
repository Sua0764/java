public class Students {
    String name;
    int age;
    String address;

    private String personalNum;

    public Students() { //기본생성자
    }

    public Students(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public Students(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    private String getAddress() {
        return address;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayName() { //메소드
        System.out.println(this.name);
    }

    public void  displayAge() {
        System.out.println(this.age);
    }

    public void displayAddress() {
        System.out.println(this.address);
    }

    public void displayAll() {
        System.out.println(this.name + " " + this.age + " " + this.address);
    }


}

