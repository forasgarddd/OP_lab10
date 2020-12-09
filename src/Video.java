import java.util.ArrayList;

public class Video {

    public String videoName;
    private String URL;
    private int viewCount;
    private int videoLikes;
    private int videoDislikes;
    protected static ArrayList<Video> videoList = new ArrayList<>();

    public Video(String videoName, String URL, int viewCount, int videoLikes, int videoDislikes) {
        this.videoName = videoName;
        this.URL = URL;
        this.viewCount = viewCount;
        this.videoLikes = videoLikes;
        this.videoDislikes = videoDislikes;
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

    public int getVideoLikes() {
        return videoLikes;
    }

    public void setVideoLikes(int videoLikes) {
        this.videoLikes = videoLikes;
    }

    public int getVideoDislikes() {
        return videoDislikes;
    }

    public void setVideoDislikes(int videoDislikes) {
        this.videoDislikes = videoDislikes;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NL = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " {" + NL);
        result.append(" Name: " + videoName + NL);
        result.append(" URl: " + URL + NL);
        result.append(" Views: " + viewCount + NL);
        result.append(" Likes: " + videoLikes + NL);
        result.append(" Dislikes: " + videoDislikes + NL);
        result.append("}" + NL);

        return result.toString();
    }

}

