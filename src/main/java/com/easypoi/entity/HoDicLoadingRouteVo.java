package com.easypoi.entity;

/**
 *@author    created by liguoming
 *@date  2019年9月24日---上午10:01:15
 *@problem
 *@answer
 *@action
 */
public class HoDicLoadingRouteVo extends HoDicLoadingRoute {

	private Integer totalCount;

	private String ftyName;

	public HoDicLoadingRouteVo() {
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getFtyName() {
		return ftyName;
	}

	public void setFtyName(String ftyName) {
		this.ftyName = ftyName;
	}

}
