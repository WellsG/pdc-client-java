package com.example.pdc;

import java.io.Serializable;

public class GlobalComponent implements Serializable {

	private static final long serialVersionUID = -4465979609639501575L;

	private String name;
	private String distGitPath;
	private String url;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistGitPath() {
		return distGitPath;
	}
	public void setDistGitPath(String distGitPath) {
		this.distGitPath = distGitPath;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
