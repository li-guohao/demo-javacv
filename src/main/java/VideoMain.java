import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

public class VideoMain {
    private static Logger log = LoggerFactory.getLogger(VideoMain.class);

    public static void main(String[] args) throws Exception {
        if (args == null || args[0] == null || args[0].equalsIgnoreCase("")) {
            log.error("please input source video url.");
            return;
        }
        Video video = new Video(Path.of(args[0]));
        if (video.isVideo()) {
            String convert2Mp4 = video.convert2Mp4();
            System.out.println(convert2Mp4);
        }
    }
}
