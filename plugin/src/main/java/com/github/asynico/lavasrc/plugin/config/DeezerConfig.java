package com.github.asynico.rivelavasrc.plugin.config;

import com.github.asynico.rivelavasrc.deezer.DeezerAudioTrack;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "plugins.rivelavasrc.deezer")
@Component
public class DeezerConfig {

	private String masterDecryptionKey;
	private String arl;
	private DeezerAudioTrack.TrackFormat[] formats;

	public String getMasterDecryptionKey() {
		return this.masterDecryptionKey;
	}

	public void setMasterDecryptionKey(String masterDecryptionKey) {
		this.masterDecryptionKey = masterDecryptionKey;
	}

	public String getArl() {
		return this.arl;
	}

	public void setArl(String arl) {
		this.arl = arl;
	}

	public DeezerAudioTrack.TrackFormat[] getFormats() {
		return this.formats;
	}

	public void setFormats(DeezerAudioTrack.TrackFormat[] formats) {
		this.formats = formats;
	}

}
