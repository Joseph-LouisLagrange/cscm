package com.darwin.cscm.entity;

import com.darwin.cscm.constant.CommodityEnum;
import lombok.Data;

// 商品
@Data
public class Commodity {
    private long id;

    private String name;

    private String detail;

    private CommodityCategory commodityCategory;

    private PurchaseRecord purchaseRecord;

    private CommodityEnum state;

    private long inventoryCount;

    private String pictureUrl;
}
