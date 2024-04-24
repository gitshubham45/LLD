package ThirdPartyYoutubeLib;

import java.util.HashMap;

import VideoClass.Video;


public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}