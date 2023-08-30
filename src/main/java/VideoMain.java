public class VideoMain {
    public static void main(String[] args) throws Exception {
        Video video = new Video("C:\\Users\\li-guohao\\Videos\\dev-tmp\\demo", "demo.mkv");
        if (video.isVideo()) {
            String convert2Mp4 = video.convert2Mp4();
            System.out.println(convert2Mp4);
        }
    }
}
