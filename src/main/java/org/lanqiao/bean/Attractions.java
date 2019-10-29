package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Attractions {
    private int attId;    //景点Id;
    private String attName;   //景点名字
    private String attImg;
    private String attRegion;
    private String attDesc;
    private int attPrice;   //景点价格
    private int attStar;    //景点级别

}
