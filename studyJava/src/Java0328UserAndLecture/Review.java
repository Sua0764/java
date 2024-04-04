package Java0328UserAndLecture;

import java.util.ArrayList;

public class Review {
    int reviewId;
    int rating;
    String reviewText;
    String loginID;
    int lectureID;

    public Review() {
    }


    public Review(int reviewId, int rating, String reviewText, String loginID, int lectureID) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.reviewText = reviewText;
        this.loginID = loginID;
        this.lectureID = lectureID;
    }



    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String toString() {
        return "(" + reviewId + ": " + rating + ": " + reviewText
                + ": " + loginID + ": " + lectureID + ")";
    }
}



