package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
    private Integer addId;

    private String addName;

    private String addCity;

    private String addProvince;

    private String addPostcode;

    private Integer userId;


}