package com.frank.ffmpeg;

public class StudyFFmpeg {
    static{
        System.loadLibrary("media-handle");
    }
    //using AudioTrack to play
    public native void studyDemuxer(String audioPath);
}
