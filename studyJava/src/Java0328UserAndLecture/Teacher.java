package Java0328UserAndLecture;

public class Teacher {

    String name;
    String teacherID;
    String teacherEmail;

    public Teacher() {
    }

    public Teacher(String name, String teacherID, String teacherEmail) {
        this.name = name;
        this.teacherID = teacherID;
        this.teacherEmail = teacherEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String toString() {return String.format("이름 : " + name + "ID : "+ teacherID + "Email : " + teacherEmail);}
}
