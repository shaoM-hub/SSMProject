package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Message {
    private int magId;           //评价Id
    private int userId;
    private int magScore;        //用户评价
    private String magContent;   //评价内容
    private int attId;    //景区Id
}
