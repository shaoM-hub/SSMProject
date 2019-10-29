package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {
    private int ordId;  //订单Id
    private int userId; //用户Id
    private int attId;  //景区Id
}
