package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private int userId;
    private String userName;
    private String userPass;
    private String userEmail;
}
