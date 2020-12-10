import java.util.ArrayList;

public class Video {

    private String name;
    private String URL;
    private int viewCount;
    private int likes;
    private int dislikes;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Video(String name, String URL, int viewCount, int likes, int dislikes) {
        this.name = name;
        this.URL = URL;
        this.viewCount = viewCount;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public ArrayList<Comment> getComments() {
        return this.comments;
    }

    public String getName() {
        return this.name;
    }

    public int getViewCount() {
        return viewCount;
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

        result.append(this.getClass().getName() + " {" + NL);
        result.append(" Name: " + name + NL);
        result.append(" URl: " + URL + NL);
        result.append(" Views: " + viewCount + NL);
        result.append(" Likes: " + likes + NL);
        result.append(" Dislikes: " + dislikes + NL);
        result.append("}" + NL);

        return result.toString();
    }
}
