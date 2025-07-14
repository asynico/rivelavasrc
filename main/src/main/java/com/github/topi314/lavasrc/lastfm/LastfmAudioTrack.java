package com.github.topi314.lavasrc.lastfm;

import com.github.topi314.lavasrc.mirror.MirroringAudioTrack;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManager;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;

public class LastfmAudioTrack extends MirroringAudioTrack {

    public LastfmAudioTrack(AudioTrackInfo trackInfo, AudioSourceManager sourceManager) {
        super(trackInfo, sourceManager);
    }
}
