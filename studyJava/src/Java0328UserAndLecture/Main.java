package Java0328UserAndLecture;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("조수아","sua0764","imdnaseucho@gmail.com", LocalDate.of(2007,6,4));
        User user2 = new User("김철수","chul0721","chulsoooo@gmail.com", LocalDate.of(2002,7,21));
        User user3 = new User("김하늘","sky_kim","sky050412@gmail.com", LocalDate.of(2005,4,12));
        User user4 = new User("박민주","qkrdlswn2","minnmingzoo@gmail.com", LocalDate.of(2001,2,13));
        User user5 = new User("이세돌","badookking","thekingsedol@gmail.com", LocalDate.of(1997,5,9));


        Lecture lecture1 = new Lecture(1,"Drum",80,"instroment","beginner");
        Lecture lecture2 = new Lecture(2,"Drum",120,"instroment","intermediate");
        Lecture lecture3 = new Lecture(3,"Guitar",100,"instroment","beginner");
        Lecture lecture4 = new Lecture(4,"Guitar",130,"instroment","intermediate");

        ArrayList<LectureRegistration> lectureRegistration = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("sua0764",1);
        lectureRegistration.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("chul0721",2);
        lectureRegistration.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("sky_kim",3);
        lectureRegistration.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("qkralswn2",4);
        lectureRegistration.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("badookking",3);
        lectureRegistration.add(lectureRegistration5);

        for (int i = 0; i < lectureRegistration.size(); i++) {
            if (lectureRegistration.get(i).getLectureID() == 1 ) {
                System.out.println(lectureRegistration.get(i).getUserID());
            }
        }


        for (int i = 0; i < lectureRegistration.size(); i++) {
            if (lectureRegistration.get(i).getUserID() == user1.loginID) {
                int lecN = lectureRegistration.get(i).getLectureID();
                for (int j = 0; j < lectureRegistration.size(); j++) {
                    if ( )
                }
            }
        }


    }
}
