package Java0328UserAndLecture;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;
    static ArrayList<Review> reviews;
    static ArrayList<Teacher> teachers;
    static ArrayList<LectureTeacher> lectureTeachers;
    static ArrayList<FreeBoard> freeBoards;
    static ArrayList<Reply> replies;

    public static void main(String[] args) {
        // 정보 초기화
        InfoCreate.createInfos();

        // 강의 ID로 수강하는 학생의 loginId 찾기
        getLoginIdByLectureID(1);
        // 유저의 loginId로 강의명 찾기
        getTitleByLoginId("sua0764");
        // 강의명으로 수강생들의 이메일 찾기
        getEmailByLectureTitle("Drum");

        boolean canAddReview = false;
        canAddReview = createReview("sua0764", 1, 10, "유익한 강의 감사합니다");
        // void가 아닌 리턴형이 있는 메소드는 활용범위가 넓음. 예를 들어,
        // canAddReview의 true/false 여부에 따라 유저에게 상태 알림을 보낼 수 있음
        canAddReview = createReview("sua0764", 2, 10, "아주 좋았어요2");
        canAddReview = createReview("sky_kim", 3, 6, "보통이에요");

        getTeacherByLectureID(1);

        getLectureTitleListByTeacherID("sun_rises");

    }

    public static void getLectureTitleListByTeacherID(String teacherID) {
        for (int i=0; i<lectureTeachers.size(); i++) {
            if (Objects.equals(lectureTeachers.get(i).getTeacherID(), teacherID)) {
                int lectureID = lectureTeachers.get(i).getLectureID();
                for (int j=0; j<lectures.size(); j++) {

                }
            }

        }
    }

    public static void getTeacherByLectureID(int lectureId) {
        for(int i=0; i<lectureTeachers.size(); i++) {
            if (lectureTeachers.get(i).getLectureID() == lectureId) {
                String teacherID = lectureTeachers.get(i).getTeacherID();
                for (int j=0; j<teachers.size();j++) {
                    if (teachers.get(j).getTeacherID() == teacherID) {
                        String teacherName = teachers.get(j).getName();
                        System.out.println("8. 교사 성함 : " + teacherName);
                    }
                }
            }
        }
    }

    // 수강등록클래스에서 lectureId로 수강생의 loginId 찾기
    // 두개의 정보가 모두 수강등록 클래스안에 있으므로 반복문을 1회만 사용해도 됨
    public static void getLoginIdByLectureID(int lectureId) {
        for(int i=0; i<lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureID() == lectureId) {
                System.out.println("1. 로그인ID : "
                        + lectureRegistrations.get(i).getLoginID());
            }
        }
    }

    // 수강생의 loginId로 수강중인 과목명 찾기
    // 과목명은 수강등록 클래스안에 없기 때문에 수강등록 클래스에서 lectureId를 먼저 찾고
    // lectureId로 과목클래스에서 과목명을 찾아야 함. (반복문 2회 필요)
    public static void getTitleByLoginId(String loginId) {
        for (int i=0; i<lectureRegistrations.size(); i++) {
            if(lectureRegistrations.get(i).getLoginID().equals(loginId)) {
                int lectureId = lectureRegistrations.get(i).lectureID;
                for (int j=0; j<lectures.size(); j++) {
                    if (lectures.get(j).getLectureID() == lectureId) {
                        String title = lectures.get(j).getTitle();
                        System.out.println("2. 수강과목명 : " + title);
                    }
                }
            }
        }
    }

    // 과목명으로 수강중인 학생들의 이메일 찾기
    // 수강등록 클래스에서 관계정보를 얻으려면 해당 과목명의 lectureId를 먼저 얻어야 함(반복문1회)
    // lectureId로 수강등록 클래스에서 수강생의 loginId를 얻고 (반목문1회)
    // loginId로 유저 클래스에서 해당 유저의 이메일을 얻음(반복문1회)
    public static void getEmailByLectureTitle(String title) {
        int lectureId = -1;
        for (int i=0; i<lectures.size(); i++) {
            if (lectures.get(i).getTitle().equals(title)) {
                lectureId = lectures.get(i).getLectureID();
                break;
            }
        }
        if (lectureId < 0) {
            return; // lectureId가 -1이라면 해당 과목명의 과목이 없다는 뜻
        }
        for (int i=0; i<lectureRegistrations.size(); i++) {
            if(lectureRegistrations.get(i).getLectureID() == lectureId) {
                String loginId = lectureRegistrations.get(i).getLoginID();
                for (int j=0; j<users.size(); j++) {
                    if (users.get(j).getLoginID().equals(loginId)) {
                        String email = users.get(j).getEmail();
                        System.out.println("3. 이메일 : " + email);
                    }
                }
            }
        }
    }

    public static boolean createReview(String loginId, int lectureId
            , int rating, String text) {
        // 점수체크
        if (rating < 1 || rating > 10) {
            System.out.println("평가점수는 1~10점 사이입니다.");
            return false;
        }
        // 기존 리뷰 확인
        if (!reviews.isEmpty()) {
            for(Review review : reviews) {
                if (review.getLoginID().equals(loginId)
                        && review.getLectureID() == lectureId) {
                    System.out.println("이미 작성한 리뷰가 있습니다.");
                    return false;
                }
            }
        }
        // 수강여부 확인
        boolean canReview = false;
        for(LectureRegistration registration : lectureRegistrations) {
            if (registration.getLoginID().equals(loginId)
                    && registration.getLectureID() == lectureId) {
                canReview = true;
                break;
            }
        }
        if (!canReview) {
            System.out.println("리뷰 작성 권한이 없습니다.");
            return false;
        }
        reviews.add(new Review(reviews.size()+1, rating, text, loginId, lectureId));
        System.out.println(reviews.toString());
        return true;
    }

}