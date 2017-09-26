package com.situ.ssm.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;

public class PageBean<T> implements Serializable{
	 // ��ǰ ?
   private Integer pageIndex;
   // ��ǰҳ��ʾ������
   private Integer pageSize;
   // ���� ?
   private Integer totalCount;
   // ��ҳ ?
   private Integer totalPage;
   // ��ǰҳҪ��ʾ���� ?
   private List<T> list = (List<T>) new ArrayList<Student>();

	
   public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	

}

