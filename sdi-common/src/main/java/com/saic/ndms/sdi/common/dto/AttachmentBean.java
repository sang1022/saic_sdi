package com.saic.ndms.sdi.common.dto;

import java.io.Serializable;

/**
 * 文件Bean
 * 
 * @author Administrator
 *
 */
public class AttachmentBean implements Serializable {

	private static final long serialVersionUID = -616899090291696804L;

	private Long id;
	private String fileName;
	private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
