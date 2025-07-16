package com.github.asynico.rivelavasrc.lastfm;

import com.github.asynico.lavasrc.mirror.MirroringAudioTrack;
import com.github.asynico.lavasrc.mirror.MirroringAudioSourceManager;
import com.sedmelluq.discord.lavaplayer.track.InternalAudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import com.sedmelluq.discord.lavaplayer.tools.io.SeekableInputStream;

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
    public InternalAudioTrack createAudioTrack(AudioTrackInfo trackInfo, SeekableInputStream inputStream) {
        return new LastfmAudioTrack(trackInfo, (MirroringAudioSourceManager) this.sourceManager);
    }
}
