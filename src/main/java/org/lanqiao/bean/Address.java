package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
    private int addId;       //地址Id
    private String addName;  //地址
    private String addCity;  //市
    private int addPostcode; //邮政编码
    private String addProvince; //省
}
