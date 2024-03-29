package Java0328UserAndLecture;


import Java0329.Difficulty;

public class Lecture{

    int lectureID;
    String title;
    int duration;

    Category category;
    Difficulty difficulty;

    public Lecture() {
    }

    public Lecture(int lectureID, String title, int duration, Category category, Difficulty difficulty) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String toString() {
        return lectureID + " / " + title +  " / " + category + " / " + difficulty + " / " + duration + "분";
    }
}
