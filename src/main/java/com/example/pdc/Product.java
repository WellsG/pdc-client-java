package com.example.pdc;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Product implements Serializable {

	private static final long serialVersionUID = 2665380839200548216L;

	private String name;
	@SerializedName("short")
	private String shortName;
	private Boolean active;
	private List<String> versions;

	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public List<String> getVersions() {
		return versions;
	}
	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", shortName=" + shortName
				+ ", active=" + active + ", versions=" + versions + "]";
	}

}
