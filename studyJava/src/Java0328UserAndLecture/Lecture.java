package Java0328UserAndLecture;


public class Lecture{

    int lectureID;
    String title;
    int duration;
    String category;
    String difficulty;

    public Lecture() {
    }

    public Lecture(int lectureID, String title, int duration, String category, String difficulty) {
        this.lectureID = lectureID;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.difficulty = difficulty;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String toString() {
        return lectureID + " / " + title +  " / " + category + " / " + difficulty + " / " + duration + "분";
    }
}
