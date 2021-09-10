package com.darwin.cscm.entity;

import lombok.Data;

import java.time.LocalDateTime;

// 商品退货记录
@Data
public class SalesReturnRecord {
    private long id;

    private LocalDateTime returnTime;

    private String reason;

    private Commodity commodity;
}
