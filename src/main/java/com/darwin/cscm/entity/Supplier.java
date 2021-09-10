package com.darwin.cscm.entity;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

// 供应商
@Data
public class Supplier {
    private long id;
    // 可以提供的商品
    private Set<Commodity> commodities=new HashSet<>();

    private String name;

    private String address;

    private String phone;
}
