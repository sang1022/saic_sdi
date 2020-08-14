package com.saic.ndms.sdi.common.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;


public class ResponseDemoBean<T>  {

	private static final long serialVersionUID = 7045399825524706826L;

	private long totalSize;
	
	private int pageNum;
	
	private int pageSize;
	
	private int size;
	
	private int startRow;
	
	private int endRow;
	
	private int total;
	
	private int pages;
	
	private int prePage;
	
	private int nextPage;
	
	private boolean isFirstPage;
	
	
	private boolean isLastPage;
	
	private boolean hasNextPage;
	
	private int navigatePages;
	
	private Object navigatepageNums;
	
	private int navigateFirstPage;
	
	private int navigateLastPage;
	
	private int firstPage;
	
	private int lastPage;
	

	private ArrayList<T> list;
	
	public final List<T> getList() {
		return list;
	}

	public final void setList(List<T> data) {
		this.list = (ArrayList<T>) data;
	}


	public final long getTotalSize() {
		return totalSize;
	}

	public final void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrePage() {
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public boolean isFirstPage() {
		return isFirstPage;
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public int getNavigatePages() {
		return navigatePages;
	}

	public void setNavigatePages(int navigatePages) {
		this.navigatePages = navigatePages;
	}

	public Object getNavigatepageNums() {
		return navigatepageNums;
	}

	public void setNavigatepageNums(Object navigatepageNums) {
		this.navigatepageNums = navigatepageNums;
	}

	public int getNavigateFirstPage() {
		return navigateFirstPage;
	}

	public void setNavigateFirstPage(int navigateFirstPage) {
		this.navigateFirstPage = navigateFirstPage;
	}

	public int getNavigateLastPage() {
		return navigateLastPage;
	}

	public void setNavigateLastPage(int navigateLastPage) {
		this.navigateLastPage = navigateLastPage;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}


	
}
