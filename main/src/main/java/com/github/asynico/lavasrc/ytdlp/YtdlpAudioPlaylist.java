package com.github.asynico.rivelavasrc.ytdlp;

import com.github.asynico.lavasrc.ExtendedAudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;

import java.util.List;

public class YtdlpAudioPlaylist extends ExtendedAudioPlaylist {

	public YtdlpAudioPlaylist(String name, List<AudioTrack> tracks, Type type, String url, String artworkURL, String author, Integer totalTracks) {
		super(name, tracks, type, url, artworkURL, author, totalTracks);
	}

}
