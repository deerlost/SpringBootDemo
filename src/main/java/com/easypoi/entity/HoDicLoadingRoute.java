package com.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class HoDicLoadingRoute implements Serializable {
	private static final long serialVersionUID = 5481451050472004348L;
	@Excel(name = "路线编号", height = 10, width = 15,needMerge = true,mergeVertical = true)
	private String loadingRouteCode;

	@Excel(name = "路线名称", height = 10, width = 15,needMerge = true,mergeVertical = true)
	private String loadingRouteName;

	@Excel(name = "工厂编号", height = 10, width = 15,needMerge = true,mergeVertical = true)
	private String ftyCode;
	@Excel(name = "提货方式", height = 10, width = 15,needMerge = true,mergeVertical = true)
	private String deliveryMethod;

	private Byte isDelete;

	private Date createTime;

	private Date modifyTime;

	private Integer createUserId;

	private Integer modifyUserId;
	@Excel(name = "转车组", height = 10, width = 15,needMerge = true,mergeVertical = true)
	private String loadingGroupCode;

	@Excel(name = "装车组描述", height = 10, width = 15,needMerge = true,mergeVertical = true)
	private String loadingGroupName;

	private String hoLoadingRouteExt0;

	private String hoLoadingRouteExt1;

	private String hoLoadingRouteExt2;

	@ExcelCollection(name = "经销商")
	private List<HoDicLoadingRoutePartner> hoDicLoadingRoutePartnerList;

	public String getLoadingRouteCode() {
		return loadingRouteCode;
	}

	public void setLoadingRouteCode(String loadingRouteCode) {
		this.loadingRouteCode = loadingRouteCode == null ? null : loadingRouteCode.trim();
	}

	public String getLoadingRouteName() {
		return loadingRouteName;
	}

	public void setLoadingRouteName(String loadingRouteName) {
		this.loadingRouteName = loadingRouteName == null ? null : loadingRouteName.trim();
	}

	public String getFtyCode() {
		return ftyCode;
	}

	public void setFtyCode(String ftyCode) {
		this.ftyCode = ftyCode == null ? null : ftyCode.trim();
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod == null ? null : deliveryMethod.trim();
	}

	public Byte getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Byte isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Integer modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getHoLoadingRouteExt0() {
		return hoLoadingRouteExt0;
	}

	public void setHoLoadingRouteExt0(String hoLoadingRouteExt0) {
		this.hoLoadingRouteExt0 = hoLoadingRouteExt0 == null ? null : hoLoadingRouteExt0.trim();
	}

	public String getHoLoadingRouteExt1() {
		return hoLoadingRouteExt1;
	}

	public void setHoLoadingRouteExt1(String hoLoadingRouteExt1) {
		this.hoLoadingRouteExt1 = hoLoadingRouteExt1 == null ? null : hoLoadingRouteExt1.trim();
	}

	public String getHoLoadingRouteExt2() {
		return hoLoadingRouteExt2;
	}

	public void setHoLoadingRouteExt2(String hoLoadingRouteExt2) {
		this.hoLoadingRouteExt2 = hoLoadingRouteExt2 == null ? null : hoLoadingRouteExt2.trim();
	}

	public String getLoadingGroupCode() {
		return loadingGroupCode;
	}

	public void setLoadingGroupCode(String loadingGroupCode) {
		this.loadingGroupCode = loadingGroupCode;
	}

	public String getLoadingGroupName() {
		return loadingGroupName;
	}

	public void setLoadingGroupName(String loadingGroupName) {
		this.loadingGroupName = loadingGroupName;
	}


	public List<HoDicLoadingRoutePartner> getHoDicLoadingRoutePartnerList() {
		return hoDicLoadingRoutePartnerList;
	}

	public void setHoDicLoadingRoutePartnerList(List<HoDicLoadingRoutePartner> hoDicLoadingRoutePartnerList) {
		this.hoDicLoadingRoutePartnerList = hoDicLoadingRoutePartnerList;
	}
}