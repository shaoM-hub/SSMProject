package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Attractions {
    private Integer attId;

    private String attName;

    private String attImg;

    private String attRegion;

    private String attDesc;

    private Integer attPrice;

    private BigDecimal attStar;

}