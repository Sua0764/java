package Java0328UserAndLecture;

import java.util.ArrayList;

public class Review {
    String reviewId;
    int rating;
    String reviewText;
    String loginID;
    int lectureID;

    public Review() {
    }

    public Review(String reviewId, int rating, String reviewText, String loginID, int lectureID) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.reviewText = reviewText;
        this.loginID = loginID;
        this.lectureID = lectureID;
    }
    public Review(int rating, String reviewText, String loginID, int lectureID) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.reviewText = reviewText;
        this.loginID = loginID;
        this.lectureID = lectureID;
    }

    public static boolean createReview() {

        /*if () {
            return true;
        }*/

        Main.reviews = new ArrayList<>();
        Main.reviews.add(new Review(9,"유익한 강의 감사합니다:)","sua0764",1));



    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
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
}



