package org.epragati.service.enclosure.vo;

import java.util.List;

public class ImageParentVO {

	private List<ImageVO> children;
	private String title;
	private String key;
	public List<ImageVO> getChildren() {
		return children;
	}
	public void setChildren(List<ImageVO> children) {
		this.children = children;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
 