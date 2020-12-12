import java.util.ArrayList;
import java.util.Iterator;

public class Videoblog {

    private String name;
    private String answer;
    private int allViewCount;
    private ArrayList<Video> allVideos = new ArrayList<>();
    private ArrayList<Comment> allComments = new ArrayList<>();
    private ArrayList<String> popularComments = new ArrayList<>();
    private ArrayList<Video> mostDislikedVideos = new ArrayList<>();

    public Videoblog(String name) {
        this.name = name;
    }

    public void addVideo(Video video) {
        allVideos.add(video);
    }

    public void addComment(Comment comment) {
        allComments.add(comment);
    }

    public ArrayList<Comment> getComments() {
        return allComments;
    }

    public ArrayList<Video> getVideos() {
        return allVideos;
    }

    public String getName() {
        return name;
    }

    public int countOverallView() {
        for (Iterator<Video> it = getVideos().iterator(); it.hasNext(); ) {
            Video video = it.next();
            allViewCount += video.getViewCount();
        }
        return allViewCount;
    }

    public ArrayList<String> findPopularComment() {
        for (Video video : getVideos()) {
            for (Comment comment : video.getComments()) {
                if (comment.getLikes() > video.getLikes()) {
                    answer = comment + " has more likes than video \"" + video.getName() + "\"" + "\n";
                    popularComments.add(answer);
                }
            }
        }
        if (popularComments.isEmpty()) {
            answer = "There is no comment with more likes than it's video";
            popularComments.add(answer);
        }
        return popularComments;
    }

    public ArrayList<Video> findMostDislikedVideo() {
        Video max = getVideos().get(0);
        Iterator it = getVideos().iterator();
        while (it.hasNext()) {
            Video video = (Video) it.next();
            if (video.getDislikes() > max.getDislikes()) {
                mostDislikedVideos.clear();
                max = video;
                mostDislikedVideos.add(max);
            } else if (video.getDislikes() == max.getDislikes()) {
                max = video;
                mostDislikedVideos.add(max);
            }
        }
        return mostDislikedVideos;
    }
}
