package Java0920Thread;

class MyDataSync {
    int data = 3;
    public synchronized void plusData() {
        int myData = data;
        try{Thread.sleep(2000);} catch (InterruptedException e) {}
        data = myData + 1;
    }
}

class PlusThreadSync implements Runnable {
    MyDataSync myDataSync;

    public PlusThreadSync(MyDataSync myDataSync) {
        this.myDataSync = myDataSync;
    }

    @Override
    public void run() {
        myDataSync.plusData();
        System.out.println("실행 결과 : " + myDataSync.data);
    }
}

public class ThreadWithSync {
    public static void main(String[] args) {
        MyDataSync myDataSync = new MyDataSync();
        Runnable plusThread1 = new PlusThreadSync(myDataSync);
        Thread thread1 = new Thread(plusThread1);
        thread1.start();

        try{Thread.sleep(1000);} catch (InterruptedException e) {}

        Runnable plusThread2 = new PlusThreadSync(myDataSync);
        Thread thread2 = new Thread(plusThread2);
        thread2.start();
    }
}
