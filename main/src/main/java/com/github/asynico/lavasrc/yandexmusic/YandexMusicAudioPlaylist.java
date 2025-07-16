package com.github.asynico.rivelavasrc.yandexmusic;

import com.github.asynico.rivelavasrc.ExtendedAudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;

import java.util.List;

public class YandexMusicAudioPlaylist extends ExtendedAudioPlaylist {

	public YandexMusicAudioPlaylist(String name, List<AudioTrack> tracks, ExtendedAudioPlaylist.Type type, String url, String artworkURL, String author, Integer totalTracks) {
		super(name, tracks, type, url, artworkURL, author, totalTracks);
	}

}
