package com.example.pdc;

import java.io.Serializable;

public class ReleaseComponent implements Serializable {

	private static final long serialVersionUID = 8226891749592921176L;

	private Integer id;
	private String name;
	private String url;
	private Release release;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Release getRelease() {
		return release;
	}
	public void setRelease(Release release) {
		this.release = release;
	}

}
