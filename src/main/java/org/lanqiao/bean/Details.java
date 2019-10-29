package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Details {
    private int detId;   //旅客Id;
    private int userId;
    private String detName;
    private String detType;      //成人、儿童
    private String detSex;
    private Date detDate;
    private String detEmail;
    private String detPhone;
    private String detNationality; //国籍
    private String detStart;       //出发地址
    private String detEnd;         //目的地
}
