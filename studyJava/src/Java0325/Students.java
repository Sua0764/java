package Java0325;

public class Students {

    String name;
    String[] department;
    int[] studentId;



    public Students() {
        this.name = name;
        this.department = department;
        this.studentId = studentId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = new String[]{department};
    }

    public int[] getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = new int[]{studentId};
    }

    public String toString() {
        return String.format(name + " " +  department + " " + studentId);
    }
}
