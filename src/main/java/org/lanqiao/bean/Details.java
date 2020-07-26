package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Details {
    private Integer detId;

    private Integer userId;

    private String detName;

    private String detType;

    private String detSex;

    private String detData;

    private String detEmail;

    private String detPhone;

    private String detNationality;

    private String detStart;

    private String detEnd;


}