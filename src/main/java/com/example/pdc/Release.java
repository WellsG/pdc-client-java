package com.example.pdc;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Release implements Serializable {

	private static final long serialVersionUID = -4472609104690448251L;

	@SerializedName("release_id")
	private String releaseId;

	@SerializedName("short")
	private String shortName;
	private String version;

	public String getReleaseId() {
		return releaseId;
	}
	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
