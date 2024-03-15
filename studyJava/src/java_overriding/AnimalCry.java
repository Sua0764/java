package java_overriding;

import pack1.A;

class Animal {
    void cry() {

    }
}

class bird extends Animal {
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

class dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}


public class AnimalCry {
    public static void main(String[] args) {

        Animal aa = new Animal();
        Animal bb = new dog();
        Animal cc = new cat();
        Animal dd = new bird();

        aa.cry();
        bb.cry();
        cc.cry();
        dd.cry();

    }
}











