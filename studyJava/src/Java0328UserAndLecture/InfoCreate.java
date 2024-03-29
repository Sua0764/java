package Java0328UserAndLecture;

import Java0329.Difficulty;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfos() {

        Main.users = new ArrayList<>();
        Main.users.add(new User("조수아","sua0764","imdnaseucho@gmail.com", LocalDate.of(2007,6,4)));
        Main.users.add(new User("김철수","chul0721","chulsoooo@gmail.com", LocalDate.of(2002,7,21)));
        Main.users.add(new User("김하늘","sky_kim","sky050412@gmail.com", LocalDate.of(2005,4,12)));
        Main.users.add(new User("박민주","qkrdlswn2","minnmingzoo@gmail.com", LocalDate.of(2001,2,13)));
        Main.users.add(new User("이세돌","badookking","thekingsedol@gmail.com", LocalDate.of(1997,5,9)));

        Main.lectures = new ArrayList<>();
        Main.lectures.add(new Lecture(1,"Drum",80,Category.INSTRUMENT, Difficulty.BEGINNER));
        Main.lectures.add(new Lecture(2,"Drum",120,Category.INSTRUMENT,Difficulty.INTERMEDIATE));
        Main.lectures.add(new Lecture(3,"Guitar",100,Category.INSTRUMENT,Difficulty.BEGINNER));
        Main.lectures.add(new Lecture(4,"Guitar",130,Category.INSTRUMENT,Difficulty.INTERMEDIATE));
        Main.lectures.add(new Lecture(5,"Guitar",130,Category.INSTRUMENT,Difficulty.ADVANCED));

        Main.lectureRegistrations = new ArrayList<>();
        Main.lectureRegistrations.add(new LectureRegistration("sua0764",1));
        Main.lectureRegistrations.add(new LectureRegistration("sua0764",3));
        Main.lectureRegistrations.add(new LectureRegistration("chul0721",2));
        Main.lectureRegistrations.add(new LectureRegistration("sky_kim",3));
        Main.lectureRegistrations.add(new LectureRegistration("qkrdlswn2",4));
        Main.lectureRegistrations.add(new LectureRegistration("badookking",5));
    }
}
