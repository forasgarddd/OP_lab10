import java.util.ArrayList;

public class Comment {

    private String text;
    private int likes;
    private int dislikes;

    public Comment(String text, int likes, int dislikes) {
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getText() {
        return this.text;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");
        result.append("Comment: " + text + " Liked by: " + likes + " Disliked by: " + dislikes + NL);
        return result.toString();
    }
}
