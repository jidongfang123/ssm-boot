package com.kdx.util;

import java.util.ArrayList;
import java.util.List;

public class PageAssitant<T> {
	/** �ܼ�¼�� */
	private Integer count = 0;
	/** ��ҳ�� */
	private Integer totalPage = 0;
	/** ҳ���С */
	private Integer pageSize = 9;
	/** ��ǰҳ�� */
	private Integer currPage = 1;
	/** ��ǰҳ��ʼ��¼��� */
	private Integer currStart = 0;
	/** ҳ��ҳ�� */
	private Integer pageNum = 1;
	
	/** ��ǰҳ�����ݼ��� */
	List<T> items = new ArrayList<T>();
	
	public PageAssitant() {
	}

	/** ��ȡ�ܼ�¼�� */
	public Integer getCount() {
		return count;
	}
	/** �����ܼ�¼��,ͬʱ������ҳ�� */
	public void setCount(Integer count) {
		this.count = count;
		setTotalPage();//��ҳ��
	}
	
	/** ��ȡ��ҳ�� */
	public Integer getTotalPage() {
		return totalPage;
	}
	
	/** ������ҳ��
	 * �� �ܼ�¼�� / ҳ���С ������ */
	private void setTotalPage() {
		totalPage = count / pageSize;
		if(count % pageSize != 0){
			totalPage++;
		}
	}
	
	/** ��ȡҳ���С */
	public Integer getPageSize() {
		return pageSize;
	}
	/** ����ҳ���С<br>
	 * ͬʱ������ҳ�� �� ��ǰҳ����ʼ��¼�� */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		setTotalPage();//��ҳ��
		setCurrStart();//��ǰҳ����ʼ��
	}
	
	/** ��ȡ��ǰҳ�� */
	public Integer getCurrPage() {
		return currPage;
	}
	/** ���õ�ǰҳ��<br>
	 * ͬʱ���õ�ǰҳ�����ʼ�� */
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
		setCurrStart();//��ǰҳ����ʼ��
	}
	
	/** ��ȡ��ǰҳ����ʼ�� */
	public Integer getCurrStart() {
		return currStart;
	}
	/** ���õ�ǰҳ����ʼ��
	 * ��ǰҳ-1 * ҳ���С  + 1 */
	private void setCurrStart() {
		currStart = (currPage - 1) * pageSize;
	}

	/** ��ȡ��ǰҳ�����ݼ��� */
	public List<T> getItems(){
		return items;
	}
	/** ���õ�ǰҳ�����ݼ��� */
	public void setItems(List<T> items) {
		this.items = items;
	}
}
