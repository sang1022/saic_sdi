package com.saic.ndms.sdi.common.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseBean<T> implements Serializable {

	private static final long serialVersionUID = 7045399825524706826L;

	private long totalSize;

	private ArrayList<T> data;

	public final long getTotalSize() {
		return totalSize;
	}

	public final void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

	public final List<T> getData() {
		return data;
	}

	public final void setData(List<T> data) {
		this.data = (ArrayList<T>) data;
	}

}
