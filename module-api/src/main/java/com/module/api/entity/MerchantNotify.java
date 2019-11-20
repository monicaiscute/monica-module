package com.module.api.entity;

import lombok.Data;

import java.util.Date;
@Data
public class MerchantNotify {
    private String id;

    private String mOrderNo;

    private String description;

    private String status;

    private Date createDate;

    private Date updateDate;
    private long userId;
    private long orgId;
}
