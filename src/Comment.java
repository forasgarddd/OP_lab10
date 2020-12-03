import java.util.ArrayList;

public class Comment {

    private String commentText;
    private int commentLikes;
    private int commentDislikes;
    private static ArrayList<Comment> commentList = new ArrayList<>();

    public Comment(String commentText, int commentLikes, int commentDislikes) {
        this.commentText = commentText;
        this.commentLikes = commentLikes;
        this.commentDislikes = commentDislikes;
        commentList.add(this);
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(int commentLikes) {
        this.commentLikes = commentLikes;
    }

    public int getCommentDislikes() {
        return commentDislikes;
    }

    public void setCommentDislikes(int commentDislikes) {
        this.commentDislikes = commentDislikes;
    }

    public static ArrayList<Comment> getCommentList() {
        return commentList;
    }

    public static void setCommentList(ArrayList<Comment> commentArrayList) {
        Comment.commentList = commentArrayList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");
        result.append("Comment: " + commentText + " Liked by: " + commentLikes + " Disliked by: " + commentDislikes + NL);
        return result.toString();
    }


}
