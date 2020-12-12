public class App {

    public static void main(String[] args) {
        Videoblog Arthas = new Videoblog("Arthas");

        Video video1 = new Video("Rickrolling", "www.youtube.com/watch?v=dQw4w9WgXcQ", 100000, 10000, 420);
        Video video2 = new Video("Песня про ЗОЖ", "www.youtube.com/watch?v=LsNrJg-8_2I", 22000, 1000, 100);
        Video video3 = new Video("Последнее видео на ФП(", "www.youtube.com/watch?v=jhzzQd5hdCM", 200, 69, 500);

        Comment comment1 = new Comment("Rickrolled", 100, 2);
        Comment comment2 = new Comment("На турничок!", 15, 0);
        Comment comment3 = new Comment("Ви молодець!", 1100, 3);
        Comment comment4 = new Comment("Физик топ за свои деньги", 700, 1);

        Arthas.addVideo(video1);
        Arthas.addVideo(video2);
        Arthas.addVideo(video3);

        Arthas.addComment(comment1);
        Arthas.addComment(comment2);
        Arthas.addComment(comment3);
        Arthas.addComment(comment4);

        video1.addComment(comment1);
        video1.addComment(comment2);
        video2.addComment(comment3);
        video3.addComment(comment4);

        System.out.println("Blog name: " + Arthas.getName() + "\n");
        System.out.println(Arthas.getVideos() + "\n");
        System.out.println(video1.getComments()+ "\n");
        System.out.println("Overall view count: " + Arthas.countOverallView()+ "\n");
        System.out.println(Arthas.findPopularComment()+ "\n");
        System.out.println("Videos with biggest dislikes count:\n" + Arthas.findMostDislikedVideo()+ "\n");

    }
}
