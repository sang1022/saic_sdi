package com.saic.ndms.sdi.common.dto;

import java.io.Serializable;

/**
 * 类型Bean
 * 
 * @author Administrator
 *
 */
public class TypeDTO implements Serializable {

	private static final long serialVersionUID = -2687696607238221075L;

	private String id;
	private String text;
	@SuppressWarnings("unused")
	private String label;
	@SuppressWarnings("unused")
	private String value;

	public String getLabel() {
		return text;
	}

	public void setLabel(String label) {
		this.label = text;
	}

	public String getValue() {
		return id;
	}

	public void setValue(String value) {
		this.value = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}