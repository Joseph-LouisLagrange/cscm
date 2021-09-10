package com.darwin.cscm.entity;

import lombok.Data;

import java.time.LocalDateTime;

// 退货记录
@Data
public class ReturnRecord {
    private long id;

    private LocalDateTime returnTime;

    private String reason;

}
