package com.saic.ndms.sdi.common.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.saic.ndms.sdi.common.utils.CommonsUtils;

/**
 * 邮件发送Bean
 * 
 * @author Administrator
 *
 */
public class EmailBean {

	private String appId;
	private Long userId;
	private String from;
	private List<String> to = new ArrayList<String>();
	private List<String>  cc = new ArrayList<String>();
	private List<String> bcc = new ArrayList<String>();
	private String subject;
	private String html;
	private List<HashMap<String, String>> attachments = new ArrayList<HashMap<String, String>>();

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("to")
	public String getTo() {
		return CommonsUtils.list2String(to,";");
	}

	public void addTo(String to) {
		this.to.add(to);
	}
	@JsonProperty("cc")
	public String getCc() {
		return CommonsUtils.list2String(cc,";");
	}

	public void addCc(String cc) {
		this.cc.add(cc);
	}

	@JsonProperty("bcc")
	public String getBcc() {
		return CommonsUtils.list2String(bcc,";");
	}

	public void addBcc(String bcc) {
		this.bcc.add(bcc);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public List<HashMap<String, String>> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<HashMap<String, String>> attachments) {
		this.attachments = attachments;
	}

}
