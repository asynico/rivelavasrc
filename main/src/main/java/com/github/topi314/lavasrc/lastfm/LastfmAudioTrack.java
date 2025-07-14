package com.github.topi314.lavasrc.lastfm;

import com.github.topi314.lavasrc.mirror.MirroringAudioTrack;
import com.github.topi314.lavasrc.mirror.MirroringAudioSourceManager;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import com.sedmelluq.discord.lavaplayer.container.common.SeekableInputStream;

public class LastfmAudioTrack extends MirroringAudioTrack {

    public LastfmAudioTrack(AudioTrackInfo trackInfo, MirroringAudioSourceManager sourceManager) {
        super(trackInfo, 
              trackInfo.artworkUrl,    
              trackInfo.title,       
              trackInfo.author,       
              trackInfo.uri,          
              trackInfo.identifier,   
              trackInfo.isStream,      
              sourceManager);      
    }

    @Override
    public AudioTrack createAudioTrack(AudioTrackInfo trackInfo, SeekableInputStream inputStream) {
        return new LastfmAudioTrack(trackInfo, (MirroringAudioSourceManager) this.sourceManager);
    }
}
