package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Administrator {
    private int admId;
    private String admName;
    private String admPass;
}
