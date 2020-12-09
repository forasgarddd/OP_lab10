import java.util.ArrayList;
import java.util.Iterator;

public class VideoBLog {

    private String blogName;
    private String answer;
    private int overallView;
    private ArrayList<Comment> commentListVideo0 = new ArrayList<>();
    private ArrayList<Comment> commentListVideo1 = new ArrayList<>();
    private ArrayList<Comment> commentListVideo2 = new ArrayList<>();
    private ArrayList<Comment> commentListVideo3 = new ArrayList<>();
    private ArrayList<Comment> mostLikedCommentsList = new ArrayList<>();
    private ArrayList<Video> mostDislikedVideosList = new ArrayList<>();

    public VideoBLog(String blogName) {
        this.blogName = blogName;
    }

    Video video0 = new Video("Rickrolling", "www.youtube.com/watch?v=dQw4w9WgXcQ", 100000, 10000, 420);
    Video video1 = new Video("Песня про ЗОЖ", "www.youtube.com/watch?v=LsNrJg-8_2I", 22000, 1000, 100);
    Video video2 = new Video("Последнее видео на ФП(", "www.youtube.com/watch?v=jhzzQd5hdCM", 200, 69, 2);
    Video video3 = new Video("10 часов пишу конспект по физике", "www.youtube.com/watch?v=u_pnia4Xhlw", 9000, 666, 420);

    public String getCommentListVideo(Video video) {
        Comment comment0_1 = new Comment("Rickrolled", 100, 2);
        Comment comment0_2 = new Comment("LUL!", 600, 4);
        answer = "Comments for video: \"" + video.getVideoName() + "\"\n";
        if (video == video0) {
            commentListVideo0.add(comment0_1);
            commentListVideo0.add(comment0_2);
            answer += commentListVideo0;
        }

        Comment comment1_1 = new Comment("На турничок!", 15, 0);
        Comment comment1_2 = new Comment("давай подход браток", 404, 4);
        if (video == video1) {
            commentListVideo1.add(comment1_1);
            commentListVideo1.add(comment1_2);
            answer += commentListVideo1;
        }

        Comment comment2_1 = new Comment("Ви молодець!", 10, 3);
        Comment comment2_2 = new Comment("Але чому ви не в кросівках?", 20, 0);
        if (video == video2) {
            commentListVideo2.add(comment2_1);
            commentListVideo2.add(comment2_2);
            answer += commentListVideo2;
        }

        Comment comment3_1 = new Comment("Налил водички", 333, 19);
        Comment comment3_2 = new Comment("Физик топ за свои деньги", 700, 1);
        if (video == video3) {
            commentListVideo3.add(comment3_1);
            commentListVideo3.add(comment3_2);
            answer += commentListVideo3;
        }
        return answer;
    }

    public ArrayList<Video> findMostDislikedVideo() {
        Video max = Video.videoList.get(0);
        Iterator iterator = Video.videoList.iterator();
        while (iterator.hasNext()) {
            Video video = (Video) iterator.next();
            if (video.getVideoDislikes() > max.getVideoDislikes()) {
                mostDislikedVideosList.clear();
                max = video;
                mostDislikedVideosList.add(max);
            } else if (video.getVideoDislikes() == max.getVideoDislikes()) {
                max = video;
                mostDislikedVideosList.add(max);
            }
        }
        return mostDislikedVideosList;
    }

    public String findMostLikedComment(Video video, ArrayList<Comment> commentArrayList) {
        for (Comment comment : commentArrayList) {
            if (comment.getCommentLikes() > video.getVideoLikes()) {
                mostLikedCommentsList.add(comment);
                answer = "Comment " + mostLikedCommentsList + " has more likes than video \"" + video.getVideoName() + "\"";
            } else if (mostLikedCommentsList.size() == 0) {
                answer = "There is no comment which has more likes than video \"" + video.getVideoName() + "\"";
            }
        }
        return answer;
    }

    public int countOverallView() {
        for (Iterator<Video> iterator = Video.videoList.iterator(); iterator.hasNext(); ) {
            Video video = iterator.next();
            overallView = overallView + video.getViewCount();
        }
        return overallView;
    }

    public String getBlogName() {
        return blogName;
    }

    public ArrayList<Comment> getCommentListVideo0() {
        return commentListVideo0;
    }

    public void setCommentListVideo0(ArrayList<Comment> commentListVideo0) {
        this.commentListVideo0 = commentListVideo0;
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

    public ArrayList<Comment> getCommentListVideo3() {
        return commentListVideo3;
    }

    public void setCommentListVideo3(ArrayList<Comment> commentListVideo3) {
        this.commentListVideo3 = commentListVideo3;
    }

}



