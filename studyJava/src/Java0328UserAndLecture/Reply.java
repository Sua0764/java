package Java0328UserAndLecture;

public class Reply {

    int replyID;
    String content;
    String loginID;
    FreeBoard freeBoardID;

    public Reply() {
    }

    public Reply(int replyID, String content, String loginID, FreeBoard freeBoardID) {
        this.replyID = replyID;
        this.content = content;
        this.loginID = loginID;
        this.freeBoardID = freeBoardID;
    }

    public int getReplyID() {
        return replyID;
    }

    public void setReplyID(int replyID) {
        this.replyID = replyID;
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

    public FreeBoard getFreeBoardID() {
        return freeBoardID;
    }

    public void setFreeBoardID(FreeBoard freeBoardID) {
        this.freeBoardID = freeBoardID;
    }
}