package com.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.Date;

@ExcelTarget("HoDicLoadingRoutePartner ")
public class HoDicLoadingRoutePartner {
    private Integer loadingRouteId;

    private String loadingRouteCode;

    @Excel(name = "经销商编号", height = 20, width = 30)
    private String partnerCode;

    @Excel(name = "经销商名称", height = 20, width = 30)
    private String partnerName;

    @Excel(name = "装车顺序", height = 20, width = 30)
    private Integer loadingSequence;

    @Excel(name = "是否固定", height = 20, width = 30)
    private Integer isFixedSequences;


    public Integer getIsFixedSequences() {
        return isFixedSequences;
    }

    public HoDicLoadingRoutePartner setIsFixedSequences(Integer isFixedSequences) {
        this.isFixedSequences = isFixedSequences;
        return this;
    }

    private Byte isDelete;

    private Date createTime;

    private Date modifyTime;

    private Integer createUserId;

    private Integer modifyUserId;

    private String hoLoadingRoutePartnerExt0;

    private String hoLoadingRoutePartnerExt1;

    private String hoLoadingRoutePartnerExt2;

    public HoDicLoadingRoutePartner() {
    }

    public Integer getLoadingRouteId() {
        return loadingRouteId;
    }

    public void setLoadingRouteId(Integer loadingRouteId) {
        this.loadingRouteId = loadingRouteId;
    }

    public String getLoadingRouteCode() {
        return loadingRouteCode;
    }

    public void setLoadingRouteCode(String loadingRouteCode) {
        this.loadingRouteCode = loadingRouteCode == null ? null : loadingRouteCode.trim();
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }



    public Integer getLoadingSequence() {
        return loadingSequence;
    }

    public void setLoadingSequence(Integer loadingSequence) {
        this.loadingSequence = loadingSequence;
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

    public String getHoLoadingRoutePartnerExt0() {
        return hoLoadingRoutePartnerExt0;
    }

    public void setHoLoadingRoutePartnerExt0(String hoLoadingRoutePartnerExt0) {
        this.hoLoadingRoutePartnerExt0 = hoLoadingRoutePartnerExt0 == null ? null : hoLoadingRoutePartnerExt0.trim();
    }

    public String getHoLoadingRoutePartnerExt1() {
        return hoLoadingRoutePartnerExt1;
    }

    public void setHoLoadingRoutePartnerExt1(String hoLoadingRoutePartnerExt1) {
        this.hoLoadingRoutePartnerExt1 = hoLoadingRoutePartnerExt1 == null ? null : hoLoadingRoutePartnerExt1.trim();
    }

    public String getHoLoadingRoutePartnerExt2() {
        return hoLoadingRoutePartnerExt2;
    }

    public void setHoLoadingRoutePartnerExt2(String hoLoadingRoutePartnerExt2) {
        this.hoLoadingRoutePartnerExt2 = hoLoadingRoutePartnerExt2 == null ? null : hoLoadingRoutePartnerExt2.trim();
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }


}