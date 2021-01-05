/*
 * Copyright (c) 2020 牧星仓库管理系统 All rights reserved.
 *
 * http://www.mushiny.com
 *
 * 版权所有，侵权必究！
 */

package com.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * 消息属性
 *
 * @author Elen elen.shen@mushiny.comn
 * @since 2.1.0
 */
public class SysMessagePropertyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Excel(name = "模块", height = 10, width = 15, needMerge = true, mergeVertical = true)
    private String messageGroup;
    @Excel(name = "代码", height = 10, width = 15, needMerge = true, mergeVertical = true)
    private String messageKey;
    /**
     * 语言
     */
    @Excel(name = "语言", height = 10, width = 15, needMerge = true, mergeVertical = true)
    private String locale;


    /**
     * 消息内容
     */
    @Excel(name = "内容", height = 10, width = 15, needMerge = true, mergeVertical = true)
    private String messageContent;

    public String getLocale() {
        return locale;
    }

    public SysMessagePropertyDTO setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getMessageGroup() {
        return messageGroup;
    }

    public SysMessagePropertyDTO setMessageGroup(String messageGroup) {
        this.messageGroup = messageGroup;
        return this;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public SysMessagePropertyDTO setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public SysMessagePropertyDTO setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
}
