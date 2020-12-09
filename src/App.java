public class App {

    public static void main(String[] args) {
        VideoBLog Arthas = new VideoBLog("Arthas");
        System.out.println("Blog name: " + Arthas.getBlogName());
        System.out.println("Videos list: \n" + Video.videoList);
        System.out.println(Arthas.getCommentListVideo(Arthas.video1));
        System.out.println(Arthas.getCommentListVideo(Arthas.video3));
        System.out.println("Overall views count: " + Arthas.countOverallView());
        System.out.println(Arthas.findMostLikedComment(Arthas.video1, Arthas.getCommentListVideo1()));
        System.out.println(Arthas.findMostLikedComment(Arthas.video3, Arthas.getCommentListVideo3()));
        System.out.println("Most disliked videos list: \n" + Arthas.findMostDislikedVideo());

    }

}
