import java.util.ArrayList;

public class Video {

    public String videoName;
    private String URL;
    private int viewCount;
    private int videoLikeCount;
    private int videoDislikeCount;
    protected static ArrayList<Video> videoList = new ArrayList<>();

    public Video(String videoName, String URL, int viewCount, int videoLikeCount, int videoDislikeCount) {
        this.videoName = videoName;
        this.URL = URL;
        this.viewCount = viewCount;
        this.videoLikeCount = videoLikeCount;
        this.videoDislikeCount = videoDislikeCount;
        videoList.add(this);
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String name) {
        this.videoName = videoName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getVideoLikeCount() {
        return videoLikeCount;
    }

    public void setVideoLikeCount(int videoLikeCount) {
        this.videoLikeCount = videoLikeCount;
    }

    public int getVideoDislikeCount() {
        return videoDislikeCount;
    }

    public void setVideoDislikeCount(int videoDislikeCount) {
        this.videoDislikeCount = videoDislikeCount;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " {" + NL);
        result.append(" Name: " + videoName + NL);
        result.append(" URl: " + URL + NL);
        result.append(" Views: " + viewCount + NL);
        result.append(" Likes: " + videoLikeCount + NL);
        result.append(" Dislikes: " + videoDislikeCount + NL);
        result.append("}" + NL);

        return result.toString();
    }

}

