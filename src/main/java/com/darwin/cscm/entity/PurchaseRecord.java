package com.darwin.cscm.entity;

import com.darwin.cscm.entity.sys.User;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


// 进货记录
@Data
public class PurchaseRecord {
    @Data
    static class PurchaseCommodityDetail{
        private Commodity commodity;

        private long count;

        private double unitPrice;
    }
    private long id;

    private LocalDateTime purchaseTime;

    private Supplier supplier;

    private List<PurchaseCommodityDetail> purchaseCommodityDetails;

    private User updater;

    private LocalDateTime updateTime;

    public BigDecimal getTotalPrice(){
        return purchaseCommodityDetails.stream()
                .mapToDouble(p-> p.unitPrice*p.count)
                .mapToObj(BigDecimal::new)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

}
