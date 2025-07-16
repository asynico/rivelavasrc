package com.github.asynico.rivelavasrc.applemusic;

import com.github.asynico.lavasrc.ExtendedAudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;

import java.util.List;

public class AppleMusicAudioPlaylist extends ExtendedAudioPlaylist {

	public AppleMusicAudioPlaylist(String name, List<AudioTrack> tracks, Type type, String identifier, String artworkURL, String author, Integer totalTracks) {
		super(name, tracks, type, identifier, artworkURL, author, totalTracks);
	}

}
