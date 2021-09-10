package com.darwin.cscm.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CommodityEnum {
    PUT_ON_THE_SHELF("上架"),OFF_SHELF("下架"),RETURNED("已退货");

    @JsonValue
    private String state;
    CommodityEnum(String state){
        this.state=state;
    }

    @JsonCreator
    public static CommodityEnum from(String state){
        switch (state){
            case "上架":return PUT_ON_THE_SHELF;
            case "下架":return OFF_SHELF;
            case "已退货":return RETURNED;
            default:return null;
        }
    }
}
