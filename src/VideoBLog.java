import java.util.ArrayList;
import java.util.Iterator;

public class VideoBLog {

    private String blogName;
    private String answer;
    private int overallView;
    private ArrayList<Comment> commentListVideo1 = new ArrayList<>();
    private ArrayList<Comment> commentListVideo2 = new ArrayList<>();
    private ArrayList<Comment> mostLikedCommentsList = new ArrayList<>();


    public VideoBLog(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogName() {
        return blogName;
    }

    Video video0 = new Video("НЫЫЫА", "mem.com", 5000, 100, 10);
    Video video1 = new Video("ВСОЛЯНОГО!", "lol.com", 2000, 500, 20);
    Video video2 = new Video("Клокверк даун", "kek.com", 3000, 1000, 100);
    Video video3 = new Video("МЛГ!", "pup.com", 4000, 50, 600);

    public String getCommentListVideo(Video video) {

        Comment comment1_1 = new Comment("LOL!", 100, 2);
        Comment comment1_2 = new Comment("MEM!", 600, 4);
        if(video == video1) {
            commentListVideo1.add(comment1_1);
            commentListVideo1.add(comment1_2);
            answer = "Коментарі під відео: \"" + video.getVideoName() + "\"\n" + commentListVideo1;
        }

        Comment comment2_1 = new Comment("FUCK!", 10, 3);
        Comment comment2_2 = new Comment("SHIT!", 20, 0);
        if(video == video2) {
            commentListVideo2.add(comment2_1);
            commentListVideo2.add(comment2_2);
            answer = "Коментарі під відео: \"" + video.getVideoName() + "\"\n" + commentListVideo2;
        }
        return answer;
    }

    public String findMostLikedComment(Video video, ArrayList<Comment> commentArrayList) {
            for (Comment comment : commentArrayList) {
                if (comment.getCommentLikes() > video.getVideoLikeCount()) {
                    mostLikedCommentsList.add(comment);
                    answer = "Коментар " + mostLikedCommentsList + " має більше лайків ніж відео \"" + video.getVideoName() + "\"";
                } else if (mostLikedCommentsList.size() == 0) {
                    answer = "Коментаря, що набрав більше лайків за відео \"" + video.getVideoName() + "\" не існує";
                }
            }
        return answer;
    }

    public int countOverallView() {
        for(Iterator<Video> iterator = Video.videoList.iterator(); iterator.hasNext();){
            Video video = iterator.next();
            overallView = overallView + video.getViewCount();
        }
        return overallView;
    }

    public ArrayList<Comment> getCommentListVideo1() {
        return commentListVideo1;
    }

    public void setCommentListVideo1(ArrayList<Comment> commentListVideo1) {
        this.commentListVideo1 = commentListVideo1;
    }

    public ArrayList<Comment> getCommentListVideo2() {
        return commentListVideo2;
    }

    public void setCommentListVideo2(ArrayList<Comment> commentListVideo2) {
        this.commentListVideo2 = commentListVideo2;
    }
}



