package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Solve {
    private Integer id;

    private String houseId;

    private Date date;

    private Integer userlistId;

    private String status;

    private String detail;

    private Houselist houselist;

    private Userlist userlist;
}