package Java0328UserAndLecture;

public class LectureTeacher {

    private String teacherID;
    private int lectureID;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherID, int lectureID) {
        this.teacherID = teacherID;
        this.lectureID = lectureID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }
}


