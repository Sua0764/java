package Java0328UserAndLecture;

public class LectureRegistration {
    String loginID;
    int lectureID;


    public LectureRegistration() {
    }

    public LectureRegistration(String userID, int lectureID) {
        this.loginID = userID;
        this.lectureID = lectureID;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String userID) {
        this.loginID = userID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }
}

