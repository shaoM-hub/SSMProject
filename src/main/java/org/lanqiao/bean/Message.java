package org.lanqiao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class Message {
    private Integer magId;      //评价id

    private Integer userId;      //用户id

    private BigDecimal magScore;      //用户评分

    private String magContent;          //评价内容

    private Integer attId;          //景区id

    private String magName;       //评价人姓名

    private String magEmail;        //评价人邮箱

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date magDate;       //评价时间

    private String magNationality;  //国籍

}