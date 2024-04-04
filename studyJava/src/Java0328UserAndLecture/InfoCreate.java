package Java0328UserAndLecture;

import Java0329.Difficulty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        Main.reviews = new ArrayList<>();
        Main.reviews.add(new Review(1, 10,"유익한 강의 감사합니다","sua0764",10));

        Main.teachers = new ArrayList<>();
        Main.teachers.add(new Teacher("박기복","qkrrlqhs99","qkrrlqhr99@naver.com"));
        Main.teachers.add(new Teacher("이명희","lmh_97","myungheeilee1004@gmail.com"));
        Main.teachers.add(new Teacher("김선호","sun_rises","sunhoK0909@gmiail.com"));

        Main.lectureTeachers = new ArrayList<>();
        Main.lectureTeachers.add(new LectureTeacher("qkrrlqhs99",1));
        Main.lectureTeachers.add(new LectureTeacher("qkrrlqhs99",2));
        Main.lectureTeachers.add(new LectureTeacher("lmh_97",3));
        Main.lectureTeachers.add(new LectureTeacher("sun_rises",4));
        Main.lectureTeachers.add(new LectureTeacher("sun_rises",5));

        Main.freeBoards = new ArrayList<>();
        Main.freeBoards.add(new FreeBoard(1, "이 문제 정답 아시는 분", "수학 2번 문제 : ","sua0764", new ArrayList<>()));


        //FreeBoard.replies.add(new Reply(1, "저요","badookking",));
    }
}
