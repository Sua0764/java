package Java0328UserAndLecture;

public class LectureRegistration {
    String userID;
    int lectureID;


    public LectureRegistration() {
    }

    public LectureRegistration(String userID, int lectureID) {
        this.userID = userID;
        this.lectureID = lectureID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }
}

