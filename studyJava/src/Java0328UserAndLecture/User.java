package Java0328UserAndLecture;

import java.net.IDN;
import java.time.LocalDate;

public class User extends Lecture{

    String name;
    String loginID;
    String email;
    LocalDate birthDate;

    private String password;

    public User() {
    }


    public User(String name, String loginID, String email,LocalDate birthDate) {
        this.name = name;
        this.loginID = loginID;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return String.format("이름 : " + name + " ID : " + loginID);
    }

}



