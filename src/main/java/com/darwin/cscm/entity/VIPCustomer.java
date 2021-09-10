package com.darwin.cscm.entity;

import lombok.Data;

// 客户
@Data
public class VIPCustomer {
    private long id;

    private String name;

    private String phone;

    private String email;

    private String vipId;
}
