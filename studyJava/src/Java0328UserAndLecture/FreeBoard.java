package Java0328UserAndLecture;

import java.util.List;

public class FreeBoard {
    int FreeBoardID;
    String title;
    String content;
    String loginID;

    static List<Reply> replies;

    public static void main(String[] args) {
        InfoCreate.createInfos();
    }

    public FreeBoard() {
    }

    public FreeBoard(int freeBoardID, String title, String content, String loginID, List<Reply> replies) {
        FreeBoardID = freeBoardID;
        this.title = title;
        this.content = content;
        this.loginID = loginID;
        this.replies = replies;
    }

    public int getFreeBoardID() {
        return FreeBoardID;
    }

    public void setFreeBoardID(int freeBoardID) {
        FreeBoardID = freeBoardID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        FreeBoard.replies = replies;
    }
}