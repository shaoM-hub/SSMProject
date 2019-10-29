package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Blogs {
    private int blogsId;
    private String blogsName;
    private String blogsSort;      //博客分类
    private Date blogsDate;        //发帖时间
    private String blogsContent;   //博客内容
}
