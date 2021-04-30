package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Checkout {
    private Integer cid;

    private String houseId;

    private Integer userlistId;

    private Houselist houselist;

    private Userlist userlist;
}