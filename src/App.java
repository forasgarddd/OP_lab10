public class App {

    public static void main(String[] args) {
        VideoBLog Arthas = new VideoBLog("Arthas");
        System.out.println("Назва відеоблогу: " + Arthas.getBlogName());
        System.out.println("Список відео: \n" + Video.videoList);
        System.out.println(Arthas.getCommentListVideo(Arthas.video1));
        System.out.println("Загальна кількість переглядів: " + Arthas.countOverallView());
        System.out.println(Arthas.findMostLikedComment(Arthas.video1, Arthas.getCommentListVideo1()));


    }

}
